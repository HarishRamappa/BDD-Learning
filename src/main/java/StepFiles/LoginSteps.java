package StepFiles;

import org.junit.Assert;
import Pages.LoginPage;
import Pages.MyAccountPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage;
	MyAccountPage myAccountPage;

	@Step
	public void enterEmail_Password(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.checkRememberMe();
		loginPage.ClickLoginButton();

	}

	@Step
	public void verifyLogin(String verifyLogin) {
		Assert.assertEquals(verifyLogin, loginPage.verifyLogin());

	}

	@Step
	public void clickLogout() {
		myAccountPage.clickLogout();

	}

}
