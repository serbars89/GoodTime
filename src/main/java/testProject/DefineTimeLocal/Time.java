package testProject.DefineTimeLocal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * Created by Ser on 02.10.2016.
 */
@Component
public class Time {

    private static   Logger LOG = LoggerFactory.getLogger(Time.class);
    private static  Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    public void showDateTime() {

        System.out.println();
        System.out.println();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        LOG.debug("variable value  Calendar  : {}", gson.toJson(cal));
        System.out.print("Current date rnd time :");
        System.out.println("    "+dateFormat.format(cal.getTime()));
    }

    @Bean
    public Long currentTime(){

        Duration between ;
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        LOG.debug("variable value  localDateTime : {}", gson.toJson(localDateTime));
        between = Duration.between(localDateTime, LocalDateTime.now()).abs();
        LOG.debug("variable value  between : {}", gson.toJson(between));
        return between.getSeconds();

    }

}
