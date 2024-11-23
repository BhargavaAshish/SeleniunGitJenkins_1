package javascriptExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class HandleJavaScriptExample2 {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
//		driver.close(); 
		
//		driver.quit();
		
	}
	
	
	@Test
	public void windowExample1() throws Exception {
		
		
		WebElement returnPolicy = driver.findElement(By.cssSelector("strong[data-reactid=\"125\"]"));
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].scrollIntoView()", returnPolicy);
//		JS.executeScript("arguments[0].click()", submit);
		
		
		
		//driver.findElement(By.xpath("(//span[text()='Sign in'])[3]")).click();
		
	}
	
}
