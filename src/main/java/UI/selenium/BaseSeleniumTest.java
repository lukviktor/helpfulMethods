package UI.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    protected static WebDriver driver;
    private static final String URL = "http://www.urn.su/qa/ui/basic_test/";
    private static final int TIME_OUT = 10;

    @BeforeEach
    public void setUp() {
        //Меняем на нужный драйвер
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       /*
         WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();
        */
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TIME_OUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    @Test
    public void test() {
    }
}
