package nopCommApp;

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
		
		
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		
		
		
		//ID ---- password
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		
		//checkbox -rememberme
		boolean isRemChecked = driver.findElement(By.id("RememberMe")).isSelected();   //false
		System.out.println("is checkbox selected, before click operation: " + isRemChecked);
		
		//click on checkbox
		driver.findElement(By.id("RememberMe")).click();
		
		
		
		
		System.out.println("is checkbox selected, after click operation: " + driver.findElement(By.id("RememberMe")).isSelected()); //true
		
		System.out.println("application title, before login sucessfully: " + driver.getTitle());
		
		//tagname ---login button
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(7000);
		
		System.out.println("application title, after login sucessfully: " + driver.getTitle());
		
		
		//linktext
		//click on Logout
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		Thread.sleep(2000);
		
		System.out.println("application title, after logout sucessfully: " + driver.getTitle());
		
		
	}

}
