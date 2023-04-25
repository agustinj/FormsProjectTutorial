package reusableComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testBase.ObjectsRepo;

public class ListenersImplementation extends ObjectsRepo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestFailure(ITestResult result) {
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
