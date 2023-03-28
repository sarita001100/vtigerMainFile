package Godaddy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Go_daddy2 {

	public void firstMenu() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("id-d6f9deab-d554-45df-a52c-8a9ab53948b5")).click();
		driver.findElement(By.id("id-3a34578f-40f3-4d2f-aaa4-0a1320f3fe6a")).click();
		String actualTitle = driver.getTitle();
		// System.out.println(actualTitle);
		String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Expected title is passed");
		} else {
			System.out.println("Expected title is not passed");
		}
		driver.close();
	}

	public void allTheMenuLink() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("id-d6f9deab-d554-45df-a52c-8a9ab53948b5")).click();
		driver.findElement(By.id("id-3a34578f-40f3-4d2f-aaa4-0a1320f3fe6a")).click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Expected title is passed");
		} else {
			System.out.println("Expected title is not passed");
		}
		driver.findElement(By.className("path-desktop")).click();
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'menu fmenu')]"));
		for(int i=0; i<=list.size()-1;i++) {
			driver.findElements(By.xpath("//li[contains(@class,'menu fmenu')]"));
			WebElement t= list.get(i);
			System.out.println(  t.getText());
		}

//repeatation
//driver.findElement(By.id("id-d6f9deab-d554-45df-a52c-8a9ab53948b5")).click();
//driver.findElement(By.id("id-3a34578f-40f3-4d2f-aaa4-0a1320f3fe6a")).click();
//String actualTitle1=driver.getTitle();
//System.out.println(actualTitle);
//String expectedTitle1="GoDaddy Domain Search - Buy and Register Available Domain Names";
//if(actualTitle1.equalsIgnoreCase(expectedTitle1)) {
//System.out.println("Expected title is passed second time");
//}else {
//System.out.println("Expected title is not passed second time");
//}
	}

	public static void main(String[] args) throws InterruptedException {
		Go_daddy2 gd2 = new Go_daddy2();
		// gd2.firstMenu();
		gd2.allTheMenuLink();
	}

}
