package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	 public HomePage(WebDriver driver) 
	 {
		 super(driver);
	 }
	
	@FindBy(xpath=("//button[normalize-space()='Alerts']"))
	WebElement btn_Alerts_loc;
	
	@FindBy(xpath=("//button[normalize-space()='Alert Allocation']"))
	WebElement btn_Alert_Allocation_loc;
	
	
	@FindBy(xpath=("//button[normalize-space()='Security Checks']"))
	WebElement btn_Securitychecks_loc;
	
	
	@FindBy(xpath=("//a[normalize-space()='aiRiskNet®']"))
	WebElement btn_back_loc;
	
	@FindBy(xpath=("//a[@href='/Home']"))
	WebElement btn_back1_loc;
	
	
	public void ClickAlerts()
	{
		btn_Alerts_loc.click();
	}
	
	public void ClickBack()
	{
		btn_back_loc.click();
	}
	
	public void ClickAlertAllocation()
	{
		btn_Alert_Allocation_loc.click();
	}
	
	public void ClickSecuritychecks()
	{
		btn_Securitychecks_loc.click();
	}
	
	public void ClickBack1()
	{
		btn_back1_loc.click();
	}
	
	
}
