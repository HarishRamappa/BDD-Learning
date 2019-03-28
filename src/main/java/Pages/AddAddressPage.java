package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class AddAddressPage extends PageObject {

	@FindBy(xpath = "//div[@class='field name-firstname']//div//input[@id='firstname']")
	private WebElement FirstnameXpath;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement LastNameXpath;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement CompanyXpath;

	@FindBy(xpath = "//input[@id='telephone']")
	private WebElement TelephoneXpath;

	@FindBy(xpath = "//input[@id='fax']")
	private WebElement FaxXpath;

	@FindBy(xpath = "//input[@id='street_1']")
	private WebElement AddressXpath;

	@FindBy(xpath = "//input[@id='street_2']")
	private WebElement Address2Xpath;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement CityXpath;

	@FindBy(xpath = "//select[@id='region_id']")
	private WebElement StateXpath;

	@FindBy(xpath = "//input[@id='zip']")
	private WebElement ZipXpath;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement CountryXpath;

	@FindBy(xpath = "//button[@title='Save Address']")
	private WebElement SaveAddressButtonXpath;
	
	@FindBy(xpath = "//span[contains(text(),'The address has been saved')]")
	private WebElement VerifyAddedAddressXpath;

	public void enterFirstName(String firstname) {
		FirstnameXpath.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		LastNameXpath.sendKeys(lastname);
	}

	public void enterCompanyName(String company) {
		CompanyXpath.sendKeys(company);
	}

	public void enterTelephone(String telephone) {
		TelephoneXpath.sendKeys(telephone);
	}

	public void enterFax(String fax) {
		FaxXpath.sendKeys(fax);
	}

	public void enterAddress(String address) {
		AddressXpath.sendKeys(address);
	}

	public void enterAddress2(String address2) {
		Address2Xpath.sendKeys(address2);
	}

	public void enterCity(String city) {
		CityXpath.sendKeys(city);
	}

	public void enterState(String state) {
		Select state1 = new Select(StateXpath);
		state1.selectByVisibleText(state);
	}

	public void enterZip(String zip) {
		ZipXpath.sendKeys(zip);
	}

	public void enterCountry(String country) {
		Select country1 = new Select(StateXpath);
		country1.selectByVisibleText(country);
	}

	public void clickSaveAddress() {
		SaveAddressButtonXpath.click();
	}

	public String verifyAddedAddress() {
		return VerifyAddedAddressXpath.getText();
	}

}
