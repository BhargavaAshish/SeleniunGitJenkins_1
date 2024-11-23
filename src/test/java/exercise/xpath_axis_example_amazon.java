package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class xpath_axis_example_amazon {

	@Test
	public void XPATHAsix() throws Exception {

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/input")).click();
		
		
//		System.out.println("Tilte: " + driver.getTitle());
//		Assert.assertTrue(driver.getTitle().contains(""));

		

	}

	
}
