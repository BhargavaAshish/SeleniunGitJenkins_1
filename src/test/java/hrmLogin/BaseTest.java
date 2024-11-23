package hrmLogin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

	
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		
		Thread.sleep(3000);
		
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
	}
	
}
