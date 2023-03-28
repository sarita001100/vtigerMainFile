package marketing.Account;

import frameWork.Generic;
import marketingAccountPageOR.MarketingAccountPageCampaignsOR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BasePageClass;
import basePage.basePageOR;

public class Campaigns extends MarketingAccountPageCampaignsOR{
	private Generic util;

public Campaigns(Generic util) {
	super(util);
	this.util=util;
	//PageFactory.initElements(util.getDriver(),this);
}
	public void clickOnAlphabet() {
		Leads leadobj =new Leads(util);
		leadobj.clickOnLead();
		util.forLoopWithList(new MarketingAccountPageCampaignsOR(util).get(), "s");
//		BasePageClass bpor=	new BasePageClass(util);
//		//bpor.commonDeleteButton();
//		bpor.commonMassEditButton();
//		List<WebElement> ele = util.getWebElements("xpath", "//td[@class=\"searchAlph\"]");
//		ArrayList<String> all = new ArrayList<String>();
//		for (int i = 0; i <= ele.size() - 1; i++) {
//			WebElement get = ele.get(i);
//			String text = get.getText();
//			System.out.println(text);
//			all.add(text);
//			if (text.equalsIgnoreCase(alphabet)) {
//				get.click();
//				test.log(com.aventstack.extentreports.Status.INFO, "  it is clicked succesfully on alphabet ");
//			}
//		}
//		test.log(com.aventstack.extentreports.Status.PASS, "It is clicked on alphabet" + all);
	}

}
