package StepDefinitions;

import StepFiles.RegistrationSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationStepDefinitions {

	@Steps
	private RegistrationSteps registrationSteps;

	@Given("I am on the Application")
	public void iAmOnTheApplication() throws Throwable {
		registrationSteps.launchApplication();
	}

	@When("I click home link")
	public void iClickHomeLink() throws Throwable {
		registrationSteps.clickHomeLink();
	}

	@When("I click Register link")
	public void iClickRegisterLink() throws Throwable {
		registrationSteps.clickRegister();
	}

	@When("I enter Name(.*) Company(.*) Email(.*) Password(.*) Confirm Password(.*)")
	public void iEnterRegistrationDetails(String Name, String Company, String Email, String Password,
			String CnfPassword) throws Throwable {
		registrationSteps.enterRegistrationDetails(Name, Company, Email, Password, CnfPassword);
	}

	@Then("I should see Login page(.*)")
	public void iShouldSeeLoginPage(String verifyRegistration) throws Throwable {
		registrationSteps.verifyRegistration(verifyRegistration);
	}

}
