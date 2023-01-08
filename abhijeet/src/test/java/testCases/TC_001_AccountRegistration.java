package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{


     @Test
     public void test_account_Registration()
     {
    	 try {
    	 logger.info("Starting TC_001_AccountRegistration");
    	 driver.get(rb.getString("appURL"));
    	 logger.info("Home Page dislayed");
    	 driver.manage().window().maximize();
    	 
    	 HomePage hp=new HomePage(driver);
    	 hp.clickMyAccount();
    	 logger.info("Clicked on My Account");
    	 hp.clickRegister();
    	 logger.info("Clicked on Register");
    	
    	 AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
    	 
    	 regpage.setFirstName("Jho");
    	 logger.info("Provided FirstName");
    	 regpage.setLasttName("canedy");
    	 logger.info("Provided LastName");
    	 regpage.setEmail(randomestring()+"gmail.com");
    	 logger.info("Provided Email");
    	// regpage.setTelephone("65656565");
    	 regpage.setPassword("abcxyz");
    	 logger.info("Provided Password");
    	 //regpage.setConfirmPassword("abcxyz");
    	 //logger.info("Provided ConfirmPassword");
     	
    	 regpage.setPrivacyPolicy();
    	 
    	 regpage.clickContinue();
    	 logger.info("Clicked on Continue");
     	
    	 
    	 String confmsg=regpage.getConfirmationMsg();
    	 if (confmsg.equals("Your Account Has Been Created!"))
    	 {
    		 logger.info("Account Registration Success");
    	    	
    		 Assert.assertTrue(true);
    		 
    	 }
    	 else
    	 {
    		 logger.error("Account Registration Failed");
    		 captureScreen(driver,"test_account_Registration");
    		 Assert.assertTrue(false);
    	 }
    	 }
    	 catch(Exception e)
    	 
    	 {
    		 logger.info("Account Registration Failed");
    		 Assert.fail();
    	 }
    	 logger.info("Finshed TC_001_AccountRegistration");
     }


     
}
    