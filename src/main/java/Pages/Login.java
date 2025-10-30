package Pages;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilitiesBase;
import POM.LoginPageObject;

public class Login extends CapabilitiesBase {

	LoginPageObject loginPageObject = new LoginPageObject();
	BaseClass baseClass = new BaseClass();

	public void enterUserName(String userValue) {

		baseClass.sendKeys(loginPageObject.username, userValue, extentTest, "Entered the username value");
	}

	public void enterPassword(String passValue) {

		baseClass.sendKeys(loginPageObject.password, passValue, extentTest, "Entered the password value");
	}

	public void clickSubmitButton() {

		baseClass.click(loginPageObject.loginButton, extentTest, "Clicked on Login Submit button");
		
		
	}
	
	public void login(String userValue, String PassValue) {
		
		enterUserName(userValue);
		enterPassword(PassValue);
		clickSubmitButton();
	}

}
