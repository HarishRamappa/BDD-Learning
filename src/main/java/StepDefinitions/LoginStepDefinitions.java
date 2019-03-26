package StepDefinitions;

import StepFiles.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
	
	@Steps
	private LoginSteps loginSteps;
	
	@Given("I enter Email(.*) Password(.*)")
	public void iEnterEmailPassword(String Email, String Password) {
		loginSteps.enterEmail_Password(Email,Password);
	}
	
	@Then("I should be Logged in(.*)")
	public void iShouldBeLoggedIn(String verifyLogin) {
		loginSteps.verifyLogin(verifyLogin);

	}
	
	@When("I Logout")
	public void iLogout() {
		loginSteps.clickLogout();
	}
	
	

}
