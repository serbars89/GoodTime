package ardasProject.service;

import ardasProject.showLocalTime.DisplayLocaleTimeRU;
import ardasProject.showLocalTime.DisplayLocaleTimeUK;
import ardasProject.showLocalTime.Display_LT_US;
import ardasProject.showLocalTime.IDisplay_LT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 11.10.2016.
 */
@Component
public class DisplayHello {


    @Autowired
    Display_LT_US display_lt_en;
    @Autowired
    DisplayLocaleTimeUK display_lt_uk;
    @Autowired
    DisplayLocaleTimeRU display_lt_ru;


    public void displayHello(IDisplay_LT lt){
       lt.showCurrentDateTime();
    }
}
