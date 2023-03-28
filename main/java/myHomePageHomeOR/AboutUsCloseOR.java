package myHomePageHomeOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class AboutUsCloseOR {
	Generic util;
	public AboutUsCloseOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
}
	@FindBy(name="close")
	protected WebElement closeBT;
	
}
