package exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SignUpTest_Edge {

	WebDriver driver;

	@Test
	public void verifySignTest() throws Exception {

		//launch the browser
//		driver = new ChromeDriver();

		//launch edge browser
		driver = new EdgeDriver();
		
		
		driver.get("https://accounts.lambdatest.com/register");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".lg\\3Ah-35")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		
		
		//close the browser
		Thread.sleep(5000);
		driver.quit();
		
	}

}
