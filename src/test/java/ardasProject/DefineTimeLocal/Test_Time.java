package ardasProject.DefineTimeLocal;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ser on 09.10.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/context_test.xml",
        "/spring/context.xml"})
public class Test_Time {

//    Time time = new Time();

    @Autowired
    @Qualifier("time")
    Time time;

    @Test
    public void test_currentTime_1(){

        Long l_time = time.currentTime();
        Assert.assertNotNull(l_time);
        System.out.println("test_currentTime_1 -- тест прошел удачно");
    }

    @Test
    public void test_currentTime_2(){
        Long l_time = time.currentTime();
        Assert.assertFalse(l_time < 0);
        Assert.assertFalse(l_time > 86400);
        System.out.println("test_currentTime_2 -- тест прошел удачно");
    }

}
