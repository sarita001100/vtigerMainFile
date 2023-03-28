package marketingCampaignsOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingCreatingNewCampaignsOR {
	Generic util;
	public MarketingCreatingNewCampaignsOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	@FindBy(xpath="//input[@name=\"campaignname\"]")
	protected WebElement campaignBT;
	
	@FindBy(xpath="//img[@language=\"javascript\"]")
	protected WebElement plusCampBT;
	
	@FindBy(xpath="//td[@class='moduleName']")
	protected WebElement windowHand;
	
	@FindBy(xpath="//input[@value=\"  Save  \"]")
	protected WebElement windowSaveBT;
}
