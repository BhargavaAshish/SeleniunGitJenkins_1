package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws Exception {
		
		
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.coforge.weekendSept2024\\testData\\config.properties");  //window
//		FileInputStream fis = new FileInputStream("C:/Users/91995/eclipse-workspace/com.coforge.weekendSept2024/testData/config.properties");        //win/non-win
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		
		
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		System.out.println("application URL: " +prop.getProperty("appURL"));
		System.out.println("application email: " +prop.getProperty("email"));
		System.out.println("application pass: " +prop.getProperty("password"));

	}

}
