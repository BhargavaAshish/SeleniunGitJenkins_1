package actoinExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class RightClickDoubleClick {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.get(Constants.doubleClickApp); //https://demo.guru99.com/test/simple_context_menu.html
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close(); 
		driver.quit();
		
	}
	
	
	//@Test
	public void rightClickTest() throws Exception {
		
		WebElement rightButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		
		
		Actions act = new Actions(driver);
		
		//app1
//		act.moveToElement(rightButton).contextClick().perform();
		
		//app2
		act.contextClick(rightButton).perform();
		
		
		
		
		
	}
	
	@Test
	public void doubleClickTest() throws Exception {
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		
		
		Actions act = new Actions(driver);
		
		//app1
//		act.moveToElement(rightButton).contextClick().perform();
		
		//app2
		act.doubleClick(doubleClickButton).perform();
		
		
		Thread.sleep(3000);
		
		//handle an alert
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}
	
}
