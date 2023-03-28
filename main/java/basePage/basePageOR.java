package basePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class basePageOR  {
	Generic util;
	public basePageOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
	}

	@FindBy(xpath = "//table[@class='small']//input[@value=\"Delete\"]")
	protected WebElement weDeleteButton;
	
	@FindBy(xpath = "//table[@class='small']//input[@value=\"Send Mail\"]")
	protected WebElement weSendmailButton;

	@FindBy(xpath="//table[@class='small']//input[@value=\"Mass Edit\"]")
	protected WebElement weMassEditButton;
	
	@FindBy(xpath = "//table[@class='small']//input[@value=\"Send SMS\"]")
	protected WebElement weSendSMSButton;
}
