package Pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLinkXpath;

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement VerifyRegistrationXpath;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailXpath;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement PasswordXpath;

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement RememberMeCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement LoginButton;

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement VerifyLoginXpath;

	public void clickRegisterLink() {
		RegisterLinkXpath.click();
	}

	public String verifyRegistration() {
		return VerifyRegistrationXpath.getText();
	}

	public void enterEmail(String Email) {
		EmailXpath.sendKeys(Email);
	}

	public void enterPassword(String Password) {
		PasswordXpath.sendKeys(Password);
	}

	public void checkRememberMe() {
		RememberMeCheckBox.click();
	}

	public void ClickLoginButton() {
		LoginButton.click();
	}

	public String verifyLogin() {
		return VerifyLoginXpath.getText();
	}

}
