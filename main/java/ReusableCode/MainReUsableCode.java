package ReusableCode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class MainReUsableCode {

	@FindBy(name="user_name")
	private WebElement userNameEB;
	
	@FindBy(name="user_password")
	private WebElement userpasswordEB;
	
	@FindBy(name="Login")
	private WebElement loginBT;
	
  @FindBy(xpath="//td/a[text()='Marketing']")
	private WebElement marketingBT;
	
  @FindBy(xpath="//td/a[text()='Marketing']")
	private WebElement marketingBT2;
  
  @FindBy(xpath="//td[@class='level2UnSelTab']//a[text()='Leads']")
	private WebElement leadBT;
	
  private Generic util;
  public MainReUsableCode(Generic util) {
	  this.util=util;
	  PageFactory.initElements(util.getDriver(),this);
  }
  
	public void reUsableLoginCode() {
		util.launchBrowserAndOpenUrl("chromeDriver","http://localhost:8888/");
        util.waitSetImplicitWait(5);
		util.windowMaximize();
		util.sendTextboxValue(userNameEB, "userName", "admin");
		util.sendTextboxValue(userpasswordEB, "userPassword", "sarita");
		util.click(loginBT, "loginButtonImage");
	}

	public void clickonMarketing() {
		MainReUsableCode mainObj=new MainReUsableCode(util);
 mainObj.reUsableLoginCode();
		util.click(marketingBT, "marketing");
}
public void clickOnLead() {
	MainReUsableCode mainObj=new MainReUsableCode(util);

	mainObj.reUsableLoginCode();
	util.click(marketingBT2, "marketing");
  util.click(leadBT, "lead");
}
	public String reUsableDateAndTime() {
		DateFormat df = new SimpleDateFormat("MM_dd_yyyy__hh_mm_ss");
		return df.format(new Date());
	}

	

}
