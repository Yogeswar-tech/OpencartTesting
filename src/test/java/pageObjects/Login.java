package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseClass{

	public Login(WebDriver Driver) {
		super(Driver);
	}  
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emai;
	
	@FindBy(xpath="//input[@id='input-password']")
    WebElement pas;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	
	public void sendEmai(String email) {
		emai.sendKeys(email);
	}
	public void sendPass(String ps) {
		pas.sendKeys(ps);
	}
	public void clickLogin() {
		Login.click();
	}
}
