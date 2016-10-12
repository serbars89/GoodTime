package ardasProject.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by Ser on 07.10.2016.
 */
@Component
public class ClientSettings {

    private static Logger LOG = LoggerFactory.getLogger(ClientSettings.class);
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public boolean cl_settings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose a way definition of a locale,  ");
        System.out.println("  for example:   automatic -  a");
        System.out.println("manual -  any other letter for example: (d,f,g,h,t,r,e....)");
        System.out.println("");
        String df_line = scanner.next();
        LOG.debug("ClientSettings.class variable value  df_line  : {}", gson.toJson(df_line));
        df_line.trim();
        df_line.toLowerCase();
        if(df_line.equals("a")){return true;}
        return false;

    }

}
