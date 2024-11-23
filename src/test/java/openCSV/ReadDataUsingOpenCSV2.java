package openCSV;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;


 
//import io.github.bonigarcia.wdm.WebDriverManager;
public class ReadDataUsingOpenCSV2 {
 
    //Provide test data CSV file path. As below path based on Mac machine. So, lets say you are using windows machine then write the below path accordingly. 
    String CSV_PATH = "./testData/TestData.csv";
    WebDriver driver;
    private CSVReader csvReader;
    String[] csvCell;
 
    @BeforeTest
    public void setup() throws Exception {
 
        //You can specify the hardcoded value of a chrome driver or driver based on your browser like below line
        //System.setProperty("webdriver.chrome.driver", "/Users/d33p4k/driver/chromedriver");
 
        //OR
 
        //Use below line to manage driver by WebdriverManager for chrome browser in our case (you can use any other driver of your choice)
    	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }
 
    @Test
    public void dataRead_CSV() throws IOException, Exception {
        //Create an object of CSVReader
        csvReader = new CSVReader(new FileReader(CSV_PATH));
 
//        driver.findElement(By.id("nav-link-accountList")).click();
//        driver.findElement(By.id("createAccountSubmit")).click();
 
        
        Actions act = new Actions(driver);
        
        
       
       
        
        
        
        Thread.sleep(4000);
        //You can use while loop like below, It will be executed until the last line in CSV used. 
        while ((csvCell = csvReader.readNext()) != null) {
            String CustomerName = csvCell[0];
            String CustomerEmail = csvCell[1];
//            String CustomerPassword = csvCell[2];
//            String CustomerConfirmPassword = csvCell[3];
//            //String CustomerConfirmPassword = csvCell[4];
            driver.findElement(By.cssSelector("input#Email")).clear();
            driver.findElement(By.cssSelector("input#Email")).sendKeys(CustomerName);
            driver.findElement(By.cssSelector("input#Password")).clear();
            driver.findElement(By.cssSelector("input#Password")).sendKeys(CustomerEmail);
            

            Thread.sleep(4000);
        }
    }
 
    @AfterTest
    public void exit() {
        driver.close();
        driver.quit();
    }
}