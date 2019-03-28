package StepDefinitions;

import StepFiles.AddAddressSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddAddressStepDefinitions {

	@Steps
	AddAddressSteps addAddressSteps;

	@When("I click View Address Book link")
	public void iClickViewAddressBookLink() {
		addAddressSteps.clickViewAddressBook();

	}
	
	@When("I click Add new address")
	public void iClickAddNewAddress() {
		addAddressSteps.clickAddNewAddress();

	}

	@When("I enter Firstname(.*) Lastname(.*) Company(.*) Telephone(.*) Fax(.*) Address(.*) Address2(.*) City(.*) State(.*) Zip(.*) Country(.*)")
	public void addAddressDetails(String firstname, String lastname, String company, String telephone, String fax,
			String address, String address2, String city, String state, String zip, String country) {
		addAddressSteps.enterAddressDetails(firstname, lastname, company, telephone, fax, address, address2, city,
				state, zip, country);

	}

	@Then("I see The address has been saved(.*) message")
	public void ISeeTheAddressHasBeenSavedMessage(String verifyAddedAddress) {
		addAddressSteps.verifyAddedAddress(verifyAddedAddress);
	}
}
