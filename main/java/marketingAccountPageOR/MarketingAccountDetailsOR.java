package marketingAccountPageOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BasePageClass;
import frameWork.Generic;

public class MarketingAccountDetailsOR extends BasePageClass {
	
	private Generic util;

public	MarketingAccountDetailsOR(Generic util){
	super(util);
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
	}

//public void deleteButton() {
//	
//	MarketingAccountDetailsOR mr= new MarketingAccountDetailsOR(util);
//	mr.commonDeleteButton();
//}
	@FindBy(linkText = "lucknow.com")
	protected WebElement linkTextEB;
	
	
}
