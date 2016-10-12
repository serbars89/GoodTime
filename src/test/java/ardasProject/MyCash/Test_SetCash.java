package ardasProject.MyCash;

import ardasProject.myCash.CashMap;
import ardasProject.myCash.SetCash;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ser on 12.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/context_test.xml", "classpath:/spring/context.xml"})
public class Test_SetCash {

    @Autowired
    CashMap cashMap;

    @Autowired
    SetCash setCash;

    private String line_k;
    private String line_v;

    @Test
    public void test_setCashMapRU_k(){
        setCash.setCashMapRU();
        String key = setCash.line_k;
        Assert.assertNotNull(key);
    }

    @Test
    public void test_setCashMapRU_v(){
        setCash.setCashMapRU();
        String value = setCash.line_v;
        Assert.assertNotNull(value);
    }

    @Test
    public void test_setCashMapUS_k(){
        setCash.setCashMapUS();
        String key = setCash.line_k;
        Assert.assertNotNull(key);
    }

    @Test
    public void test_setCashMapUS_v(){
        setCash.setCashMapUS();
        String value = setCash.line_v;
        Assert.assertNotNull(value);
    }

    @Test
    public void test_setCashMapUK_k(){
        setCash.setCashMapUK();
        String key = setCash.line_k;
        Assert.assertNotNull(key);
    }

    @Test
    public void test_setCashMapUK_v(){
        setCash.setCashMapUK();
        String value = setCash.line_v;
        Assert.assertNotNull(value);
    }


}
