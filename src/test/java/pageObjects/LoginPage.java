package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	WebDriver driver;
	
	 public LoginPage(WebDriver driver) 
	 {
		 super(driver);
	 }
	 
	 @FindBy(xpath=("//input[@id='txtUserName']"))
		WebElement txt_Clearusername_loc;

	 @FindBy(xpath=("//input[@id='txtUserName']"))
	 WebElement txt_Username_loc;

	 @FindBy(xpath=("//input[@id='txtPassword']"))
	 WebElement txt_Password_loc;

	 @FindBy(xpath=("//button[@id='signInButton']"))
	 WebElement btn_login_loc;
	 
	 @FindBy(xpath=("//button[@id='globalMemberSelectionButtonId']"))
	 WebElement btn_members_loc;
	 
	 @FindBy(xpath=("//span[@role='presentation']"))
	 WebElement btn_member_dropdown_loc;
	
	
	 @FindBy(xpath=("//input[contains(@id, 's2id_autogen') and contains(@id, '_search')]"))
	 WebElement txt_dropdownexapnd_member_loc;
	 
	 @FindBy(xpath=("//a[@id='submitMemberGroup']"))
	 WebElement btn_submit_loc;
	 
	 public void ClearUsername()
	 {
	 	txt_Clearusername_loc.clear();

	 }

	 public void SetUsername(String user)
	 {
	 	txt_Username_loc.sendKeys(user);

	 }

	 public void SetPassword(String pwd)
	 {
	 	txt_Password_loc.sendKeys(pwd);

	 }

	 public void Clicklogin()
	 {
	 	btn_login_loc.click();

	 }
	 
	 public void clickMember()
	 {
		 btn_members_loc.click();
	 }
	 
	 public void clickMemberDropdown()
	 {
		 btn_member_dropdown_loc.click();
	 }
	 
	 public void EnterMember(String member)
	 {
		 txt_dropdownexapnd_member_loc.sendKeys(member);
		 txt_dropdownexapnd_member_loc.sendKeys(Keys.ENTER);
		 
	 }
	 
	 public void clicksubmit()
	 {
		 btn_submit_loc.click();
	 }
	 
	
}
