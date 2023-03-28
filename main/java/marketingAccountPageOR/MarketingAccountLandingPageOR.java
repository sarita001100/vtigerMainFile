package marketingAccountPageOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingAccountLandingPageOR {
Generic util;
	public MarketingAccountLandingPageOR(Generic util){
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
	}
		@FindBy(xpath = "//img[@title='Create Account...']")
		protected WebElement plushBT;

		@FindBy(xpath = "//input[@value=\"Delete\"]")
		protected WebElement deleteBT;

		@FindBy(xpath = "//input[@name=\"search_text\"]")
		protected WebElement searchEB;

		@FindBy(xpath = "//input[@name=\"submit\"]")
		protected WebElement submitBT;

		@FindBy(xpath = "//input[@name=\"selected_id\"]")
		protected WebElement chexBox;

		
	}
	
	
	

