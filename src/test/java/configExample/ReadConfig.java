package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	
	Properties prop;
	
	public ReadConfig() throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Users/91995/eclipse-workspace/com.coforge.weekendSept2024/testData/config.properties");
		
		prop = new Properties();
		prop.load(fis);
		
		
		
	}
	
	
	public String getAppURL() {
		
		return prop.getProperty("appURL");
	}

	
	
	public String getEmail() {
		
		return prop.getProperty("email");
	}

	public String getPassword() {
	
	return prop.getProperty("password");
}
}
