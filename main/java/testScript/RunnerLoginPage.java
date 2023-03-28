package testScript;

import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginPage;
import loginpages.LoginTestScript;
import myHomePage.home.HomePage;

public class RunnerLoginPage {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("title", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
		LoginPage login = new LoginPage(util);
		login.loginPage();
		//login.validlogin();
//		LoginTestScript script=	new LoginTestScript(util);
//		script.validateColorOfLoginTheme();
		HomePage homeObj= new HomePage(util);
	homeObj.giveTitleName();
		homeObj.colorOfElement();
		homeObj.clickOnCalendar();
	util.flushNew();
	
	
	
	
	
	
	
	}

}
