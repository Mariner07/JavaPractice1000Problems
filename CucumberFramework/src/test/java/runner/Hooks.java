package runner;

import org.junit.After;
import org.junit.Before;
//steps we need to execute before or after each scenario
public class Hooks {
    @Before
    public void setUp(){
        //will be executed every each scenario
    }

    @After
    public void cleanUp(){
        //will be executed after each scenario
    }
}
