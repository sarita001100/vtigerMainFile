package marketing.Campaigns;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginpages.LoginPage;
import marketingCampaignsOR.MarketingCreatingNewCampaignsOR;

public class CreatingNewCampaigns extends MarketingCreatingNewCampaignsOR{

	private Generic util;
	
	public CreatingNewCampaigns(Generic util) {
		super(util);
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
	}
	public void createAccount() {
		util.sendTextboxValue(campaignBT, "campaign name", "sarita.smile");
		util.click(plusCampBT, "plus button");
		 util.windowHandlesByURL("window","http://localhost:8888/index.php?module=Campaigns&action=EditView&return_action=DetailView&parenttab=Marketing");
		util.windowHandle(windowHand, "window");
		util.click(windowSaveBT, "save button");
	}
}
