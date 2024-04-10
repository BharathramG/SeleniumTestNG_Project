package Pages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {

	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir")+"//report//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("OrangeHRM Automation Report");
		report.config().setDocumentTitle("Test Result");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Bharathram");
		return extent;
	}
	
}
