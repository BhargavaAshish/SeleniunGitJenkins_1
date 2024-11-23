package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class HandleAmazonWindowExample {
	
	
	
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
		
//		driver.quit();
		
	}
	
	
	@Test
	public void windowExample1() throws Exception {
		
		
		//windows
		String parentWindow = driver.getWindowHandle();
//		driver.getWindowHandles();
		
		System.out.println("parent Window: " + parentWindow);
		
		
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Pink']")).click();
		
		
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("window count: " + allwindow.size());
		
		
		String win1 = (String)allwindow.toArray()[0];
		String win2 = (String)allwindow.toArray()[1];
		
		System.out.println("win1 Window: " + win1);
		System.out.println("win2 Window: " + win2);
		
		
		
		
		System.out.println("before switch to another window, appTitle:" + driver.getTitle());
		
		Thread.sleep(5000);
		//switch to window
		
		driver.switchTo().window(win2);
		System.out.println("after switch to window2, appTitle:" + driver.getTitle());
		
		driver.findElement(By.xpath("//p[text()='256 GB']")).click();
		
	}
	
}
