package marketing.Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.*;
import marketingAccountPageOR.MarketingAccountDetailsOR;
import myHomePage.home.HomePage;

public class AccountDetails extends MarketingAccountDetailsOR{

	
	private Generic util;

	public AccountDetails(Generic util) {
		super(util);
		this.util = util;
	}

	public void verifyCreateAccount(Generic util) {
		HomePage home =new HomePage(util);
		AccountLandingPage account = home.gotoMarketingAccountLandingPage();
		CreatingNewAccount create = account.clickCreateAccountButton();
		create.createAccount();
		create.saveAccount();

	}

	public ValidateAccountInformation clickOnSingleElement() {
		HomePage home =new HomePage(util);
		home.gotoMarketingAccountLandingPage();
		util.scrollwithJavaScriptusingCoordinates(0, 200);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		util.click(linkTextEB, "cityname");
		ValidateAccountInformation verify =new ValidateAccountInformation(util);
		return verify;
	}

	public void verifyDeleteAccount(String accountNumber) {
		HomePage home =new HomePage(util);
		AccountLandingPage LandingPage = home.gotoMarketingAccountLandingPage();
		LandingPage.searchFor(accountNumber).searchNow().deleteButton();
	}

}
