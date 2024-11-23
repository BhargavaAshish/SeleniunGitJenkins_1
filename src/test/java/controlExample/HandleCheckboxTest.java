package controlExample;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleCheckboxTest extends BaseTest{
	
	
	@Test
	public void verifyInputBox() {
		
		
		//with multiple match --- perform action on first element
		//driver.findElement(By.cssSelector("[type='checkbox']")).click();;  ///multiple match ---- 3
		
		
		//click on element using index
		//driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
		
		
		
		List<WebElement> allChechbox = driver.findElements(By.cssSelector("[type='checkbox']"));
		
		System.out.println("Checkbox count: " + allChechbox.size());
		Assert.assertEquals(allChechbox.size(), 3);
		
//		allChechbox.get(1).click();
//		allChechbox.get(2).click();
		
		
		
		for (int i = 0; i < allChechbox.size(); i++) {
			
			
			String att_value = allChechbox.get(i).getAttribute("value");
			
			if(att_value.equalsIgnoreCase("Boat")) {
				
				allChechbox.get(i).click();
			}
			
		}
		
		
		
	}

}
