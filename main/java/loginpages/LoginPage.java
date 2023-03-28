
package loginpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;
import loginPage.OR.LoginPageOR;
import myHomePage.home.HomePage;

public class LoginPage extends LoginPageOR {

	//private Generic util;
//	private String browserName="chromeDriver";
//	private String urlName="http://localhost:8888/";
//	
	
   private String colorThemeOptionName="softed";
   private String wrongUserBoxValue="adm";
   private String wrongUserPasswordBoxvalue="sam";
  
   
    private String languageOptionName="US English";
    
   private  Generic util;
   
     public LoginPage(Generic util) {
    	 super(util);
    this.util=util;
    }
   
	public void loginPage() {
		//PageFactory.initElements(util.getDriver(),this);;
		util.sendTextboxValue(userNameED, "userName","admin" );
		util.sendTextboxValue(userPasswordED,"userPassword","sarita" );
		util.click(loginBt, "loginButtonImage");
//		HomePage home =PageFactory.initElements(util.getDriver(),HomePage.class);;
//		return home;
	}

	public void enterTextBoxValue() {
		//util.launchBrowser("chromeDriver");
        //util.openUrl("http://localhost:8888/");
		util.sendTextboxValue(userNameED, "userName","admin");
		util.sendTextboxValue(userPasswordED, "userPassword","sarita");

	}

	public void validlogin() {
		enterTextBoxValue();
		util.click(loginBt," loginButtonImage");
	}

	public void inValidLogin() {
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
     //   util.openUrl("http://localhost:8888/");
		util.windowMaximize();
		util.sendTextboxValue(userNameED, "userName",wrongUserBoxValue);
		util.sendTextboxValue(userPasswordED, "userPassword",wrongUserPasswordBoxvalue);
		util.click(loginBt, " loginButtonImage");
	}

	public void changeColor() {
		util.selectByText(colorThemeDD,"color theme",colorThemeOptionName);
	}

	public void changeLanguage() {
		util.selectByText(languageBoxDD,"language",languageOptionName);
	}

}
