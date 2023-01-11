package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement lnkMyAccount;

	@FindBy(linkText="Register")
	WebElement lnkRegister;

	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Login']")
	WebElement lnkLogin;


	public void clickMyAccount() {
		lnkMyAccount.click();
	}


	public void clickRegister() {
		lnkRegister.click();
	}


	public void clickLogin() {
		lnkLogin.click();
	}




	}

