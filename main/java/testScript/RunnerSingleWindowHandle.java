package testScript;

import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginPage;
import myHomePage.home.AboutUs;
import myHomePage.home.AboutUsClose;
import myHomePage.home.AboutUsWindowHandle;

public class RunnerSingleWindowHandle {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("multiWindow", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver", "http://localhost:8888/");
		LoginPage login = new LoginPage(util);
		login.loginPage();
		AboutUs aboutUs = new AboutUs(util);
		AboutUsWindowHandle window = aboutUs.ClickOnAboutUs();
		AboutUsClose close = window.clickOnWindow();
		close.clickOnCloseButton();
		util.flushNew();
	}
}
