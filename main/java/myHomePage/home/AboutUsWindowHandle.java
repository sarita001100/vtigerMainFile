package myHomePage.home;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.logout.LoggingOut;

import frameWork.Generic;
import myHomePageHomeOR.AboutUsWindowHandleOR;

public class AboutUsWindowHandle extends AboutUsWindowHandleOR{

	
	private Generic util;

	public AboutUsWindowHandle(Generic util) {
		super(util);
		this.util = util;
		PageFactory.initElements(util.getDriver(),this);
	}

	public void windowHandle( ) {
		util.windowHandlesByURL("window", "http://localhost:8888/index.php?module=Users&action=about_us");
	}

	public void scrollDown() {
		util.scrollwithJavaScriptusingCoordinates(0, 200);
	}

	public void contactUs() {
		util.click(contactBT, "contact");
	}

	public void windowHandleByTitle() {
		util.windowHandlesByTitle("window", " Contact Us | Vtiger CRM ");
	}

	public LoggingOut windowHandleByTitle1() {
		util.windowHandlesByTitle("window", "http://localhost:8888/index.php?action=index&module=Home");
		LoggingOut out = new LoggingOut(util);
		return out;
	}

	public void clickOnPrimaryButton() {
		util.click(primaryBT, "primary button");
	}

	public void windowNotClose() {
		util.windowHandlesNotCloseByUrl("window", "http://localhost:8888/index.php?action=index&module=Home");

	}

	public AboutUsClose clickOnWindow() {
		util.windowHandlesByTitle("window", "vtiger CRM 5 - Free, Commercial grade Open Source CRM");
		util.forLoopWithList(loopList, "");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AboutUsClose close =new AboutUsClose(util);
		return close;
	}
}
