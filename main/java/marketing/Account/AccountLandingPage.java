package marketing.Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketingAccountPageOR.MarketingAccountLandingPageOR;

public class AccountLandingPage extends MarketingAccountLandingPageOR{

	
	private Generic util;

	public AccountLandingPage(Generic util) {
		super(util);
		this.util = util;
		//PageFactory.initElements(util.getDriver(),this);
	}

	public CreatingNewAccount clickCreateAccountButton() {
		util.click(plushBT, "plus button");
		CreatingNewAccount create =new CreatingNewAccount(util);
		return create;
	}

	public AccountLandingPage deleteButton() {
		util.click(deleteBT, "delete button");
		util.popupAccept();
		return this;
	}

	public AccountLandingPage searchFor(String accountNo) {
		util.sendTextboxValue(searchEB, "search text box", accountNo);
		return this;
	}

	public AccountLandingPage searchNow() {
		util.click(submitBT, "search now button");
		util.click(chexBox, "checkBox");
		return this;
	}

}