package myHomePage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import myHomePageHomeOR.AboutUsCloseOR;

public class AboutUsClose extends AboutUsCloseOR{

	
	private Generic util;
	
	public AboutUsClose(Generic util) {
		super(util);
		this.util=util;
	}
	
	public void clickOnCloseButton() {
		util.click(closeBT,"close button");

	}
}
