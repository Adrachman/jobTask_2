import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

abstract public class BaseTest {
    @BeforeClass
    public static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = -70;
        Configuration.timeout = 6000;
    }

    @Before
    public void init(){
        setUp();
    }


    @After
    public void tearDown(){
//        Selenide.closeWebDriver();
    }
}
