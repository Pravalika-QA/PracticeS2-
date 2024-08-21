package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC001_Logintest extends Baseclass{

	
	
	@Test
	
	public void logintestVerification() throws InterruptedException
	{
		logger.info("***** Starting TC001_Logintest  ****");
		logger.debug("This is a debug log message");
		try
		{
		LoginPage lp = new LoginPage(driver);
		logger.info("cleared existing username");
		lp.ClearUsername();
		lp.SetUsername("user8");
		lp.SetPassword("P@ssw0rd1");
		lp.Clicklogin();
		logger.info("login successful");
		
		lp.clickMember();
		Thread.sleep(2000);
		lp.clickMemberDropdown();
		Thread.sleep(2000);
		lp.EnterMember("All Member IDs");
		lp.clicksubmit();
		logger.info("MemberId change successful");
		
		}
		
		catch (Exception e)
		{
		logger.error("test failed");
		}
		finally
		{
			logger.info("****Finished TC001_Logintest****");
		}
		
	}
	
	
	
	
	
}
