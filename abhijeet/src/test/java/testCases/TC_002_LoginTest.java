package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	
	@Test
	public void test_Login()
	{
		
		logger.info("***** String TC_002_LoginTest ****");
		
		try
		{
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Displayed");
			
			driver.manage().window().maximize();
		//HomePage -->MyAccount-->Login
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account");
		hp.clickLogin();
		logger.info("Clicked on Login");
		
		//LoginPage-->email & password then click
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		logger.info("Provided Email"
				);
		lp.setPassword(rb.getString("password"));
		//lp.setPassword(p.getProperty("xyz"));
		logger.info("Provied Password");
		lp.clickLogin();
		logger.info("Clicked on Login");
		
		
		boolean targetpage=lp.isMyAccountPageExits();
		
		if(targetpage)
		{
			logger.info("Login Success");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Login failed");
			captureScreen(driver,"test_login");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			logger.fatal("Login Failed");
			Assert.fail();
		}
		logger.info("**** Finished TC_002_LoginTest  ***** ");
	}
	
}
