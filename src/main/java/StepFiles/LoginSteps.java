package StepFiles;

import org.junit.Assert;
import Pages.LoginPage;
import Pages.MyAccPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage;
	MyAccPage myAccountPage;

	@Step
	public void enterEmail_Password(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.ClickLoginButton();

	}

	@Step
	public void verifyLogin(String verifyLogin) {
		Assert.assertEquals(verifyLogin, loginPage.verifyLogin());

	}

	@Step
	public void clickLogout() {
		myAccountPage.hoverMyAccIcon();
		myAccountPage.clickLogout();

	}

}
