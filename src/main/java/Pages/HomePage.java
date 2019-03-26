package Pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	@FindBy(xpath = "//a[text()='home']")
	private WebElement HomeLinkXpath;

	public void launchApplication() {
		openUrl("http://blazedemo.com/index.php");
		getDriver().manage().window().maximize();
	}

	public void clickHomeLink() {
		HomeLinkXpath.click();
	}
}
