package StepFiles;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import Pages.AddAddressPage;
import Pages.MyAccPage;
import net.thucydides.core.annotations.Step;

public class AddAddressSteps {

	MyAccPage myAccountPage;
	AddAddressPage addAddressPage;

	@Step
	public void clickViewAddressBook() {
		myAccountPage.clickViewAddressLink();

	}
	
	@Step
	public void clickAddNewAddress() {
		myAccountPage.clickAddNewAddress();
	}

	@Step
	public void enterAddressDetails(String firstname, String lastname, String company, String telephone, String fax,
			String address, String address2, String city, String state, String zip, String country) {
		addAddressPage.enterFirstName(firstname);
		addAddressPage.enterLastName(lastname);
		addAddressPage.enterCompanyName(company);
		addAddressPage.enterTelephone(telephone);
		addAddressPage.enterFax(fax);
		addAddressPage.enterAddress(address);
		addAddressPage.enterAddress2(address2);
		addAddressPage.enterCity(city);
		addAddressPage.enterState(state);
		addAddressPage.enterZip(zip);
		//addAddressPage.enterCountry(country);
		addAddressPage.clickSaveAddress();

	}

	@Step
	public void verifyAddedAddress(String verifyAddedAddress) {
		Assert.assertEquals(verifyAddedAddress, addAddressPage.verifyAddedAddress());
	}

}
