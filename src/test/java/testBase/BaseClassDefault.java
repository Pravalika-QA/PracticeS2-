package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClassDefault {

	
	public WebDriver driver;   // this is for driver
	public Logger logger;    // this is for log4j2
	public Properties p;    //this is for config.properties file
	
	@BeforeClass
	public void BrowserSetUp() throws IOException
	{
    	//loading properties file
		 FileReader file=new FileReader(".//src//test//resources//config.properties");
		 p=new Properties();
		 p.load(file);
    	
		logger = LogManager.getLogger(this.getClass());
		
		 ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);
	        driver = new ChromeDriver(options);
	        
	        driver.manage().window().maximize();
			driver.get(p.getProperty("appURL"));
	
}
	
	//@AfterClass
		void tearDown()
		{
			driver.close();
		}


		public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}


}

