package marketing.Account;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.*;
import loginpages.LoginPage;
import marketingAccountPageOR.MarketingAccountLeadsOR;

public class Leads extends MarketingAccountLeadsOR{

	private Generic util;

public Leads(Generic util) {
	super(util);
	this.util=util;
}

	public void clickOnLead() {
		LoginPage login =new LoginPage(util);
		login.loginPage();
		util.actionMouseOver(marketMO);
     util.click(leadBT,"Lead button");
	}

	
	

}
