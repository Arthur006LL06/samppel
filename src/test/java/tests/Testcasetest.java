package tests;

import base.Testbase;
import org.testng.annotations.Test;
import pages.Testcasepage;

public class Testcasetest extends Testbase {
    Testcasepage testcasepage;
    @Test(priority = 1)
    public void  Testcase1(){
        testcasepage.checktitle();

    }

}
