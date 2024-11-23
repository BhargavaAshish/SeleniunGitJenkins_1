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

public class Action_DragDropExample {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.get(Constants.dragDropApp);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
	}
	
	
	
	
	
	@Test
	public void iframeExample1() throws Exception {
		
		//switch to frame
		WebElement photoFrame = driver.findElement(By.cssSelector("iframe[data-src*='photo']"));
		driver.switchTo().frame(photoFrame);
		
		
		
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		
		Actions act = new Actions(driver);
		
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		
		Thread.sleep(2000);
		
		//app2
		
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		
		
//		act.clickAndHold(img4).moveToElement(trash).release().perform();
		act.clickAndHold(img4).moveToElement(trash).release().build().perform();
		
		
	}
	
}
