package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import pageObject.EnterPracticeFormDataObjects;
import pageObject.HomePageObjects;

public class ObjectsRepo {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
    public static HomePageObjects homepage;
    public EnterPracticeFormDataObjects practiceform;

}
