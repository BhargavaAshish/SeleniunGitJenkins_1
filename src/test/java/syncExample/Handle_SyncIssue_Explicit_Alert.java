package syncExample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class Handle_SyncIssue_Explicit_Alert {
	
	
public WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an applicaiton");
		
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		
		driver.manage().window().maximize();
		
		
		//sync issue
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));				//applicable for any element
		
		
		//Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void closingApp() throws Exception {
		
		System.out.println("closingApp an applicaiton");
		Thread.sleep(5000);
//		driver.close();				//browser instance --- current focus
		
		driver.quit();				//all the instance
		
	}
	
	
	
	@Test
	public void enterValueIntoInputBox() throws Exception {
		
		
		//conditionalWait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.executionWait));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
	}
	
	
	


}
