package myHomePageHomeOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class AboutUsOR {
	Generic util;
	
	public AboutUsOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	
	@FindBy(linkText = "About Us")
	protected WebElement aboutUsBT;

}
