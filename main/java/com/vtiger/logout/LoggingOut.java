package com.vtiger.logout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameWork.Generic;
import loginpages.LoginPage;

public class LoggingOut {
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logOutBT;
	
	
	private Generic util;
	public LoggingOut(Generic util) {
		this.util= util;
		
	}
	
	public LoginPage logout() {
		util.click(logOutBT, "log out");
		LoginPage lg= new LoginPage(util);
		return lg;
	}

}
