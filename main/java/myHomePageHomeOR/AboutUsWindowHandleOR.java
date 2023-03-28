package myHomePageHomeOR;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameWork.Generic;

public class AboutUsWindowHandleOR {
	Generic util;
	public AboutUsWindowHandleOR(Generic util) {
		this.util=util;
		
	}
	
	@FindBy(linkText="Contact Us")
	protected WebElement contactBT; 
	
	@FindBy(xpath="//a[@class=\"btn btn-sm btn-primary lift mr-lg-4 mr-1\"]")
	protected WebElement primaryBT; 
	
	@FindBy(xpath="//tr//td")
	protected List<WebElement> loopList; 
	
}
