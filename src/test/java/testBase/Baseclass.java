package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {

	
	
public WebDriver driver;   // this is for driver
public Logger logger;    // this is for log4j2
public Properties p;    //this is for config.properties file
	
    @Parameters({"os", "browser"})    // this will set the parameters for multiple browsers ans os
	@BeforeClass
	public void BrowserSetUp(String os, String br) throws IOException
	{
    	//loading properties file
		 FileReader file=new FileReader(".//src//test//resources//config.properties");
		 p=new Properties();
		 p.load(file);
    	
		logger = LogManager.getLogger(this.getClass());
		 
		//when we are doing crossbrowser testing then we need to this code 
		switch(br.toLowerCase())
		
		{
		case "chrome": {
	        ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);
	        driver = new ChromeDriver(options);
	        break;
	    }
		case "edge": driver=new EdgeDriver();
		break;
		default: System.out.println("No matching browser..");
					return;
		}
	
		
		
		
		//driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(p.getProperty("appURL"));
	}
	
	//@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	// this is for generating the random data.(string, numbers and alphanumeric)
	 
		/*public String randomgeneratedData()
		{
			String generateddata = RandomStringUtils.randomAlphabetic(5);
			return generateddata;
		} 
		
		public String randomgeneratedNumber()
		{
			String generatednumber = RandomStringUtils.randomNumeric(10);
			return generatednumber;
		}
		
		public String randomalphanumeric()
		{
			String generateddata = RandomStringUtils.randomAlphabetic(5);
			String generatedalphanumeric = RandomStringUtils.randomNumeric(10);
			return(generateddata+generatedalphanumeric);
		}*/
}

