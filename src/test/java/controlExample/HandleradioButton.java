package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleradioButton extends BaseTest{
	
	
	@Test
	public void verifyInputBox() {
		
		System.out.println("is selected, before: " + driver.findElement(By.cssSelector("[value=female]")).isSelected());
		
		driver.findElement(By.cssSelector("[value=female]")).click();;
		
		System.out.println("is selected, after: " + driver.findElement(By.cssSelector("[value=female]")).isSelected());
	}

	

}
