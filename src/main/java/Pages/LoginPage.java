package Pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//a[@title='Create an Account']")
	private WebElement CreateAnAccountLinkXpath;

	@FindBy(xpath = "//input[@title='Email Address']")
	private WebElement EmailXpath;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement PasswordXpath;

	@FindBy(xpath = "//button[contains(@title,'Sign In')]")
	private WebElement LoginButton;

	@FindBy(xpath = "//h1[text()='Account Dashboard']")
	private WebElement VerifyLoginXpath;

	public void clickCreateAnAccountLink() {
		CreateAnAccountLinkXpath.click();
	}

	public void enterEmail(String Email) {
		EmailXpath.sendKeys(Email);
	}

	public void enterPassword(String Password) {
		PasswordXpath.sendKeys(Password);
	}

	public void ClickLoginButton() {
		LoginButton.click();
	}

	public String verifyLogin() {
		return VerifyLoginXpath.getText();
	}

}
