package uiTests;

import org.testng.annotations.Test;
import testBase.TestBase;

public class EndToEndTestCases extends TestBase {
    //TestNG
    @Test
    public void testForms() throws Exception {
        System.out.println(driver.getTitle());
    }

    @Test
    public void testAnotherForm() throws Exception {
        System.out.println(driver.getCurrentUrl());
    }

}
