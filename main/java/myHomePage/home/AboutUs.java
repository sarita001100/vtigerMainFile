package myHomePage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import myHomePageHomeOR.AboutUsOR;

public class AboutUs extends AboutUsOR{

	@FindBy(linkText = "About Us")
	private WebElement aboutUsBT;

	private Generic util;
		public AboutUs(Generic util) {
			super(util);
	this.util = util;
	}

	public AboutUsWindowHandle ClickOnAboutUs() {
		util.click(aboutUsBT, "about us button");
		AboutUsWindowHandle window =new AboutUsWindowHandle(util) ;
		return window;
	}
}
