package reusableComponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import testBase.ObjectsRepo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentSetup extends ObjectsRepo {
    public static ExtentReports setupExtentReport() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String actualDate = format.format(date);

        String reportPath = System.getProperty("user.dir")+"/Reports/target/ExecutionReport_" +
                actualDate + ".html";

        ExtentSparkReporter sparkReport = new ExtentSparkReporter("location of report");

        extent = new ExtentReports();
        extent.attachReporter(sparkReport);

        sparkReport.config().setDocumentTitle("DocumentTitle");
        sparkReport.config().setTheme(Theme.DARK);
        sparkReport.config().setReportName("ReportName");

        return extent;
    }
}
