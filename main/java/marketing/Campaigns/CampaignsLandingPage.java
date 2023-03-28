package marketing.Campaigns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginPage;
import marketingCampaignsOR.CampaignsLandingPageOR;

public class CampaignsLandingPage extends CampaignsLandingPageOR {


	private Generic util;

	public CampaignsLandingPage(Generic util) {
		super(util);
		this.util = util;
	}

	public CreatingNewCampaigns createCampaignsAccount() {
		util.actionMouseOver(marketingBT);
		util.click(campaignsBT, "campaigns");
		util.click(plusBT, "plus button");
		CreatingNewCampaigns camp = new CreatingNewCampaigns(util);
		return camp;
	}
}
