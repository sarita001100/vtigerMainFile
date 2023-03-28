package testScript;

import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginPage;
import marketing.Campaigns.CampaignsLandingPage;
import marketing.Campaigns.CreatingNewCampaigns;

public class RunnerCampaignInformation {

	public static void main(String[] args) {
		Generic util = new Generic();
		util.extentReport("camp", "TC001");
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
		LoginPage login =new LoginPage(util);
		login.loginPage();
		CampaignsLandingPage landingPage =new CampaignsLandingPage(util);
		CreatingNewCampaigns camp = landingPage.createCampaignsAccount();
		camp.createAccount();
		util.flushNew();
	}
}
