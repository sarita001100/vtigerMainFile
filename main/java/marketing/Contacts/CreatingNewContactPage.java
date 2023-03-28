package marketing.Contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import marketingContactsOR.CreatingNewContactPageOR;

public class CreatingNewContactPage extends CreatingNewContactPageOR{

	
	
	private Generic util;
	public CreatingNewContactPage(Generic util) {
		super(util);
		this.util=util;
	}
	public void contactInformation() {
		
		util.sendTextboxValue(firstNameEB, "first name","Patricia");
		util.sendTextboxValue(lastNameEB, "last name","Johnsons");
		util.sendTextboxValue(mobileNameEB, "mobile","6757478388");
		util.sendTextboxValue(emailEB, "email name","India@company.com");
		util.sendTextboxValue(firstNamepatriEB, "first name","Patricia");

	}
	
}
////td[@class="dvtTabCacheBottom"]//input[@title="Edit [Alt+E]"]