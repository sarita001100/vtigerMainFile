package marketing.Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketingAccountPageOR.MarketingCreatingNewAccountOR;

public class CreatingNewAccount extends MarketingCreatingNewAccountOR{
	
	
	private Generic util;
	public CreatingNewAccount (Generic util) {
		super(util);
		this.util=util;
	}
	
	public void createAccount() {
		util.sendTextboxValue(accountBox, "account name", "lucknow.com");
		util.sendTextboxValue(websiteBox, "website name", "www.vtigger.com");
		util.sendTextboxValue(phoneBox, "phone number", "7800470491");
		util.sendTextboxValue(bilingBox, "biling city", "goa");
		
	}

	public void saveAccount() {
		util.click(saveBT, "save button");
	}

	public void cancelAccount() {
		util.click(cancelBT, "cancel button");

	}
}
