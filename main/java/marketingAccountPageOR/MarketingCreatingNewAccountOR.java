package marketingAccountPageOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingCreatingNewAccountOR {
	private Generic util;
	
	public MarketingCreatingNewAccountOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
}
	@FindBy(name="accountname")
	protected WebElement accountBox;
	
	@FindBy(name="website")
	protected WebElement websiteBox;
	
	@FindBy(name="phone")
	protected WebElement phoneBox;
	
	@FindBy(name="bill_city")
	protected WebElement bilingBox;
	
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"][1]")
	protected WebElement saveBT;
	
	@FindBy(xpath="//input[@title=\"Cancel [Alt+X]\"]")
	protected WebElement cancelBT;
	
}
