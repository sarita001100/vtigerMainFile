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

public class ExtentWithScreenshot {

	public static void main(String[] args) throws IOException {
		ExtentSparkReporter sparkReport = new ExtentSparkReporter("Report//rework.html");
		ExtentReports reportsOb = new ExtentReports();
		reportsOb.attachReporter(sparkReport);
		reportsOb.setSystemInfo("OS name", System.getProperty("os.name"));
		reportsOb.setSystemInfo("user name", System.getProperty("user.name"));
		reportsOb.setSystemInfo("Server Name", "QA server");
		reportsOb.setSystemInfo("Tester Name", "Sarita");
		ExtentTest test = reportsOb.createTest("TC001");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "Chrome Browser is launched succesfully");
		driver.get("http://localhost:8888/");
		test.log(Status.INFO, "Localhost url is entered succesfully");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		test.log(Status.PASS, "user name is entered succesfully in userbox");
		driver.findElement(By.name("user_password")).sendKeys("sarita");
		test.log(Status.PASS, "user password is entered succesfully in passwordbox");

		driver.findElement(By.name("Login")).click();
		test.log(Status.PASS, "Login button is clicked succesfully");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File from = screenshot.getScreenshotAs(OutputType.FILE);
		File to = new File("page.png");
		Files.copy(from, to);
		test.addScreenCaptureFromPath(to.getAbsolutePath());
		reportsOb.flush();

	}

}
