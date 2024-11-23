package exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPComm_ClassExample {

	WebDriver driver;

	@Test
	public void verifySignTest() throws Exception {

		//launch the browser
		driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.className("email")).clear();
		
		
		
		
		
		//close the browser
		Thread.sleep(5000);
		driver.quit();
		
	}

}
