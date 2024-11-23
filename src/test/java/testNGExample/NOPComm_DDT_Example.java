package testNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.Constants;

public class NOPComm_DDT_Example {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.get(Constants.nopApp);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
	}
	
	
	
	@Test(dataProvider = "sampleData")
	public void verifyLoginWithInValid(String email, String pwd) throws Exception {
		
		System.out.println("email and Password: " + email + " :  " + pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).clear();;
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).clear();;
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
//		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		//validation 

		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
		
		
	}
	
	
	@DataProvider
	public String[][] sampleData() {
		
		
		String [][] data = { {"abhi@yahoo.com","welcome"}, {"vish@google.com","welcome123"},{"pawan@gmail.com","learning123"}};
		return data;
		
	}
	
	
	
	@DataProvider
	public String[][] regressionData() {
		
		
		String [][] data = { {"abhi_regression@yahoo.com","welcome"}, {"vish_regression@google.com","welcome123"},{"pawan_regression@gmail.com","learning123"},{"sakshi_regression@gmail.com","learning123"}};
		return data;
		
	}
	
	
	
	
	
	
}
