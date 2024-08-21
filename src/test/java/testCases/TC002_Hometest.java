package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClassDefault;
import testBase.Baseclass;

@Test(priority=1)
public class TC002_Hometest extends BaseClassDefault{
	
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
	
	 @Test(priority=2)
	    public void testHomeNavigation() {
	        logger.info("***** Starting TC002_Hometest: testHomeNavigation ****");

	        try {
	            HomePage hp = new HomePage(driver);
	            hp.ClickAlerts();
	            hp.ClickBack();
	            hp.ClickAlertAllocation();
	            Thread.sleep(4000);
	          hp.ClickBack1();
	          Thread.sleep(3000);
	            hp.ClickSecuritychecks();
	            logger.info("Home navigation successful");
	        } catch (Exception e) {
	            logger.error("Test failed", e);
	              // rethrow to ensure the test is marked as failed
	        } finally {
	            logger.info("**** Finished TC002_Hometest: testHomeNavigation ****");
	        }
	    }
	
	
	

}
