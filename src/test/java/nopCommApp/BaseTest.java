package nopCommApp;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import configExample.ReadConfig;

public class BaseTest {

	
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		driver = new EdgeDriver();
		
		
		ReadConfig conf = new ReadConfig();
		System.out.println(conf.getAppURL());
		
		driver.get(conf.getAppURL());
		
		
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
	}
	
}
