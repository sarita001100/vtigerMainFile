package marketingContactsOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingContactsLeadingPageOR {

	Generic util;
	public MarketingContactsLeadingPageOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	@FindBy(linkText="Contacts")
	protected WebElement contactBT;
	
	@FindBy(xpath="//img[@title=\"Create Contact...\"]")
	protected WebElement pluscontactBT;
}
