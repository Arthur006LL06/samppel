package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.plaf.SpinnerUI;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;
public class Rahulll {
    WebDriver driver;
@FindBy (name = "radioButton")
WebElement butclick;
@FindBy (id = "autocomplete")
WebElement countrykey;
@FindBy(css = "#dropdown-class-example > option:nth-child(3)")
WebElement selopt;
@FindBy(id = "checkBoxOption2")
    WebElement checkopt;
@FindBy(id = "openwindow")
WebElement newind;
@FindBy(id = "opentab")
WebElement taclos;
@FindBy(id = "name")
WebElement namalert;
@FindBy(id = "alertbtn")
WebElement texalert;
@FindBy(id = "confirmbtn")
WebElement namconfirm;
    @FindBy(css = "[id='product'] tbody tr td")
    List<WebElement> listTableData;
    @FindBy(id = "hide-textbox")
    WebElement hidebutton;
@FindBy(id = "show-textbox")
WebElement showbutton;

    public Rahulll(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void optclick(){
    butclick.click();
    }
    public void armsend(String op){
        countrykey.sendKeys(op);
    }
    public void drsel(){
        selopt.click();
    }
    public void chekopt(){
    checkopt.click();
    }
    public void winne(){
        newind.click();

    }
    public void esim(){
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.close();

        driver.switchTo().window(winHandleBefore);
    }
    public void tabclose(){
        taclos.click();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }
public void alertdis(String opl){
        namalert.sendKeys(opl);
}
public void  alerttex(){
        texalert.click();
        Assert.assertEquals(driver.switchTo().alert().getText(),"Hello 006LL06, share this practice page and share your knowledge");
        driver.switchTo().alert().accept();
}
    public void alertdiss(String opll){
        namalert.sendKeys(opll);
    }
    public void confname(){
        namconfirm.click();
        Assert.assertEquals(driver.switchTo().alert().getText(),"Hello 006LL06, Are you sure you want to confirm?");
        driver.switchTo().alert().accept();
    }
    private int getTbleItem(int rowindex, int columnIndex) {
        return 3 * (rowindex - 1) + (columnIndex - 1);
    }

    public String getTableDataContent(int rowIndex, int columnIndex) {
        int tdIndexToGet = getTbleItem(rowIndex, columnIndex);
        return listTableData.get(tdIndexToGet).getText();
    }
    public void buttinchechk(){
        hidebutton.click();
    }
    public void buttonchechk(){
        showbutton.click();
    }
}
