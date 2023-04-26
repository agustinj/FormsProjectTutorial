package uiTests;

import org.testng.annotations.Test;
import testBase.TestBase;

public class EndToEndTestCases extends TestBase {
    //OpenForms
 /*   @Test (enabled = false)
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

    @Test
    public void testStateDropdown() {
        //Enter Forms
        homepage.clickOnFormsLink();
        //Enter practice Forms
        practiceform.clickOnPracticeFormsLink();
        //get dropdown content
        List<String> actualValues = practiceform.getDropdownValues_State();
        test.log(Status.INFO, "Actual values in State dropdown: " + actualValues);
        //expected values
        List<String> expectedValues = Arrays.asList("Select State", "NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        test.log(Status.INFO, "Expected values in State dropdown: " + expectedValues);
        //compare - assert
        Assert.assertEquals(actualValues, expectedValues, "Error in State Dropdown options");
    }

    @Test
    public void testAnotherForm() throws Exception {
        System.out.println(driver.getCurrentUrl());
    }   */

    @Test
    public void testForms() throws Exception {
        homepage.clickOnFormsLink();
        practiceform.clickOnPracticeFormsLink();
        practiceform.enterUserData();
        practiceform.clickOnSubmit();
    }
}
