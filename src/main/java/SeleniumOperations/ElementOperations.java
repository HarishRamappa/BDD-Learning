package SeleniumOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementOperations {

	public void hover(WebElement elementXpath, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(elementXpath).build().perform();
	}

}
