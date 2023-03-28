package Godaddy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Go_daddy1 {
	
	public void maximizeBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.close();
	}

	public void pageTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
	driver.manage().window().maximize();
			String str=driver.getTitle();
		System.out.println("Go Daddy page title is..."+str);
	String strUrl=	driver.getCurrentUrl();
	System.out.println("Go Daddy Current page Url is..."+strUrl);
	driver.close();
	}

	public void validatePageTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title of page is validate");
		} else {
			System.out.println("Title of page is  not validate");
		}
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.godaddy.com/en-in";
		if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Url of current page is validate");
		} else {
			System.out.println("Url of current page is not validate");
		}
		String actualPageSource = driver.getPageSource();
		String expectedPageSource = "";
		driver.close();
	}

	public static void main(String[] args) {
		Go_daddy1 gd = new Go_daddy1();
		gd.maximizeBrowser();
		gd.pageTitle();
		gd.validatePageTitle();
	}

}
