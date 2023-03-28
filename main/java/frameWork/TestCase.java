package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("size ", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");// launchBrowser method call
		util.waitSetImplicitWait(5);
		WebElement userNameObj = util.getDriver().findElement(By.name("user_name"));
		util.sendTextboxValue(userNameObj, "userName", "admin");
		WebElement userPasswordObj = util.getDriver().findElement(By.name("user_password"));

		util.sendTextboxValue(userPasswordObj, "userPassword", "sarita");
		// util.giveFirstSelected("xpath", "//select[@name='login_theme']");
//		util.giveAllOption("xpath", "//select[@name='login_theme']","colorTheme");
//		util.giveAllOption("name", "login_language","Language");
		// util.giveSelectedOption("xpath", "//select[@name='login_theme']");
		// util.giveSize("name", "Login", " loginButtonImage");
		WebElement loginObj = util.getDriver().findElement(By.name("Login"));

		util.validateSize(loginObj, " loginButtonImage", 138, 40);
		util.validateLocation(loginObj, " loginButtonImage", 640, 350);
		util.click(loginObj, " loginButtonImage");
		WebElement markObj = util.getDriver().findElement(By.linkText("Marketing"));
		util.click(markObj, "homePage");
		WebElement validateObj = util.getDriver().findElement(By.xpath("//td[@class='moduleName']"));
		util.validateInnerText(validateObj, "my home page header", "My Home Page > Home");
		WebElement validateattributeObj = util.getDriver().findElement(By.className("searchBtn"));
		util.validateAttributeValue(validateattributeObj, "find button", "value", "Find");
		// util.validateInnerText("xpath", "//td[@class=\"moduleName\"]", "home Page
		// header",
		// "My Home Page > Home");
		// util.validateSize("name", "Login", " loginButtonImage", null);
		util.flushNew();

	}

}
