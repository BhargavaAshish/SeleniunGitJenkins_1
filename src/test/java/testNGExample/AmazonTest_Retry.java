package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest_Retry {
	//config at class level
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an application");
	}

	@AfterTest
	public void closeApp() {
		
		System.out.println("closing an application");
	}

	@Test(priority = -100, description = "login test case execution description" )
	public void login() {
		
		System.out.println("login test case execution.....");
		
	}
	
	
	@Test (priority = 4)
	public void logout() {
		
		System.out.println("logout test case execution.....");
		
	}
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case execution.....");
		
	}
	
//	@Test(retryAnalyzer = testNGExample.RetryLogic.class)
	@Test
	public void payment() {
		
		System.out.println("payment test case execution.....");
		int x = 10/0;
		
	}
	
	
	@Test
	public void updateOrder() {
		
		System.out.println("updateOrder test case execution.....");
		int x = 10/0;
		
	}
	
	
}
