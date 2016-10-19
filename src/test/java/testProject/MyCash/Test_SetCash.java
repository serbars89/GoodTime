package testProject.MyCash;

import testProject.myCash.CashMap;
import testProject.myCash.SetCash;
import testProject.processing.MyException;
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

    @Test(expected = MyException.class)
    public void test_crashMethod(){
        setCash.crashMethod(null);

    }



}
