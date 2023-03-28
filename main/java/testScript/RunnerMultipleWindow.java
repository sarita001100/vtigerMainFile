package testScript;

import org.openqa.selenium.support.PageFactory;

import com.vtiger.logout.LoggingOut;

import frameWork.Generic;
import loginpages.LoginPage;
import myHomePage.home.AboutUs;
import myHomePage.home.AboutUsWindowHandle;

public class RunnerMultipleWindow {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("multipleWindow", "TC001");
		util.waitImplicit(7);
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
		LoginPage login =new LoginPage(util);
		login.loginPage();
		AboutUs about =new AboutUs(util);
		AboutUsWindowHandle window = about.ClickOnAboutUs();
		window.windowHandle();
		window.scrollDown();
		window.contactUs();
		window.windowHandleByTitle();
		window.clickOnPrimaryButton();
		window.windowNotClose();
		LoggingOut out=window.windowHandleByTitle1();
		out.logout();
		util.flushNew();
	}

}
