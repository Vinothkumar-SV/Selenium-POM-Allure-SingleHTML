package base;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.qameta.allure.Allure;
import utils.DataLibrary;

public class ProjectSpecificMethods {
	public String excelSheetName;

	private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public WebDriver getDriver() {
		return tlDriver.get();
	}

	@BeforeMethod
	public void setup() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("guest");
		setDriver(new ChromeDriver(op));
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@DataProvider(name = "fetch")
	public Object[][] readData() throws IOException {

		return DataLibrary.readExcelData(excelSheetName);
	}

	public void attachScreenshot(String stepName) {
		byte[] screenshot = ((RemoteWebDriver) getDriver()).getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment(stepName, new ByteArrayInputStream(screenshot));
	}
}
