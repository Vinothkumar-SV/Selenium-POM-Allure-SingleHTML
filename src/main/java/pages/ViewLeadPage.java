package pages;

import base.ProjectSpecificMethods;
import locators.Locator;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName(String fname) {
		String text = getDriver().findElement(Locator.VIEWLEAD_FIRSTNAME_TEXT).getText();
		if (text.contains(fname)) {
			System.out.println("Vefified Sucessfully");
		}
		attachScreenshot("Verify lead first name");
		return this;
	}

}
