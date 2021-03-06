package testProject.service;

import testProject.processing.MyException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Ser on 06.10.2016.
 */
@Component
public class GetLocal {

    public static final String RU = "ru" ;
    public static final String US = "en" ;
    public static final String UK = "uk" ;

    private static Logger LOG = LoggerFactory.getLogger(GetLocal.class);
    private static Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public String local;
    Region region;
    String line;

    public String getEnterLocale(){
        int count =0;
        Scanner scanner = new Scanner(System.in);

        while (!((region.en.name().equals(line)) || (region.uk.name().equals(line)) ||(region.ru.name().equals(line)))){
            if(count > 0) {
                System.out.println("Pleas enter correct name local");
            }else{
            System.out.println("please enter current locale , for example:  ru , en , uk ");}
            line = scanner.next();
            line.trim();
            line.toLowerCase();
            count++;
        }

        LOG.debug("variable value line : {}", gson.toJson(line));

        if(StringUtils.isBlank(line)){
            throw new MyException();
        }

        if(line.equals(RU)){
            local = "ru_RU";
        }

        if(line.equals(US)){
            local = "en_US";
        }

        if(line.equals(UK)){
            local = "uk_UK";
        }
        LOG.debug("variable value local : {}", gson.toJson(local));
        return local;
    }


    public String getCurrentLocale(){
        Locale currentlocale = Locale.getDefault( );
        String ss = currentlocale.toString();
        local = ss;
        LOG.debug("variable value local : {}", gson.toJson(local));
        return ss;
    }

}
