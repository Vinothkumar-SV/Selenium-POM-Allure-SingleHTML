package pages;

import base.ProjectSpecificMethods;
import locators.Locator;

public class MyHomePage extends ProjectSpecificMethods {

	public MyLeadsPage clickLeadLink() {
		getDriver().findElement(Locator.MYHOME_LEADS_LINK).click();
		attachScreenshot("Click Leads link");

		return new MyLeadsPage();
	}

}
