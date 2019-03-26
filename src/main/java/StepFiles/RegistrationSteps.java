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
	public void clickHomeLink() {
		homePage.clickHomeLink();
	}

	@Step
	public void clickRegister() {
		loginPage.clickRegisterLink();
	}

	@Step
	public void enterRegistrationDetails(String Name, String Company, String Email, String Password,
			String CnfPassword) {
		String RanEmail = (RandomStringUtils.randomAlphanumeric(4) + Email).toLowerCase();
		registrationPage.enterName(Name);
		registrationPage.enterCompany(Company);
		registrationPage.enterEmail(RanEmail);
		registrationPage.enterPassword(Password);
		registrationPage.enterCnfPassword(CnfPassword);
		registrationPage.ClickRegisterButton();
	}
	
	public void verifyRegistration(String verifyRegistration) {
		Assert.assertEquals(verifyRegistration, loginPage.verifyRegistration());
	}

}
