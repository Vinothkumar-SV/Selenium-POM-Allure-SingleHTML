package pages;

import base.ProjectSpecificMethods;
import locators.Locator;

public class MyLeadsPage extends ProjectSpecificMethods {

	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(Locator.MYLEADS_CREATELEAD_LINK).click();
		return new CreateLeadPage();
	}

}
