package captureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class Action_DragDropExample {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.get(Constants.amazonApp);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
	}
	
	
	
	
	
	@Test
	public void amazonSearchTest() throws Exception {
		
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 15 pro" + Keys.ENTER);
//		driver.findElement(By.cssSelector("nav-search-submit-button")).click();
		
		
		
		
		//capture a screenshot
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		captureScreenShot(driver, "iphone 15 pro");
		
		
	}
	
	
	public void captureScreenShot(WebDriver wd, String fileName) throws Exception {
		
		File screenshotFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		File targetFile = new File("./screenshot/"+fileName+".png");
		
		FileUtils.copyFile(screenshotFile, targetFile);
	}
	
	
}
