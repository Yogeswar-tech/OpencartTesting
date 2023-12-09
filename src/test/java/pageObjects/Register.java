package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends BaseClass{

	public Register(WebDriver Driver) {
		super(Driver);
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement Fname;
	
	@FindBy(id="input-lastname")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Pwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement Agree;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement Conti;
	
	public void sendFname(String fname) {
		Fname.sendKeys(fname);
	}
	public void sendLname(String lname) {
		Lname.sendKeys(lname);
	}
	public void sendEmail(String email) {
		Email.sendKeys(email);
	}
	public void sendPassword(String pw) {
		Pwd.sendKeys(pw);
	}
	public void clickAgree() {
		Agree.click();
	}
	public void clickConti() {
		Conti.click();
	}

}
