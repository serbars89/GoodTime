package testProject.DefineTimeLocal;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * Created by Ser on 09.10.2016.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/context_test.xml", "classpath:/spring/context.xml"})
public class Test_PartDay_DefineTime {



    @Autowired
    @Qualifier("time")
   public Time time;

    @Qualifier("defineTimePartDay")
    @Autowired
    public DefineTimePartDay partDay_defineTime;


    @Test
    public void test_getPartday_st() {
        String strn = partDay_defineTime.getPartDay();
        Assert.assertFalse("Object get successful", isEmpty(strn));
    }


    @Test
    public void test_getPartday_2() {
        String s = partDay_defineTime.getPartDay();
        int count = s.length();
        Assert.assertTrue(count>2);
    }

    @Test
    public void test_getPartday_3() {
        String s = partDay_defineTime.getPartDay();
        int count = s.length();
        Assert.assertTrue(count < 8);
    }
}
