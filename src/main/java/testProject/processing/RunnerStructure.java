package testProject.processing;

import testProject.DefineTimeLocal.Time;
import testProject.service.ClientSettings;
import testProject.service.GetLocal;
import testProject.service.LocaleCurrent;
import testProject.showLocalTime.DisplayLocaleTimeRU;
import testProject.showLocalTime.DisplayLocaleTimeUK;
import testProject.showLocalTime.DisplayLocaleTimeUS;
import testProject.showLocalTime.IDisplay_LT;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 11.10.2016.
 */
@Component
public class RunnerStructure {

    @Autowired
    SetCashProcessingLocale setCashProcessingLocale;

    @Autowired
    ClientSettings clientSettings;

    @Autowired
    GetLocal getLocal;

    @Autowired
    DisplayLocaleTimeUS display_lt_en;
    @Autowired
    DisplayLocaleTimeUK display_lt_uk;
    @Autowired
    DisplayLocaleTimeRU display_lt_ru;

    @Autowired
    Time time;

   public String getLocal_st;

    private static Logger LOG = LoggerFactory.getLogger(RunnerStructure.class);
    private static  Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public void runnerLocalCash(){
        boolean state = clientSettings.cl_settings();
        LOG.debug("current variable value true или false : {}  ", gson.toJson(state));

        if(state){
            getLocal_st = getLocal.getCurrentLocale();
            LOG.debug("variable value getLocal_st (automatic) : {}", gson.toJson(getLocal_st));
            setCashProcessingLocale.localeDefinition();

        }
         else{
            getLocal.getEnterLocale();
            LOG.debug("variable value getLocal_st (manually) : {}", gson.toJson(getLocal_st));
            getLocal_st = getLocal.local;
            setCashProcessingLocale.localeDefinition();

            }
    }

    public void show_t(){
        time.showDateTime();
    }

    public IDisplay_LT helloLocal(){

        if(StringUtils.isBlank(getLocal_st)){
            throw new MyException();
        }

        if(getLocal_st.equals(LocaleCurrent.en_US.name())){
            LOG.debug("object which was selected to display =  display_lt_en");
          return display_lt_en;
        }
        if(getLocal_st.equals(LocaleCurrent.uk_UK.name())){
            LOG.debug("object which was selected to display =  display_lt_uk");
            return display_lt_uk;
        }
        if(getLocal_st.equals(LocaleCurrent.ru_RU.name())){
            LOG.debug("object which was selected to display =  display_lt_ru");
            return display_lt_ru;
        }
        else{
            LOG.debug("Attention  ERROR !!!   object = NULL");
            throw new MyException();
        }

    }
}
