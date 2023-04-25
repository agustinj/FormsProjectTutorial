package uiTests;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import testBase.TestBase;

public class EndToEndTestCases extends TestBase {
    //OpenForms
    @Test
    public void testForms() throws Exception {
        //Enter Forms
        homepage.clickOnFormsLink();
        //Enter practice Forms
        practiceform.clickOnPracticeFormsLink();
        //Enter details in fields First and Last Name
        practiceform.enterFirstName("Agustin");
        test.log(Status.PASS, "Name input: Agustin");
        practiceform.enterLastName("Jauregui");
    }

 /*   @Test
    public void testAnotherForm() throws Exception {
        System.out.println(driver.getCurrentUrl());
    }   */

}
