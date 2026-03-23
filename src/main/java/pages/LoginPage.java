package pages;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Given;
import locators.Locator;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName(String userName) {
		getDriver().findElement(Locator.LOGIN_USERNAME_FIELD).sendKeys(userName);
		attachScreenshot("Enter username");
		return this;
	}

	public LoginPage enterPassword(String password) {
		getDriver().findElement(Locator.LOGIN_PASSWORD_FIELD).sendKeys(password);
		attachScreenshot("Enter Password");
		return this;
	}

	@Given("Click on the Login")
	public HomePage clickLogin() {
		getDriver().findElement(Locator.LOGIN_BUTTON).click();
		attachScreenshot("Click login button");
		return new HomePage();
	}

}
