package loginpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginPage.OR.LoginPageOR;

public class ValidLoginPage extends LoginPageOR{

	private Generic util;

	private String userBoxValue = "admin";

	private String userPasswordBoxValue="sarita"; 

	public ValidLoginPage(Generic util) {
		super(util);
		this.util = util;
	 //PageFactory.initElements(util.getDriver(),this);

	}

	public void validateUserBox(Generic util) {
		util.validateAttributeValue(userNameED, "user box", "value","value");
	}

	public void validatePasswordBox(Generic util) {
		util.validateAttributeValue(userPasswordED, "Password box", "value","value");

	}

	public void validateLoginButton(Generic util) {
		util.validateElementIsEnabled(loginBt, "login button");

	}
}
