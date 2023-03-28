package marketingAccountPageOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MarketingValidateAccountInformationOR {
	
	Generic util;
	public MarketingValidateAccountInformationOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);
}
	
	@FindBy(xpath = "//td[@class=\"dvtTabCache\"]//input[@title=\"Edit [Alt+E]\"]")
	protected WebElement weEdit;

	@FindBy(xpath = "//td[@class=\"dvtTabCache\"]//input[@title=\"Duplicate [Alt+U]\"]")
	protected WebElement duplicateBT;

	@FindBy(xpath = "//td[@class=\"dvtTabCache\"]//input[@title=\"Delete [Alt+D]\"]")
	protected WebElement deleteBT;

	@FindBy(xpath = "//span[@id=\"dtlview_Account Name\"]")
	protected WebElement accountNameEB;
	
	@FindBy(linkText="www.vtigger.com")
	protected WebElement websiteName; 
	
	@FindBy(xpath = "//span[@id=\"dtlview_Phone\"]")
	protected WebElement phoneEB;
	
	@FindBy(xpath = "//span[@id=\"dtlview_Billing City\"]")
	protected WebElement bilingEB;
	
	
	
}
