
package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCasesByRoshan {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestCasesByRoshan tcByr = new TestCasesByRoshan();
		//tcByr.testCase001();
	//	tcByr.testCase002();
		tcByr.testCase003();
	}

	public void testCase001() {
		Generic util = new Generic();
		util.extentReport("validateSize", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");// launchBrowser method call
		WebElement userNameObj = util.getDriver().findElement(By.name("user_name"));
		util.validateSize(userNameObj, "usernameBox", 149, 22);
		WebElement userPasswordObj = util.getDriver().findElement(By.name("user_password"));
		util.validateSize(userPasswordObj, "userPassword", 149, 22);
		WebElement clickObj = util.getDriver().findElement(By.name("Login"));
		util.validateSize(clickObj, "loginButton", 138, 40);
		util.flushNew();
	}

	public void testCase002() {
		Generic util = new Generic();
		util.extentReport("validateLocation", "TC002");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");// launchBrowser method call
		WebElement userNameObj = util.getDriver().findElement(By.name("user_name"));
		util.validateLocation(userNameObj, "usernameBox", 640, 230);
		WebElement userPasswordObj = util.getDriver().findElement(By.name("user_password"));
		util.validateLocation(userPasswordObj, "userPassword", 640, 262);
		WebElement clickObj = util.getDriver().findElement(By.name("Login"));
		util.validateLocation(clickObj, "loginButton", 640, 350);
		util.flushNew();
	}

	public void testCase003() {
		Generic util = new Generic();
		util.extentReport("creatLead", "TC003");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");// launchBrowser method call
		util.windowMaximize();
		// util.getWebElement("name", "user_name");
		WebElement userNameObj = util.getDriver().findElement(By.name("user_name"));

		util.sendTextboxValue(userNameObj, "usernameBox", "admin");
		WebElement userPasswordObj = util.getDriver().findElement(By.name("user_password"));

		util.sendTextboxValue(userPasswordObj, "passwordBox", "sarita");
		WebElement clickObj = util.getDriver().findElement(By.name("Login"));
		util.click(clickObj, "loginButton");
		WebElement clickMarketObj = util.getDriver().findElement(By.xpath("//td/a[text()='Marketing']"));
		util.click(clickMarketObj, "marketing");
		WebElement clickLeadtObj = util.getDriver().findElement(By.xpath("//td[contains(@class,'level2')]/a[text()='Leads']"));
		util.click(clickLeadtObj, "lead");
		WebElement clickCreateLeadtObj = util.getDriver().findElement(By.xpath("//img[@title=\"Create Lead...\"]"));
		util.click(clickCreateLeadtObj, "creat lead");
		WebElement firstNameObj = util.getDriver().findElement(By.name("firstname"));
		util.sendTextboxValue(firstNameObj, "firstnameBox", "sarita");
		WebElement lastNameObj = util.getDriver().findElement(By.name("lastname"));
		util.sendTextboxValue(lastNameObj, "lastnameBox", "yadav");
		WebElement companyNameObj = util.getDriver().findElement(By.name("company"));
		util.sendTextboxValue(companyNameObj, "companyBox", "<Expert View Automation>");
		WebElement designNameObj = util.getDriver().findElement(By.id("designation"));
		util.sendTextboxValue(designNameObj, "TitleBox", "<Hi This Is Sarita Yadav Task To Create New Lead>");
		WebElement phoneNameObj = util.getDriver().findElement(By.id("phone"));
		util.sendTextboxValue(phoneNameObj, "phoneBox", "<26844334>");
		WebElement emailNameObj = util.getDriver().findElement(By.id("email"));
		util.sendTextboxValue(emailNameObj, "emailBox", "ysarita1110@gmail.com");
		WebElement laneNameObj = util.getDriver().findElement(By.name("lane"));
		util.sendTextboxValue(laneNameObj, "streetBox", "<Bhadohi>");
		WebElement countryNameObj = util.getDriver().findElement(By.name("country"));
		util.sendTextboxValue(countryNameObj, "countryBox", "<India>");
		util.attachScreenshot("details page of lead.png");
		WebElement saveObj = util.getDriver().findElement(By.xpath("//input[@class='crmbutton small save']"));
		util.click(saveObj, "saveButton");
		util.flushNew();
	}
}
