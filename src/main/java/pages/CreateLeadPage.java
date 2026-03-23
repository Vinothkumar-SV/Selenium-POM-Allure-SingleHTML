package pages;

import base.ProjectSpecificMethods;
import locators.Locator;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage enterCompanyName(String companyName) {
		getDriver().findElement(Locator.CREATELEAD_COMPANYNAME_FIELD).sendKeys(companyName);
		attachScreenshot("Enter company name");
		return this;
	}

	public CreateLeadPage enterFirstName(String firstName) {
		getDriver().findElement(Locator.CREATELEAD_FIRSTNAME_FIELD).sendKeys(firstName);
		attachScreenshot("Enter first name");
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		getDriver().findElement(Locator.CREATELEAD_LASTNAME_FIELD).sendKeys(lastName);
		attachScreenshot("Enter last name");
		return this;
	}

	public CreateLeadPage enterEmail(String email) {
		getDriver().findElement(Locator.CREATELEAD_EMAIL_FIELD).sendKeys(email);
		attachScreenshot("Enter email");
		return this;
	}

	public ViewLeadPage clickCreateLeadSubmit() {

		getDriver().findElement(Locator.CREATELEAD_SUBMIT_BUTTON).click();
		attachScreenshot("Click View Lead");
		return new ViewLeadPage();
	}
}
