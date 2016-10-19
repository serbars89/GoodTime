package testProject.myCash;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by Ser on 06.10.2016.
 */
@Component
public class CashMap {

    HashMap<String,String>defineTimeUS = new HashMap<String,String>();
    HashMap<String,String>defineTimeUK = new HashMap<String,String>();
    HashMap<String,String>defineTimeRU = new HashMap<String,String>();

    public void putTimeUS(String time, String message){
        defineTimeUS.put(time, message);
    }

    public void putTimeUK(String time, String message){
        defineTimeUK.put(time, message);
    }

    public void putTimeRU(String time, String message){
        defineTimeRU.put(time, message);
    }

    public String getTimeUS(String time){
        return defineTimeUS.get(time);
    }

    public String getTimeUK(String time){
        return defineTimeUK.get(time);
    }

    public String getTimeRU(String time){
        return defineTimeRU.get(time);
    }
}
