package vtigerAutomate;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {
	static WebDriver driver=null;
	static ExtentTest test1=null;
public static void screenShot(String fileLocation) throws IOException {
	TakesScreenshot scr = (TakesScreenshot) driver;
	File from1 = scr.getScreenshotAs(OutputType.FILE);
	File to1 = new File(fileLocation);
	Files.copy(from1, to1);
	test1.addScreenCaptureFromPath(to1.getAbsolutePath());
}
	public static void main(String[] args) throws IOException {

		File fl = new File("VtigerFile//lead.html");
		ExtentSparkReporter ext = new ExtentSparkReporter(fl);
		ExtentReports report = new ExtentReports();
		report.attachReporter(ext);
		report.setSystemInfo("User Name", System.getProperty("user.name"));
		report.setSystemInfo("Tester Name", "Srita Yadav");
		ExtentTest test = report.createTest("TC 001");
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		test.log(Status.INFO, "Chrome browser is launched succesfully");
		driver.get("http://localhost:8888/");
		test.log(Status.INFO, "URL is hited succesfully");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		test.log(Status.PASS, "User name is entered succesfully in user box");
		driver.findElement(By.name("user_password")).sendKeys("sarita");
		test.log(Status.PASS, "User password is entered succesfully in password box");
		driver.findElement(By.name("Login")).click();
		test.log(Status.PASS, "click on login button is succesfully");
		TakesScreenshot scr = (TakesScreenshot) driver;
		File from = scr.getScreenshotAs(OutputType.FILE);
		File to = new File("leadScshot.png");
		Files.copy(from, to);
		test.addScreenCaptureFromPath(to.getAbsolutePath());
		
		 test1 = report.createTest("TC 002");
driver.findElement(By.xpath("//a[text()='Marketing']")).click();
		test1.log(Status.PASS, "Click on marketing module");
		driver.findElement(By.xpath("//td//td//a[text()='Leads']")).click();
		test1.log(Status.PASS, "Click on lead  subModule");
		Lead.screenShot("leadScshot1.png");
//		TakesScreenshot scr1 = (TakesScreenshot) driver;
//		File from1 = scr.getScreenshotAs(OutputType.FILE);
//		File to1 = new File("leadScshot1.png");
//		Files.copy(from1, to1);
//		test1.addScreenCaptureFromPath(to1.getAbsolutePath());
		report.flush();

	}
}
