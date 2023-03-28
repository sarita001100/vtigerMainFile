package testScript;

import org.openqa.selenium.support.PageFactory;

import com.vtiger.logout.LoggingOut;

import frameWork.Generic;
import loginpages.LoginPage;
import marketing.Account.AccountDetails;
import marketing.Account.ValidateAccountInformation;

public class RunnerForAccount {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("details", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver", "http://localhost:8888/");
		LoginPage login = new LoginPage(util);
		login.loginPage();
		AccountDetails account = new AccountDetails(util);
		ValidateAccountInformation verify = account.clickOnSingleElement();
		util.waitImplicit(5);
		verify.verifyAccountName();
		verify.phoneNumber();
		verify.websiteName();
		verify.bilingCity();
		util.flushNew();
	}
}
