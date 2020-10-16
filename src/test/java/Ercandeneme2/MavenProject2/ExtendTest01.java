package Ercandeneme2.MavenProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfiguration;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentCardsReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendTest01 {
	
	ExtentReports  report;
	
	
@BeforeTest
public void config() {

String path=System.getProperty("userdir")+"\\reports\\index.htm";


 
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setReportName("Ercan Automation Report ");
reporter.config().setDocumentTitle(" Ercan Test Result ");
report = new ExtentReports();
report.attachReporter(reporter);
report.setSystemInfo("Tester", "Ercan Caglayan");
	
	
}
	
	
	@Test
	public void demo () {
		ExtentTest test=report.createTest("demo");
		
		System.out.println("DEmo");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ercan\\Driver\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		test.fail("result is not match");
		report.flush();
	}
}
