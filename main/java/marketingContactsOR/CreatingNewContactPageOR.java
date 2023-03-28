package marketingContactsOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BasePageClass;
import basePage.basePageOR;
import frameWork.Generic;

public class CreatingNewContactPageOR extends BasePageClass{
	Generic util;
	public CreatingNewContactPageOR(Generic util) {
		super(util);
		this.util=util;
		PageFactory.initElements(util.getDriver(),this);

	}
	
	@FindBy(name="firstname")
	protected WebElement firstNameEB;
	
	@FindBy(name="lastname")
	protected WebElement lastNameEB;
	
	@FindBy(name="mobile")
	protected WebElement mobileNameEB;
	
	@FindBy(name="email")
	protected WebElement emailEB;
	
	@FindBy(name="firstname")
	protected WebElement firstNamepatriEB;
	
}
