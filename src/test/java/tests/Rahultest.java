package tests;

import base.RahulBase;

import org.testng.annotations.Test;
import pages.Rahulll;

import static org.testng.Assert.assertEquals;

public class Rahultest extends RahulBase {
    Rahulll rahulll;
@Test(priority = 1)
        public void checkrahul(){

    rahulll=new Rahulll(driver);
    rahulll.optclick();
    rahulll.armsend("Armenia");
    rahulll.drsel();
    rahulll.chekopt();
    rahulll.winne();
    rahulll.esim();
    rahulll.tabclose();
    rahulll.alertdis("006LL06");
    rahulll.alerttex();
    rahulll.alertdiss("006LL06");
    rahulll.confname();
    String expectedText = "Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C";
    String actualText = rahulll.getTableDataContent(9,2);
    assertEquals(expectedText, actualText, "Texts doesn't matching -> "
            + expectedText + " doesn't matching " + actualText);
    rahulll.buttinchechk();
    rahulll.buttonchechk();
}


}
