package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utilities.DriverManager;
import utils.ScreenRecorderUtil;

public class Hooks {

    @Before
    public void beforeTest() throws Exception {
        ScreenRecorderUtil.startRecord("main");
        //DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //DriverManager.getDriver().driver.manage().window().maximize();
    }

    @After
    public void afterTest() throws Exception {
        ScreenRecorderUtil.stopRecord();
        //DriverManager.getDriver().driver.close();
    }

    @AfterAll
    public static void afterScenario(){
        DriverManager.getDriver().driver.close();
    }
}
