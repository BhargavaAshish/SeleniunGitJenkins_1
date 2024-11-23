package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class xpath_axis_example_amazon2 {

	@Test
	public void XPATHAsix() throws Exception {

		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//h2[contains(text(),'Home, kitchen & ')]/parent::div/following-sibling::div[contains(@class,'foot')]/a")).click();
		
		
		System.out.println("Tilte: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home"));

		

	}

	
}
