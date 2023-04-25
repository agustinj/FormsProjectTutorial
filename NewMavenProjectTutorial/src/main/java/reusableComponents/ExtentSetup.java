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

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        spark.config().setDocumentTitle("DocumentTitle");
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("ReportName");

        return extent;
    }
}
