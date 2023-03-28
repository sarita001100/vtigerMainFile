package marketingAccountPageOR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.basePageOR;
import frameWork.Generic;

public class MarketingAccountPageCampaignsOR extends basePageOR{

	Generic util;
	public MarketingAccountPageCampaignsOR(Generic util) {
		super(util);
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
}
	
	@FindBy(xpath = "//td[@class=\"searchAlph\"]")
	private List<WebElement> alphabetBox;

public List<WebElement> get() {
	return alphabetBox;
}
}
 