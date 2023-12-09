package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public ResourceBundle rb;
	public Logger logger;

	@BeforeTest
	@Parameters("Browser")
	public void setup(String Browser) throws Exception {
		logger=LogManager.getLogger(this.getClass());
		rb=ResourceBundle.getBundle("config");
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if(Browser.equalsIgnoreCase("msedge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else {
			throw new Exception("Browser is not correct");
		}
	}
	@Test
	public void open() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost/opencart/opencart/upload/");
		//driver.get(rb.getString("url"));
		
		driver.manage().window().maximize();
	}

	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);//abcde, tyuio, nhjio,
		return (generatedString);
	}


	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);//abcd, mnjh,
		String num = RandomStringUtils.randomNumeric(3); //123,456.678,

		return (st+"@"+num); 
	}
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}


}




		/*@BeforeClass
   public void setUp() {
	   WebDriverManager.chromedriver().setup();
//	   EdgeOptions opt = new EdgeOptions();
//	   opt.addArguments("--guest");
	   driver = new EdgeDriver();

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("http://localhost/opencart/opencart/upload/");
	   driver.manage().window().maximize();
   }*/

	
