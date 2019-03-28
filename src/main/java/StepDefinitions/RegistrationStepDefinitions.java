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

	@When("I click MyAccount Icon")
	public void iClickHomeLink() throws Throwable {
		registrationSteps.clickMyAccount();
	}

	@When("I click Create an Account link")
	public void iClickRegisterLink() throws Throwable {
		registrationSteps.clickCreateAnAccount();
	}

	@When("I enter FirstName(.*) LastName(.*) Email(.*) Password(.*) Confirm Password(.*)")
	public void iEnterRegistrationDetails(String Firstname, String Lastname, String Email, String Password,
			String CnfPassword) throws Throwable {
		registrationSteps.enterRegistrationDetails(Firstname, Lastname, Email, Password, CnfPassword);
	}

	@Then("I should see error message(.*)")
	public void iShouldSeeErrorPage(String verifyRegistration) throws Throwable {
		registrationSteps.verifyRegistration(verifyRegistration);
	}

}
