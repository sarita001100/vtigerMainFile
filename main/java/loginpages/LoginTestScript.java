package loginpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginPage.OR.LoginPageOR;

public class LoginTestScript extends LoginPageOR{

	// private String browserName="chromeDriver";
	// private String urlName="http://localhost:8888/";

	
	Generic util;
    public LoginTestScript(Generic util) {
    	super(util);
   this.util=util;
   //	PageFactory.initElements(util.driver,this);
   }
  

	public void validateColorOfLoginTheme() {
		LoginPage login =new LoginPage(util);
		login.enterTextBoxValue();
		login.changeColor();
	}

	public void validateUser() {
//		util.load_PropFile();
//		util.launchBrowser(util.readDataFromPropertiesfile("browsername"),
//				util.readDataFromPropertiesfile("url"));
		
		util.sendTextboxValue(userNameED,"userName","admin" );

		//util.sendTextboxValue(userNameED, "userName", util.readDataFromPropertiesfile("username"));
		ValidLoginPage login = new ValidLoginPage(util);
		login.validateUserBox(util);
	}

}
