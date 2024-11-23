package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDown extends BaseTest{
	
	
	@Test
	public void verifyCarListBox() throws Exception {
		
		
		WebElement carList = driver.findElement(By.tagName("select"));
		
		
		Select list = new Select(carList);
		
		
		System.out.println("is multiple selection available for listbox: " + list.isMultiple());			//false
		
		Thread.sleep(3000);
		list.selectByIndex(1);					//Saab
		
		
		Thread.sleep(2000);
		list.selectByValue("Russia");			//Opel
		
		
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota");		//Toyota
		
		
		
		
		
	}

	
	//@Test
	public void verifyCountryListBox() throws Exception {
		
		
//		driver.findElement(By.cssSelector("[value=\"India\"]")).click();;
//		driver.findElement(By.cssSelector("[value='Germany']")).click();;
		
		WebElement countryList = driver.findElement(By.name("FromLB"));
		
		
		Select list = new Select(countryList);
		
		
		System.out.println("is multiple selection available for listbox: " + list.isMultiple());
		
		//index start from 0
		list.selectByIndex(0);				//USA
		list.selectByIndex(1);				//Russia
		
		
		Thread.sleep(2000);
		list.selectByValue("India");		//India
		
		
		Thread.sleep(2000);
		list.selectByVisibleText("Italy");	//Italy
		
		
		
		Thread.sleep(5000);
		list.deselectAll();
		
		
		Thread.sleep(5000);
		list.selectByIndex(0);				//USA
		list.selectByIndex(1);				//Russia
		list.selectByValue("India");
		
		
		Thread.sleep(5000);
		list.deselectByValue("USA");
		list.deselectByVisibleText("Russia");
		
	}
	

}
