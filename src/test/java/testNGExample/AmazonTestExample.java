package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestExample {
	
	
	//priority
	
	//highest negative number having highest priority
	//by default priority is 0
	//if priority is same, execution as per naming conv
	
	
	
	@BeforeTest
	public void launchApp() {
		
		
		System.out.println("===================launchApp========================");
		
	}
	
	

	@AfterTest
	public void closeApp() {
		
		
		System.out.println("===================closeApp========================");
		
	}
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("test login execution");
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("test logout execution");
	}
	
	@Test
	public void addItem() {
		
		System.out.println("test addItem execution");
	}
	
	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("test cancelOrder execution");
	}
	
	
	@Test(priority = 2)
	public void payment() {
		
		System.out.println("test payment execution");
	}
	
	@Test(priority = 1)
	public void updateOrder() {
		
		System.out.println("test updateOrder execution");
	}
	

}
