package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import utility.Constants;

//import utility.Constants;

public class BaseTest {

	
	WebDriver driver;
	Logger logger;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		logger = Logger.getLogger("HRM App");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		
		logger.info("========info========");
		logger.error("========error========");
		logger.warn("========warn========");
		
		driver = new ChromeDriver();
		
		logger.info("launching chrome browser");
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//logger.info("launching app : " + Constants.hrmApp);
		logger.info("launching app : " + "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		logger.info("closing Application");
		Thread.sleep(7000);
		driver.close();
		
	}
	
}
