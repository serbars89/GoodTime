package ardasProject.start;

import ardasProject.DefineTimeLocal.DefineTimePartDay;
import ardasProject.processing.RunnerStructure;
import ardasProject.service.ClientSettings;
import ardasProject.service.GetLocal;
import ardasProject.service.DisplayHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 02.10.2016.
 */
@Component
public class StartProject {

    @Autowired
    DefineTimePartDay partDay_defineTime;

    @Autowired
    GetLocal getLocal;

    @Autowired
    ClientSettings clientSettings;

    private static Logger log = LoggerFactory.getLogger(StartProject.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");


        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");

        RunnerStructure runner =  (RunnerStructure)context.getBean("runner");
        DisplayHello starterDisp =  (DisplayHello)context.getBean("starterDisp");

        runner.show_t();
        System.out.println("");
        runner.runnerLocalCash();
        starterDisp.displayHello(runner.helloLocal());


        System.out.println("");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

    }

    public static void difn_Locale() {

    }

}

