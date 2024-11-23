package hrmLogin;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
	
		
	@Test
	public void verifyLoginfeature() throws Exception {
		
		//locators
		//name ---- email
		
//		WebElement txtEmail = driver.findElement(By.name("Email"));
//		
//		
//		txtEmail.clear();
//		Thread.sleep(2000);
//		txtEmail.sendKeys("coforgesdet@test.com");;
//		Thread.sleep(2000);
//		String att_value = txtEmail.getAttribute("value");
//		System.out.println("***********" + att_value);
		
		
		
		//click on forgot password
		//class
		
//		driver.findElement(By.className("")).click();
		
		
		
		
		
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		
//		
//		
//		
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		
//		
//		//tagname ---login button
//		driver.findElement(By.tagName("button")).click();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("application title, after login sucessfully: " + driver.getTitle());
//		System.out.println("application URL:" + driver.getCurrentUrl());
//		
//		
//		
//		//classname
//		driver.findElement(By.className("oxd-userdropdown-name")).click();
//		
//		Thread.sleep(2000);
//		//linktext
//		//click on Logout
//		
//		//driver.findElement(By.linkText("Logout")).click();   //exact text
//		
//		
//		
//		//partialLinktext
//				//click on Logout
//				
//		driver.findElement(By.partialLinkText("ogou")).click(); //partialText
//		
//		
//		Thread.sleep(2000);
//		
//		System.out.println("application title, after logout sucessfully: " + driver.getTitle());
//		System.out.println("application URL:" + driver.getCurrentUrl());
//		
//		
//		//
		
	
		
		//xpath
		
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("CoforgeDemo");
		
		//css
		driver.findElement(By.cssSelector("[placeholder='username']")).sendKeys("addedSomeMore");
		
		
		
		
	}

}
