package StepFiles;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import net.thucydides.core.annotations.Step;

public class RegistrationSteps {

	HomePage homePage;
	LoginPage loginPage;
	RegistrationPage registrationPage;

	@Step
	public void launchApplication() {
		homePage.launchApplication();
	}

	@Step
	public void clickMyAccount() {
		homePage.clickMyAccountLink();
	}

	@Step
	public void clickCreateAnAccount() {
		loginPage.clickCreateAnAccountLink();
	}

	@Step
	public void enterRegistrationDetails(String Firstname, String Lastname, String Email, String Password,
			String CnfPassword) {
		String RanEmail = (RandomStringUtils.randomAlphanumeric(4) + Email).toLowerCase();
		registrationPage.enterFirstname(Firstname);
		registrationPage.enterLastname(Lastname);
		registrationPage.enterEmail(RanEmail);
		registrationPage.enterPassword(Password);
		registrationPage.enterCnfPassword(CnfPassword);
		//registrationPage.CheckSignUp();
		//registrationPage.ClickRegisterSubmitButton();
	}
	
	public void verifyRegistration(String verifyRegistration) {
		Assert.assertEquals(verifyRegistration, registrationPage.verifyRegistration());
	}

}
