package pages;

import base.ProjectSpecificMethods;
import locators.Locator;

public class HomePage extends ProjectSpecificMethods {

	public MyHomePage clickCRMSFA() {
		getDriver().findElement(Locator.HOME_CRM_SFA_LINK).click();
		attachScreenshot("Click CRM/SFA link");
		return new MyHomePage();
	}

}
