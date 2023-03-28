package vtigerAutomate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Proper_ties {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		FileInputStream stream=	new FileInputStream("C:\\Users\\moni\\Desktop\\saritaeclipse\\vtigerAutomation\\Students.properties\\class.properties");
		Properties proper=     new Properties();
		proper.load(stream);
	String as=	proper.getProperty("StudentName");
		proper.getProperty("StudentClass");
driver.findElement(By.name("user_name")).sendKeys(as);
	}

}
