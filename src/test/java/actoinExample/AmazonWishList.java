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

public class AmazonWishList {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
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
		
		WebElement SingIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement WishList = driver.findElement(By.xpath("//*[text()='Create a Wish List']"));
		//driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		

		Actions act = new Actions(driver);
		
		//app1
		
//		act.moveToElement(SingIn).perform();
//		act.moveToElement(WishList).perform();
//		act.click().perform();
		
		
		
		//app2
		
//		act.moveToElement(SingIn).perform();
//		act.click(WishList).perform();
		
		
		
		//app3
//		act.moveToElement(SingIn).moveToElement(WishList).click().perform();
//		act.moveToElement(SingIn).click(WishList).perform();
		
		
		//app4
//		act.moveToElement(SingIn).click(WishList).build().perform();
		
		System.out.println(driver.getTitle());
		
		
		
	}
	
}
