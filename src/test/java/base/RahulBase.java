package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class RahulBase {



        public WebDriver driver;
        private String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";


        @BeforeClass
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            options.getLogLevel();
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get(baseUrl);
        }

   /* @AfterClass
    public void tearDown() {
        driver.quit();
    }*/
    }
