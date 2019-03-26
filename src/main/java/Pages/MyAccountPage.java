package Pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyAccountPage extends PageObject{
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement MyAccountLink;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement LogoutXapth;

	public void clickLogout() {
		MyAccountLink.click();
		LogoutXapth.click();
	}

}
