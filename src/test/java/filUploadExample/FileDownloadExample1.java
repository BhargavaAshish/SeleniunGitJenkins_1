package filUploadExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class FileDownloadExample1 {

	@Test
    public void fileUploadTest() throws Exception {
        
       
        
		String baseUrl = "https://chromedriver.storage.googleapis.com/index.html?path=96.0.4664.35/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        Thread.sleep(2000);
        WebElement btnDownloadElement = driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']"));


        btnDownloadElement.click();

        Thread.sleep(7000);
        
        driver.close();
}
	
}