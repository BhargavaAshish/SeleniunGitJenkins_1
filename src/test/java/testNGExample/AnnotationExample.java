package testNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	
	//pre-condition ----- before
	//BeforeSuite  -----> BeforeTest -----> BeforeClass  -----> BeforeMethod
	
	
	//Test ----- @Test  -----login ----addItem ---logout
	
	//post-condition ---- after
	//AfterSuite  <------- AfterTest <-----AfterClass <-----AfterMethod 
	
	
	
	@BeforeSuite
	public void BeforeSuite() {
		
		
		System.out.println("**************BeforeSuite****************");
		
	}
	
	

	@AfterSuite
	public void AfterSuite() {
		
		
		System.out.println("****************AfterSuite****************");
		
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		
		
		System.out.println("BeforeClass");
		
	}
	
	

	@AfterClass
	public void AfterClass() {
		
		
		System.out.println("AfterClass");
		
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		
		System.out.println("=====BeforeMethod========");
		System.out.println("============starting a video================");
		
	}
	
	

	@AfterMethod
	public void AfterMethod() {
		
		
		System.out.println("===========AfterMethod============");
		
	}
	
	
	
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
	public void addItem() {
		
		System.out.println("test addItem execution");
	}
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("test logout execution");
	}
	
	

}
