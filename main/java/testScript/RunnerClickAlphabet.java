package testScript;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import frameWork.Generic;
import marketing.Account.Campaigns;

public class RunnerClickAlphabet {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("alphabet", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver", "http://localhost:8888/");
		Campaigns campOb = new Campaigns(util);
		campOb.clickOnAlphabet();
		util.flushNew();
	}
}
