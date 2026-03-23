package locators;

import org.openqa.selenium.By;

public class Locator {
// CreateLeadPage Locators

	public static final By CREATELEAD_COMPANYNAME_FIELD = By.id("createLeadForm_companyName");
	public static final By CREATELEAD_FIRSTNAME_FIELD = By.id("createLeadForm_firstName");
	public static final By CREATELEAD_LASTNAME_FIELD = By.id("createLeadForm_lastName");
	public static final By CREATELEAD_EMAIL_FIELD = By.id("createLeadForm_primaryEmail");
	public static final By CREATELEAD_SUBMIT_BUTTON = By.className("smallSubmit");
	// DuplicateLeadPage Locators
	public static final By DUPLICATELEAD_DUPLICATE_BUTTON = By.className("smallSubmit");
	// EditLeadPage Locators
	public static final By EDITLEAD_COMPANYNAME_FIELD = By.id("updateLeadForm_companyName");
	public static final By EDITLEAD_UPDATE_BUTTON = By.className("smallSubmit");
	// FindLeadPage Locators
	public static final By FINDLEAD_FIRSTNAME_FIELD = By.xpath("(//input[@name='firstName'])[3]");
	public static final By FINDLEAD_LEADID_FIELD = By.name("id");
	public static final By FINDLEAD_FINDLEADS_BUTTON = By.xpath("//button[text()='Find Leads']");
	public static final By FINDLEAD_FIRSTRESULTING_LEAD = By
			.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	public static final By FINDLEAD_FIRSTRESULTING_FIRSTNAME = By
			.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']");
	public static final By FINDLEAD_PHONE_TAB = By.xpath("//span[text()='Phone']");
	public static final By FINDLEAD_EMAIL_TAB = By.xpath("//span[text()='Email']");
	public static final By FINDLEAD_PHONENUMBER_FIELD = By.name("phoneNumber");
	public static final By FINDLEAD_EMAILADDRESS_FIELD = By.name("emailAddress");
	public static final By FINDLEAD_ERROR_MSG = By.className("x-paging-info");
	// FindLeadPopPage Locators
	public static final By FINDLEADPOP_FIRSTNAME_FIELD = By.name("firstName");
	public static final By FINDLEADPOP_FINDLEADS_BUTTON = By.xpath("//button[text()='Find Leads']");
	public static final By FINDLEADPOP_FIRSTRESULTING_LEAD = By
			.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	// HomePage Locators
	public static final By HOME_LOGGEDNAME = By.xpath("//h2[text()[contains(.,'Demo')]]");
	public static final By HOME_CRM_SFA_LINK = By.linkText("CRM/SFA");
	public static final By HOME_LOGOUT_BUTTON = By.className("decorativeSubmit");
	// LoginPage Locators
	public static final By LOGIN_USERNAME_FIELD = By.id("username");
	public static final By LOGIN_PASSWORD_FIELD = By.id("password");
	public static final By LOGIN_BUTTON = By.className("decorativeSubmit");
	public static final By LOGIN_ERROR_DIV = By.id("errordiv");
	// MyHomePage Locators
	public static final By MYHOME_LEADS_LINK = By.linkText("Leads");
	// MyLeadsPage Locators
	public static final By MYLEADS_CREATELEAD_LINK = By.linkText("Create Lead");
	public static final By MYLEADS_FINDLEADS_LINK = By.linkText("Find Leads");
	public static final By MYLEADS_MERGELEADS_LINK = By.linkText("Merge Leads");
	// ViewLeadPage Locators
	public static final By VIEWLEAD_FIRSTNAME_TEXT = By.id("viewLead_firstName_sp");
	public static final By VIEWLEAD_FINDLEADS_LINK = By.linkText("Find Leads");
	public static final By VIEWLEAD_COMPANYNAME_TEXT = By.id("viewLead_companyName_sp");
	public static final By VIEWLEAD_EDITLEAD_LINK = By.linkText("Edit");
	public static final By VIEWLEAD_DUPLICATELEAD_LINK = By.linkText("Duplicate Lead");
	public static final By VIEWLEAD_DELETELEAD_LINK = By.linkText("Delete");

	// MergeLeadPage Locators
	public static final By FROM_LEAD_LOOKUP = By.xpath("(//img[@alt='Lookup'])[1]");
	public static final By TO_LEAD_LOOKUP = By.xpath("(//img[@alt='Lookup'])[2]");
	public static final By MERGE_BUTTON = By.linkText("Merge");

}
