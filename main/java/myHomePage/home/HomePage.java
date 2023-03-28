package myHomePage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketing.Account.AccountLandingPage;
import myHomePageHomeOR.HomePageOR;

public class HomePage extends HomePageOR{

	
	private Generic util;

	public HomePage(Generic util) {
		super(util);
		this.util = util;

	}

	public AccountLandingPage gotoMarketingAccountLandingPage() {
		util.actionMouseOver(marketingSBM);
		util.click(accountSBM, "Account Link");
		AccountLandingPage LandingPage=new AccountLandingPage(util);
		return LandingPage;
	}

	public void giveTitleName() {
		util.giveTitleName(hmPageTitle, "home page title"); 
	}

	public void topAccountDragAndDrop() {
		util.doDragAndDrop(dragElement, dropElement, "top");

	}

	public void clickOnMyHomePage() {
		util.click(myHomePage, "my home page");

	}

	public void colorOfElement() {
//		PageFactory.initElements(util.getDriver(), this);
		util.colorOrBackGroundColorOfElement(findColor, "color", "#33338c");
	}

	public void clickOnCalendar() {
		util.click(calender, "calender");
		// util.click("linkText","22","date");
	}

}
