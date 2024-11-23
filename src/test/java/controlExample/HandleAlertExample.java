package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	
	//@Test
	public void SimpleAlert() throws Exception {
		
		//click on Show Me Alert
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		
		
		Thread.sleep(3000);
		
		//handle an alert
		
		//Alert/Window/iframe ------
		
		//Alert
		//accept -----ok
		//dismiss ----cancel
		//getText ----
		//sendKeys
		
		Alert simpleAlertTest = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + simpleAlertTest.getText());
		Assert.assertEquals(simpleAlertTest.getText(), "Hi.. This is alert message!");
		
		simpleAlertTest.accept();
		
		
		
		
	}

	
	//@Test
	public void ConfirmAlert() throws Exception {
		
		//click on Confirm button
		driver.findElement(By.cssSelector("[onclick='myFunction()']")).click();
		
		
		Thread.sleep(3000);
		
		//handle an alert
		
		//Alert/Window/iframe ------
		
		//Alert
		//accept -----ok
		//dismiss ----cancel
		//getText ----
		//sendKeys
		
		Alert confirm = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + confirm.getText());
		Assert.assertEquals(confirm.getText(), "Press 'OK' or 'Cancel' button!");
		
		Assert.assertTrue(confirm.getText().contains("'OK' or 'Cancel'"));
		
		
		//click on Ok button
		confirm.dismiss();
		
		String ok_cancel_Text = driver.findElement(By.id("demo")).getText();
		System.out.println("**************" + ok_cancel_Text);
		Assert.assertTrue(ok_cancel_Text.contains("You pressed Cancel!"), "error Message: veifiication of ok and cancel button text failed.");
		
		
	}
	
	@Test
	public void PromptAlert() throws Exception {
		
		//click on Confirm button
		driver.findElement(By.cssSelector("[onclick='myFunctionf()']")).click();
		
		
		Thread.sleep(3000);
		
		//handle an alert
		
		//Alert/Window/iframe ------
		
		//Alert
		//accept -----ok
		//dismiss ----cancel
		//getText ----
		//sendKeys
		
		Alert prompt = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + prompt.getText());
		Assert.assertEquals(prompt.getText(), "Your Name Please");
		Assert.assertTrue(prompt.getText().contains("Your Name Please"));
		
		
		Thread.sleep(3000);
		
		prompt.sendKeys("abhishek");
		
		Thread.sleep(3000);
		
		//click on Ok button
		prompt.accept();
		
		
	}
	
}
