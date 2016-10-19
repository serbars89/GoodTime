package testProject.processing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ser on 11.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/context_test.xml", "classpath:/spring/context.xml"})
public class Test_Runner {

    @Test
    public void test_runnerLoccalCash(){

        System.out.println("11111111");
    }

    @Test
    public void test_show(){
        System.out.println("5555555555");
    }
}
