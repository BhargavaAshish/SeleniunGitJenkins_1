package testNGExample;



import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class ScreenshotFailedCases {
	// Create Webdriver reference
	static WebDriver driver;

	@Test
	public static void captureScreenMethod() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		// //Statement with correct Xpath
		driver.findElement(By.xpath("input#twotabsearchtextbox")).sendKeys("iphone"); // Statement with incorrect Xpath

	}

	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src, new File("./test-output/screenshots/" + result.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		driver.quit();
	}
}