package testProject.service;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.util.StringUtils.isEmpty;

/**
 * Created by Ser on 09.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/context_test.xml",
        "/spring/context.xml"})
public class Test_GetLocal {

    @Autowired
    @Qualifier("getLocal")
    GetLocal getLocal;


    @Test
     public void test_getCuurentLocale_1(){
        String str = getLocal.getCurrentLocale();
        Assert.assertFalse("Object get successful", isEmpty(str));
    }

    @Test
    public void test_getCuurentLocale_2(){
        String str = getLocal.getCurrentLocale();
        int count = str.length();
        Assert.assertEquals("Test Ok", count , 5);
    }
}
