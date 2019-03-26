package Pages;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class RegistrationPage extends PageObject{
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement NameXpath;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement ComapanyXpath;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailXpath;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement PasswordXpath;
	
	@FindBy(xpath="//input[@id='password-confirm']")
	private WebElement CnfPasswordXpath;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	private WebElement RegisterButton;
	
	public void enterName(String Name) {
		NameXpath.sendKeys(Name);
	}
	
	public void enterCompany(String Company) {
		ComapanyXpath.sendKeys(Company);
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
	
	public void ClickRegisterButton() {
		RegisterButton.click();
	}
}
