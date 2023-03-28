package vtigerAutomate;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class VtigerExtentReports {

	public static void main(String[] args) throws IOException {

		ExtentSparkReporter report = new ExtentSparkReporter("my\\hello.html");
		ExtentReports extRepoObj = new ExtentReports();
		extRepoObj.attachReporter(report);
		extRepoObj.setSystemInfo("OS NAME", "os.name");
		extRepoObj.setSystemInfo("USER NAME", "user.name");
		extRepoObj.setSystemInfo("TESTER NAME", "Sarita");
		ExtentTest test = extRepoObj.createTest("TC001");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "Browser is launched successfully");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://localhost:8888//");
		test.log(Status.INFO, "Url entered successfully");
		
		TakesScreenshot screenObj=  (TakesScreenshot)driver;
		File from =screenObj.getScreenshotAs(OutputType.FILE);
	File to=	new File("Ss.png");
	Files.copy(from, to);
test.addScreenCaptureFromPath(to.getAbsolutePath());
extRepoObj.flush();
}

}
