package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Register;
import testBase.BasePage;

public class AccountRegistration extends BasePage{
	
	@Test
	public void accountRegistration() throws InterruptedException {
		logger.info("***Starting account registration****");
	
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		logger.info("****Clicked on my account****");
		hp.clickOnRegister();
		logger.info("****Clicked Register button****");
		
		Register rg = new Register(driver);
		logger.info("****filling details****");
		rg.sendFname(randomeString());
		logger.info("****filled Firstname****");
		//rg.sendLname("Hiiiiii");
		rg.sendLname(randomeString());
		logger.info("****filled LastName****");
		//rg.sendEmail("Hellohiiiii@gmail.com");
		rg.sendEmail(randomeString()+"@gmail.com");
		logger.info("****filled email****");
		//rg.sendPassword("Passwordabc");
		rg.sendPassword(randomAlphaNumeric());
		logger.info("****filled Password****");
		Thread.sleep(3000);
		rg.clickAgree();
		logger.info("****clicked on Agree Button****");
		Thread.sleep(3000);
		rg.clickConti();
		logger.info("**** clicked on continue button****");
	}
	

}
