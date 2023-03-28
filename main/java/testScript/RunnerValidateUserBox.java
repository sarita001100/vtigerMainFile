package testScript;

import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginTestScript;

public class RunnerValidateUserBox {
	 public static void main(String[] args) {
			Generic util = new Generic();
			util.extentReport("login", "001");
			util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
			LoginTestScript loginTes = new LoginTestScript(util);
			loginTes.validateUser();
			loginTes.validateColorOfLoginTheme();
			util.flushNew();
		}

}
