package vtigerAutomate;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportGenerate{
	
    public static void main( String[] args )  {
    	
    File fileObj=	new File("folder//Vtiger");
    ExtentSparkReporter htmlReport=  new ExtentSparkReporter(fileObj);
    ExtentReports extReport=   new ExtentReports();
    extReport.attachReporter(htmlReport);
    extReport.setSystemInfo("OS Name", System.getProperty("os.name"));
    extReport.setSystemInfo("UserName", System.getProperty("user.name"));
    extReport.setSystemInfo("Server name", "Qa Server");
    extReport.setSystemInfo("Tester Name", "Sarita");
    ExtentTest extTest=extReport.createTest("TC001");
    
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    	extTest.log(Status.WARNING, "Chrome Browser Launched Succesfully");
    	driver.get("http://localhost:8888");
    	extTest.log(Status.INFO, "Url Navigated https://localhost:8888/");
       	driver.findElement(By.name("user_name")).sendKeys("admin");
       	extTest.log(Status.INFO, "Username(admin)is entered succesfully in username box");
  	  driver.findElement(By.name("user_password")).sendKeys("sarita");
     	extTest.log(Status.INFO, "Password(sarita)is entered succesfully in password box");

   	  driver.findElement(By.name("Login")).click();
   	 
   	extTest.log(Status.INFO, "Clicked performed succesfully on Login Button");
   	
  boolean checkVisiblityOfMarketing = 	driver.findElement(By.xpath("//a[text()='Marketing']")).isDisplayed();
  if(checkVisiblityOfMarketing==true) {
	  extTest.log(Status.PASS, "Marketing button is visible TC001 is passed");
  }else {
	  extTest.log(Status.FAIL, "Marketing button is Invisible TC001 is Failed");

  }
  extReport.flush();
   	

    }
}
 