package marketing.Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketingAccountPageOR.MarketingValidateAccountInformationOR;

public class ValidateAccountInformation extends MarketingValidateAccountInformationOR{

	
	private Generic util;
	
	public ValidateAccountInformation (Generic util) {
		super(util);
		this.util=util;
	}
	
	public void clickOnEditButton(Generic util) {
		util.click(weEdit, "Edit button");
	}

	public void clickOnDuplicateButton(Generic util) {
		util.click(duplicateBT, "duplicate button");
	}

	public void clickOnDeleteButton(Generic util) {
		util.click(deleteBT, "delete button");
	}

	/*
	 * below is validation method
	 */
	public void verifyAccountName() {
		util.validateInnerText(accountNameEB, "account name", "lucknow.com");
	}

	public void websiteName() {
		util.validateInnerText(websiteName, "website name", "www.vtigger.com");
	}

	public void phoneNumber() {
		util.validateInnerText(phoneEB, "phone number", "7800470491");
	}

	public void bilingCity() {
		util.validateInnerText(bilingEB, "biling city", "goa");
	}
}
