package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	@FindBy(xpath = "//a[@class='utility-links-link']//i[@class='icon-account']")
	private WebElement MyAccountLinkXpath;
	
	@FindBy(xpath = "//div[@id='ltkpopup-close-button']//a[@title='Close']")
	private WebElement PopUpCloseButton;

	public void launchApplication() {
		openUrl("https://gocontigo-qa0.nrecommerce.com/");
		getDriver().manage().window().maximize();
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(PopUpCloseButton));
		PopUpCloseButton.click();
		
	}

	public void clickMyAccountLink() {
		MyAccountLinkXpath.click();
	}
}
