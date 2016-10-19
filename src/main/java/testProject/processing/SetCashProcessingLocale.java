package testProject.processing;

import testProject.myCash.SetCash;
import testProject.service.GetLocal;
import testProject.service.LocaleCurrent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 06.10.2016.
 */
@Component
public class SetCashProcessingLocale {

    @Autowired
    SetCash setCash;

    @Autowired
    GetLocal getLocal;

    private static Logger LOG = LoggerFactory.getLogger(SetCashProcessingLocale.class);
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public void localeDefinition(){

        String s = getLocal.local;

        if(s.isEmpty()){
            throw new MyException();
        }

        if (s.equals(LocaleCurrent.en_US.name())){
            setCash.setCashMapUS();
        }
        if (s.equals(LocaleCurrent.uk_UK.name())){
            setCash.setCashMapUK();
        }
        if (s.equals(LocaleCurrent.ru_RU.name())){
            setCash.setCashMapRU();
        }

    }


}
