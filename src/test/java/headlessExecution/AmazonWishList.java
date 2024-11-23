package headlessExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class AmazonWishList {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--headless");
//		
//		
//		
//		driver = new ChromeDriver(opt);    //session 
		
		
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--headless");
		
		
		
		driver = new EdgeDriver(opt);    //session 
		
		
		driver.get(Constants.amazonApp); //https://www.amazon.in/
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close(); 
		driver.quit();
		
	}
	
	
	@Test
	public void moveToWishList() throws Exception {
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}
	
}
