package regressionEbaTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionEbay.EbayAccount;
import regressionEbay.EbayRegister;

public class EbayAccountTest extends MobileAPI2 {

    EbayAccount ebayAccount;
    EbayRegister ebayRegister;

    @BeforeMethod
    public void init(){
      ebayAccount= PageFactory.initElements(appiumDriver,EbayAccount.class);
      ebayRegister= PageFactory.initElements(appiumDriver,EbayRegister.class);



    }
    @Test(enabled = false)
    public void Myaccounttest(){
        ebayAccount.setSignIn();
        ebayAccount.setCreataccount();
        ebayAccount.setUseEmail();

    }
    @Test
    public void setRegistertest(){
        ebayRegister.setRegister();
        ebayRegister.setName("rachid");
        ebayRegister.setEmail("rachid@gmail.com");
        ebayRegister.setPassword("pnt123");
        ebayRegister.setSlectphonenu();
        ebayRegister.setSubmit();
    }
}
