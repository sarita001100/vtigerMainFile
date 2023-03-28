package marketingAccountPageOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingAccountLeadsOR {
	
	Generic util;
	public MarketingAccountLeadsOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	
	@FindBy(linkText="Marketing")
	protected WebElement marketMO;
	
	@FindBy(linkText="Leads")
	protected WebElement leadBT;
	
}
