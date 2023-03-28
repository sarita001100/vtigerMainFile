package loginPage.OR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BasePageClass;
import frameWork.Generic;

public class LoginPageOR extends BasePageClass{
	private Generic util;
	 public LoginPageOR(Generic util){
		 super(util);
		 this.util=util;
	    	PageFactory.initElements(util.getDriver(),this);
}

	@FindBy(xpath="//input[@name='user_name']")
    protected WebElement userNameED;
    
	@FindBy(xpath="//input[@name=\"user_password\"]")
	protected WebElement userPasswordED;
	
	@FindBy(name="Login")
	protected WebElement loginBt;
	
    @FindBy(name="login_theme")
    protected WebElement colorThemeDD;
    
    @FindBy(name="login_language")
    protected WebElement languageBoxDD;
    
    
    //loginTestScript
//    @FindBy(name = "user_name"
//	protected WebElement userNameED;
//validLogin
//    @FindBy(name = "user_name")
//	private WebElement userNameED;
//
//
//	@FindBy(name = "user_password")
//	private WebElement userPasswordED;
//
//	@FindBy(name = "Login")
//	private WebElement loginBt;
//
   
}
