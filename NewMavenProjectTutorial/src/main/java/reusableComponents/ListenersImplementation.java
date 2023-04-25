package reusableComponents;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testBase.ObjectsRepo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenersImplementation extends ObjectsRepo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test case: " + result.getMethod().getMethodName() + " is Passed.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test case: " + result.getMethod().getMethodName() + " is Failed.");
        test.log(Status.FAIL, result.getThrowable());
        //catch screenshot for failed tests:
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String actualDate = format.format(date);

        String screenshotPath = System.getProperty("user.dir")+"/Reports/Screenshots" +
                actualDate + ".jpeg";
        File dest = new File("");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
             e.printStackTrace();
        }

        //add screenshot to report:
        test.addScreenCaptureFromPath(screenshotPath, "Test Case failure screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        //setup method call
        extent = ExtentSetup.setupExtentReport();
    }

    @Override
    public void onFinish(ITestContext context) {
        //close extent
        extent.flush();
    }
}
