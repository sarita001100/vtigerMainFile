package marketing.Contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketingContactsOR.MarketingContactsLeadingPageOR;

public class MarketingContactsLandingPage extends MarketingContactsLeadingPageOR{

	private Generic util;

	public MarketingContactsLandingPage(Generic util) {
		super(util);
		this.util = util;
	}

	public void clickOnContacts() {
		util.click(contactBT, "contactc button");
	}

	public void clickOnplusButton() {
		util.click(pluscontactBT, "plus button");
	}

}
