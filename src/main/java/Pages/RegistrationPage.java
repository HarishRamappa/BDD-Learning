package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegistrationPage extends PageObject{
	
	@FindBy(xpath="//div[@class='field name-firstname']//div//input[@id='firstname']")
	private WebElement FirstnameXpath;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement LastnameXpath;
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement EmailXpath;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement PasswordXpath;
	
	@FindBy(xpath="//input[@id='confirmation']")
	private WebElement CnfPasswordXpath;
	
	@FindBy(xpath="//input[@id='is_subscribed_account']")
	private WebElement SignUpCheckBoxXpath;
	
	@FindBy(xpath="//button[@id='submit-create']")
	private WebElement RegisterSubmitButton;
	
	@FindBy(xpath = "//div[@class='recaptcha']//div[contains(@id,'advice-required-entry')]")
	private WebElement VerifyRegistrationXpath;
	
	public void enterFirstname(String Firstname) {
		FirstnameXpath.sendKeys(Firstname);
	}
	
	public void enterLastname(String Lastname) {
		LastnameXpath.sendKeys(Lastname);
	}
	
	public void enterEmail(String Email) {
		EmailXpath.sendKeys(Email);
	}
	
	public void enterPassword(String Password) {
		PasswordXpath.sendKeys(Password);
	}
	
	public void enterCnfPassword(String CnfPassword) {
		CnfPasswordXpath.sendKeys(CnfPassword);
	}
	
	public void CheckSignUp() {
		SignUpCheckBoxXpath.click();
	}
	
	public void ClickRegisterSubmitButton() {
		RegisterSubmitButton.click();
	}
	
	public String verifyRegistration() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(VerifyRegistrationXpath));
		return VerifyRegistrationXpath.getText();
	}
}
