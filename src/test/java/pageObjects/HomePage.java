package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{

	public HomePage(WebDriver Driver) {
		super(Driver);
	}
	
	@FindBy(xpath="//div[@class='nav float-end']//a[@class='dropdown-toggle']")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Login;
	
	public void clickOnMyAccount() {
		MyAccount.click();
	}
	public void clickOnRegister() {
		Register.click();
	}
	public void clickOnLogin() {
		Login.click();
	}
	
	
	

}
