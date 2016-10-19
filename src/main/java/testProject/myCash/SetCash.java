package testProject.myCash;

import testProject.processing.MyException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by Ser on 06.10.2016.
 */
@Component
public class SetCash {

    public String line_k;
    public String line_v;



    @Autowired
    CashMap cashMap;


    private static Logger LOG = LoggerFactory.getLogger(SetCash.class);
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public MyException crashMethod (ResourceBundle bundle){
        if(bundle==null){
            throw new MyException();
        }
        return null;
    }


    public void setCashMapRU(){

        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_ru_RU");

        crashMethod(bundle);
        Enumeration<String> enumeration = bundle.getKeys();

        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            LOG.debug("variable value line_k : {}", gson.toJson(line_k));
            LOG.debug("variable value line_v : {}", gson.toJson(line_v));
            cashMap.putTimeRU(line_k, line_v);
        }

}

    public void setCashMapUS(){

        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_en_US");

        crashMethod(bundle);
        Enumeration<String> enumeration = bundle.getKeys();

        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            LOG.debug("variable value line_k : {}", gson.toJson(line_k));
            LOG.debug("variable value line_v : {}", gson.toJson(line_v));
            cashMap.putTimeUS(line_k, line_v);
        }

    }


    public void setCashMapUK(){

        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_uk_Uk");

        crashMethod(bundle);
        Enumeration<String> enumeration = bundle.getKeys();

        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            LOG.debug("variable value line_k : {}", gson.toJson(line_k));
            LOG.debug("variable value line_v : {}", gson.toJson(line_v));
            cashMap.putTimeUK(line_k, line_v);
        }

    }
}
