package testProject.service;

import testProject.showLocalTime.DisplayLocaleTimeRU;
import testProject.showLocalTime.DisplayLocaleTimeUK;
import testProject.showLocalTime.DisplayLocaleTimeUS;
import testProject.showLocalTime.IDisplay_LT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 11.10.2016.
 */
@Component
public class DisplayHello {


    @Autowired
    DisplayLocaleTimeUS display_lt_en;
    @Autowired
    DisplayLocaleTimeUK display_lt_uk;
    @Autowired
    DisplayLocaleTimeRU display_lt_ru;


    public void displayHello(IDisplay_LT lt){
       lt.showCurrentDateTime();
    }
}
