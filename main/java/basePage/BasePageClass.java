package basePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameWork.Generic;
import loginpages.LoginPage;

public class BasePageClass extends basePageOR {
	Generic util;
	public BasePageClass(Generic util) {
		super(util);
		this.util=util;
		}
	public void commonDeleteButton() {
		util.click(weDeleteButton, "delete");
			}
	
	public void commonSendMailButton() {
		util.click(weSendmailButton, "Edit");
	}

	public void commonMassEditButton() {
		util.click(weMassEditButton,"massEdit");
	}
	public void commonSendSMSButton() {
		util.click(weSendSMSButton,"massEdit");
	}
}
