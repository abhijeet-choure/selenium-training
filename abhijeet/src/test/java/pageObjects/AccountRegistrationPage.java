package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    WebElement txtLastName;
	

	@FindBy(name = "email")
	WebElement txtEmail;


	@FindBy(name="telephone")
	WebElement txtTelephone;


	@FindBy(name="password")
	WebElement txtPassword;
	

	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	

	@FindBy(name = "agree")
	WebElement chkdPolicy;

	
	@FindBy (xpath="//button[@class='btn btn-primary']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		
		txtFirstName.sendKeys(fname);
	}
	
public void setLastName(String lname) {
		
	txtLastName.sendKeys(lname);
	}
		

public void setEmail(String email) {
	txtEmail.sendKeys(email);

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
public void setPrivacyPolicy() throws InterruptedException {
	
	chkdPolicy.submit();
}
public void clickContinue() throws InterruptedException {
	//sol1 
	//btnContinue.click();
	
	//sol2 
	btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
	//Thread.sleep(3000);
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}

public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

}
}

	



