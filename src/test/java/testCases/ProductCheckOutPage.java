package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.ProductCheckOut;
import testBase.BasePage;

public class ProductCheckOutPage extends BasePage{
	@Test
	public void productcheckout() throws InterruptedException {
		//Logger logger = LogManager.getLogger(ProductCheckOutPage.class);
		AccountLogin al = new AccountLogin();
		logger.info("****filling details****");
		al.accountLogin();
		logger.info("****login started ****");
		ProductCheckOut pc = new ProductCheckOut(driver);
		logger.info("****product checking out strted ****");
		Thread.sleep(3000);
		pc.clickOnHome();
		logger.info("****clicked on home button in login opage****");
		Thread.sleep(3000);
		pc.clickOnMacbook();
		logger.info("****clicked on macbook ****");
		Thread.sleep(3000);
		pc.clickOnAddToCart();
		logger.info("****macbook added to cart ****");
		Thread.sleep(3000);
		pc.cart();
		logger.info("****clicked on cart ****");
		Thread.sleep(3000);
		pc.clickOnCheckOut();
		logger.info("****lproduct checked out ****");
	}

}
