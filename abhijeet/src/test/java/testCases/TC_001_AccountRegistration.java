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
    	 regpage.setFirstName(randomeString().toUpperCase());
 		regpage.setLastName(randomeString().toUpperCase());
 		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
 		//regpage.setTelephone(randomeNumber());
 		
 		String password=randomAlphaNumeric();
 		regpage.setPassword(password);
 		//regpage.setConfirmPassword(password);
 		
 		regpage.setPrivacyPolicy();
 	
 		logger.info("clicking on continue");
 		regpage.clickContinue();
 	
 	
 		//String confmsg=regpage.getConfirmationMsg();
 		
 		logger.info("verifying customer registration");
     	
    	 
    	 String confmsg1=regpage.getConfirmationMsg();
    	 if (confmsg1.equals("Your Account Has Been Created!"))
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
    