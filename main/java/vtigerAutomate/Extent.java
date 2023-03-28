package vtigerAutomate;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;

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

public class Extent {
public static void main(String[] args) throws IOException {
	Date Tm = new Date(0);
	long time = Tm.getTime();
	ExtentSparkReporter spsrkObj = new ExtentSparkReporter("Folder//Stiger.html");
	ExtentReports reportsObj = new ExtentReports();
	reportsObj.attachReporter(spsrkObj);
	reportsObj.setSystemInfo("Os Name", System.getProperty("os.name"));
	reportsObj.setSystemInfo("User Name", System.getProperty("user.name"));
	reportsObj.setSystemInfo("Server Name", "QA server");
	reportsObj.setSystemInfo("Tester Name", "Sarita");
	ExtentTest test = reportsObj.createTest("TC001");

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	//WebDriverWait Explicit=	new	WebDriverWait(driver,Duration.ofSeconds(300));
	//Explicit.until(ExpectedConditions.visibilityOf(null));
	test.log(Status.INFO, "Browser is launched succesfully");

	driver.get("http://localhost:8888/");
	
	test.log(Status.INFO, "Url enterd succesfully");

	TakesScreenshot screenObj = (TakesScreenshot) driver;
	File from = screenObj.getScreenshotAs(OutputType.FILE);
	File to = new File( time + "sS.png");
	Files.copy(from, to);
	test.addScreenCaptureFromPath(to.getAbsolutePath());

	ExtentTest test1 = reportsObj.createTest("TC002");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	test1.log(Status.INFO, "User name enterd succesfully");
	driver.findElement(By.name("user_password")).sendKeys("sarita");
	test1.log(Status.INFO, "User password enterd succesfully");

	driver.findElement(By.name("Login")).click();
	test1.log(Status.INFO, "Login button  clicked succesfully");

	TakesScreenshot takeScreen = (TakesScreenshot) driver;
	File from1 = takeScreen.getScreenshotAs(OutputType.FILE);
	File to1 = new File("S.png");
	Files.copy(from1, to1);
	test1.addScreenCaptureFromPath(to1.getAbsolutePath());

	reportsObj.flush();


}
}
