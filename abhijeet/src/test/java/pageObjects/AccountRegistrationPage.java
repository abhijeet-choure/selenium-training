package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	WebDriver driver;

		


	
	public AccountRegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}



	@FindBy(name="firstname")
	WebElement txtFirstName;
	

	@FindBy(name="lastname")
    WebElement txtLasttName;
	

	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	

	@FindBy(name="telephone")
	WebElement txtTelephone;


	@FindBy(name="password")
	WebElement txtPassword;
	

	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	

	@FindBy(name="agree")
	WebElement chkPolicy;
	
	@FindBy (xpath="//button[contains(text(),'Continue')]")
	WebElement btnContinue;
	
	@FindBy (xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname) {
		
		txtFirstName.sendKeys(fname);
	}
	
public void setLasttName(String lname) {
		
	txtLasttName.sendKeys(lname);
	}
		
public void setEmail(String email) {
}	
public void setTelephone(String tel) {
	
	txtTelephone.sendKeys(tel);
}
	
public void setPassword(String pwd) {
	
	 txtPassword.sendKeys(pwd);
}
	
public void setConfirmPassword(String cnfpwd) {
	
	txtConfirmPassword.sendKeys(cnfpwd);
}
public void setPrivacyPolicy() {
	
	chkPolicy.click();
}
public void clickContinue() {
	
	btnContinue.click();
}
public String getConfirmationMsg() {
	try
	{
		return (msgConfirmation.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}
	
}
	
	
	



