package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	WebDriver driver;
	BaseClass(WebDriver Driver){
		this.driver = Driver;
		PageFactory.initElements(driver, this);
		
	}

}
