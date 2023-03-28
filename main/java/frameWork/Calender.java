package frameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calender {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("calender", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");// launchBrowser method call
		// util. waitSetImplicitWait(5);
		WebElement userNameObj = util.getDriver().findElement(By.name("user_name"));
		util.sendTextboxValue(userNameObj, "userName", "admin");
		WebElement userPasswordObj = util.getDriver().findElement(By.name("user_password"));
		util.sendTextboxValue(userPasswordObj, "userPassword", "sarita");
		WebElement clickObj = util.getDriver().findElement(By.name("Login"));
		util.click(clickObj, " loginButtonImage");
		// util.click("linkText", "Marketing", "homePage");
		util.waitImplicit(10);
		WebElement clickObj1 = util.getDriver().findElement(By.xpath("//td//img[@title='Open Calendar...']"));
		util.click(clickObj1, "calender");
		util.flushNew();
	}

}
