package handleIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class HandleAlertExample2 {
	
	
	
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
		//index
		
//		driver.switchTo().frame(0);
		
		//name or id
//		driver.switchTo().frame("name/id");
		
		//webElement
		
		WebElement photoFrame = driver.findElement(By.cssSelector("iframe[data-src*='photo']"));
		driver.switchTo().frame(photoFrame);
		
		
		
		
		
		String atl_img3 = driver.findElement(By.cssSelector("img[src*='tatras3']")).getAttribute("alt");
		
		
		
		
		
		System.out.println("*******atl_img3********"  + atl_img3);
		Assert.assertTrue(atl_img3.contains("Planning"));
		
		
	}
	
}
