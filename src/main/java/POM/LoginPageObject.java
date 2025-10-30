package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Capabilities.CapabilitiesBase;



public class LoginPageObject extends CapabilitiesBase{
	
	@FindBy(id="text")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
}
