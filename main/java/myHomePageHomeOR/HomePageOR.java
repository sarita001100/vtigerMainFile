package myHomePageHomeOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameWork.Generic;

public class HomePageOR {
	Generic util;
	public HomePageOR(Generic util) {
		this.util=util;
		PageFactory.initElements(util.getDriver(), this);

	}
	
	@FindBy(linkText = "Marketing")
	protected WebElement marketingSBM;

	@FindBy(linkText = "Accounts")
	protected WebElement accountSBM;

	@FindBy(xpath = "//td[@class=\"moduleName\"]")
	protected WebElement hmPageTitle;

	@FindBy(xpath = "//tr[@id=\"headerrow_15\"]//b")
	protected WebElement dragElement;

	@FindBy(xpath = "//tr[@id=\"headerrow_12\"]//b")
	protected WebElement dropElement;

	@FindBy(xpath = "//a[text()='My Home Page']")
	protected WebElement myHomePage;

	@FindBy(xpath = "//td[@class='moduleName']")
	protected WebElement findColor;

	@FindBy(xpath = "//img[@title=\"Open Calendar...\"]")
	protected WebElement calender;

}
