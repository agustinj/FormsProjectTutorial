package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reusableComponents.PropertiesOperations;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public void launchBrowserAndNavigate() throws Exception {
        //read prop files, get browser and url
        String browser = PropertiesOperations.getPropertyValueByKey("browser");
        String url = PropertiesOperations.getPropertyValueByKey("url");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        //launch browser
        //webdrivermanager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //navigate url
        driver.get(url);
    }

    @BeforeMethod  //will be run before each method in each @Test within this class
    public void setupMethod() throws Exception {
        launchBrowserAndNavigate();
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

}
