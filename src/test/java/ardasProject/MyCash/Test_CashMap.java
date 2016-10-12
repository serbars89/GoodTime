package ardasProject.MyCash;

import ardasProject.myCash.CashMap;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by Ser on 11.10.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/context_test.xml", "classpath:/spring/context.xml"})
public class Test_CashMap {

    @Autowired
    CashMap cashMap;

    private String line_k;
    private String line_v;


    @Test
    public void test_getTimeUS(){
        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_en_US");
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            cashMap.putTimeUS(line_k, line_v);
        }
        String st = cashMap.getTimeRU("day");
        Assert.assertNotNull(st);
    }

    @Test
    public void test_getTimeUK(){
        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_ru_RU");
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            cashMap.putTimeUK(line_k, line_v);
        }
        String st = cashMap.getTimeRU("night");
        Assert.assertNotNull(st);
    }

    @Test
    public void test_getTimeRU() {
        ResourceBundle bundle = ResourceBundle.getBundle("TestBundle_uk_Uk");
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            line_k = enumeration.nextElement();
            line_v = bundle.getString(line_k);
            cashMap.putTimeRU(line_k, line_v);
        }
        String st = cashMap.getTimeRU("morning");
        Assert.assertNotNull(st);
    }

}
