package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCheckOut extends BaseClass {

	public ProductCheckOut(WebDriver Driver) {
		super(Driver);
	}
	JavascriptExecutor js = (JavascriptExecutor)driver;
	@FindBy(xpath="//i[@class='fas fa-home']")
	WebElement home;
	
	@FindBy(xpath="/html/body/main/div[2]/div/div/div[2]/div[1]/div/div[2]/div/h4/a")
	WebElement Macbook;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[4]/a")
	WebElement cart;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement checkout;
	
	public void clickOnHome() {
		home.click();
	}
	public void clickOnMacbook() {
		//Macbook.click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", Macbook);
	}
	public void clickOnAddToCart() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", addtocart);
		//addtocart.click();
	}
	public void cart() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", cart);
		//cart.click();
	}
	public void clickOnCheckOut() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", checkout);
		//checkout.click();
	}

}
