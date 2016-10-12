package ardasProject.showLocalTime;

import ardasProject.DefineTimeLocal.DefineTimePartDay;
import ardasProject.myCash.CashMap;
import ardasProject.processing.MyException;
import ardasProject.processing.RunnerStructure;
import ardasProject.service.ClientSettings;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 10.10.2016.
 */
@Component
public class DisplayLocaleTimeUK implements IDisplay_LT {
    @Autowired
    CashMap cashMap;

    @Autowired
    DefineTimePartDay partDay_defineTime;

    @Autowired
    RunnerStructure runner;

    @Autowired
    ClientSettings clientSettings;

    String print, print_loc;

    @Override
    public String getPartTime(){

        String s1 = partDay_defineTime.getPartDay();

        if(StringUtils.isBlank(s1)){
            throw new MyException();
        }

        print =  cashMap.getTimeUK(s1);
        return print;
    }

    @Override
    public void showCurrentDateTime() {
        System.out.println("Поточна локаль Українська : "+ runner.getLocal_st);
        System.out.println(getPartTime());
    }

}