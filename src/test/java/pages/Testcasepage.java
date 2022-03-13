package pages;

import base.Testbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Testcasepage extends Testbase {
    WebDriver driver;




    public Testcasepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void checktitle(){



    }
}
