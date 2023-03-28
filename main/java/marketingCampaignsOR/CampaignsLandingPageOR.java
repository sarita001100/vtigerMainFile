package marketingCampaignsOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class CampaignsLandingPageOR {
	Generic util;
	public CampaignsLandingPageOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	@FindBy(linkText="Marketing")
	protected WebElement marketingBT; 
	
	@FindBy(linkText="Campaigns")
	protected WebElement campaignsBT; 
	
	@FindBy(xpath="//img[@title=\"Create Campaign...\"]")
	protected WebElement plusBT; 
}
