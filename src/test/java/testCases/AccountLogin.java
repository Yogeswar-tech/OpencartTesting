package testCases;

 import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import testBase.BasePage;

public class AccountLogin extends BasePage{
	@Test(groups="sanity")
	public void accountLogin() throws InterruptedException {
		logger.info("****Account Login Started****");
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		logger.info("****Clicked on My account button Home Page ****");
		Thread.sleep(3000);
		hp.clickOnLogin();
		logger.info("**** clicked on Login in Home page Button****");
		Login lg = new Login(driver);
		logger.info("**** opened login page ****");
		Thread.sleep(3000);
		lg.sendEmai("Hellohiiiii@gmail.com");
		logger.info("**** Filled email text field****");
		//lg.sendEmai(rb.get);
		Thread.sleep(3000);
		lg.sendPass("Passwordabc");
		logger.info("****filled password****");
		Thread.sleep(3000);
		lg.clickLogin();
		logger.info("****Clicked on Login Button in Login Page****");

	}

}
