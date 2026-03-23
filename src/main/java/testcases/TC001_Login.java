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
@Feature("Authentication")
@Story("Invalid login validation")
public class TC001_Login extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelSheetName = "TC001";

	}

	@Test(dataProvider = "fetch")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify error message for invalid login credentials")
	public void createLeaf(String uName, String pwd) {
		new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogin();
	}

}
