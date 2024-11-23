package readDataFromTextFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ReadDataTextFile {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

	}

	@Test
	public void searchAmazon() throws InterruptedException, IOException {

		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("values to send");
		// ReadData from Text file

		// Approach 1
//		FileReader fr = new FileReader("./testData/testData.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String searchkeyword;
//		
//		while((searchkeyword = br.readLine())!=null) {
//			
//			System.out.println(searchkeyword);
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchkeyword);
//			Thread.sleep(2000);
//			driver.findElement(By.id("twotabsearchtextbox")).clear();
//			Thread.sleep(3000);
//		}
//		
//		br.close();

		// Approach 2 - using scanner and file
		File file = new File("./testData/testData.txt");
		Scanner sc = new Scanner(file);

		// Loop statement
		while (sc.hasNextLine()) 
		{
			// System.out.println(sc.nextLine());
			String searchkeyword = sc.nextLine();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchkeyword);
			Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			Thread.sleep(3000);
			
			
			
			//click on Search button
			
			
			
		}

		// Approach 3
		// without loop

//		sc.useDelimiter("\\Z");
//		// String searchkeyword = sc.next();
//		System.out.println(sc.next());

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
