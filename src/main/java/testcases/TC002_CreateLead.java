package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.LoginPage;

@Epic("LeafTaps Automation")
@Feature("Lead Management")
@Story("Create lead")
public class TC002_CreateLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setData() {
		excelSheetName = "TC003";
	}

	@Test(dataProvider = "fetch")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify user can create a new lead")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName,
			String eMail) {

		new LoginPage().enterUserName(userName).enterPassword(password).clickLogin().clickCRMSFA().clickLeadLink()
				.clickCreateLead().enterCompanyName(comnyName).enterFirstName(firstName).enterLastName(lastName)
				.enterEmail(eMail).clickCreateLeadSubmit().verifyFirstName(firstName);
	}
}
