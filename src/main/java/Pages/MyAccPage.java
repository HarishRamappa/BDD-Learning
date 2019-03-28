package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumOperations.ElementOperations;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyAccPage extends PageObject {
	
	ElementOperations eo = new ElementOperations();
	
	@FindBy(xpath = "//a[@class='utility-links-link']//i[@class='icon-account']")
	private WebElement MyAccIconXpath;
	
	@FindBy(xpath="(//a[@title='Log Out'])[1]")
	private WebElement LogoutXapth;
	
	@FindBy(xpath="//a[text()='View Address Book']")
	private WebElement ViewAddressLinkXapth;
	
	@FindBy(xpath="//button[@title='Add New Address']")
	private WebElement AddNewAddressXapth;

	public void hoverMyAccIcon() {
		eo.hover(MyAccIconXpath, getDriver());
	}

	public void clickLogout() {
		LogoutXapth.click();
	}

	public void clickViewAddressLink() {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(ViewAddressLinkXapth));
		ViewAddressLinkXapth.click();	
	}

	public void clickAddNewAddress() {
		AddNewAddressXapth.click();
	}

}
