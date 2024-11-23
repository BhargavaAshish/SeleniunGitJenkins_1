package crossBorwserTest;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Constants;

public class SignUpTest_CrossBrowserTest {

	WebDriver driver;
	
	
	@Parameters("coforge_br")
	@BeforeTest
	public void launchApp(String br) {
		
		
		System.out.println("value fetch from TestNG XML file: " + br);
		
		String browser = br;
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("execution on chrome browser");
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("execution on edge browser");
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
		}
		
		else {
			
			System.out.println("================execution in default CHROME browser===========================");
			driver = new ChromeDriver();
			
		}
		
		
		
		
		driver.get("https://accounts.lambdatest.com/register");
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		//close the browser
		Thread.sleep(5000);
		driver.quit();
				
		
	}

	@Test
	public void verifySignTest() throws Exception {

		
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".lg\\3Ah-35")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		
		
		
		
		
		
	}

}
