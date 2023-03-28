package vtigerAutomate;

import java.io.File;
import java.io.IOException;

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

public class ExtentsReports {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		TakesScreenshot screen=(TakesScreenshot)	driver;
		File from=	screen.getScreenshotAs(OutputType.FILE);
	File to=	new File("name.png");
	Files.copy(from, to);
			
ExtentSparkReporter spark= new ExtentSparkReporter("file//name.html");
ExtentReports reports=new ExtentReports();
reports.attachReporter(spark);
reports.setSystemInfo("user name", System.getProperty("user.name"));
ExtentTest test=reports.createTest("Tc001");
driver.navigate().to("http://localhost:8888/");
test.log(Status.INFO, "Browser is launched succesfully");
test.addScreenCaptureFromPath(to.getAbsolutePath());
reports.flush();
	}  

}
