package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Util {
    private By _myAccount=By.xpath("//a[@title=\"My Account\"]");
    private By _Register=By.xpath("//a[text()=\"Register\"]");
    private String _ExpectedURL="http://tutorialsninja.com/demo/";
    SoftAssert softAssert=new SoftAssert();
    public void verifyUserIsOnHomePage(){
        String ActualUrl=driver.getCurrentUrl();
        softAssert.assertEquals((ActualUrl),_ExpectedURL,"expected with Actual");
    }


    public void userClickOnMyAccount(){
        clickOnElement(_myAccount);
        //clickOnElement(_Register);
    }

    public void userclickonregister() {
        clickOnElement(_Register);
    }
}

