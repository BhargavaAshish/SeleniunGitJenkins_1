package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleInputBox extends BaseTest{
	
	
	@Test
	public void verifyInputBox() {
		
		driver.findElement(By.cssSelector("[name='fname']")).sendKeys("enter firstName");
	}

	
//	@Test
//	public void verifyInputBox1() {
//		
//		driver.findElement(By.cssSelector("[name='lname']")).sendKeys("enter lastName");
//	}
}
