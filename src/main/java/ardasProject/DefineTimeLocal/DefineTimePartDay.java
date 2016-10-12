package ardasProject.DefineTimeLocal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 02.10.2016.
 */
@Component
public class DefineTimePartDay {

   @Autowired
   public Time time;

    String lang;

    private static Logger LOG = LoggerFactory.getLogger(DefineTimePartDay.class);
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public String getPartDay() {

        long current_time = time.currentTime();

        LOG.debug("variable value current_time : {}", gson.toJson(current_time));

        if (0l <= current_time && current_time < 21600l){
            lang = "night";
        }
        if (21600l <= current_time && current_time<32400l){
            lang = "morning";
        }
        if (32400l <= current_time && current_time<68400l){
            lang = "day";
        }
        if (68400l <= current_time && current_time<82800l){
            lang = "evening";
        }
        if (82800l <= current_time && current_time<=86400l){
            lang = "night";
        }
        LOG.debug("variable value lang : {}", gson.toJson(lang));
        return lang;
    }

}
