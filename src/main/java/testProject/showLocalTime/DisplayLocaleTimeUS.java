package testProject.showLocalTime;

import testProject.DefineTimeLocal.DefineTimePartDay;
import testProject.myCash.CashMap;
import testProject.processing.MyException;
import testProject.processing.RunnerStructure;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 10.10.2016.
 */
@Component
public class DisplayLocaleTimeUS implements IDisplay_LT {
    @Autowired
    CashMap cashMap;

    @Autowired
    DefineTimePartDay partDay_defineTime;

    @Autowired
    RunnerStructure runner;

    String print;

    @Override
    public String getPartTime(){

        String s1 = partDay_defineTime.getPartDay();

        if(StringUtils.isBlank(s1)){
            throw new MyException();
        }

        print =  cashMap.getTimeUS(s1);
        return print;
    }

    @Override
    public void showCurrentDateTime() {
        System.out.println("Current locale American : "+ runner.getLocal_st);
        System.out.println(getPartTime());
    }

}
