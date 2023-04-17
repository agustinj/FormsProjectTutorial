package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
    //only page objects + respective methods

   // WebElement link_forms = driver.findElement(By.xpath());

    @FindBy (xpath= "(//*[name()='svg'][@stroke='currentColor'])[1]")
    WebElement link_elements;

   // @FindBy (xpath= "(//*[name()='svg'][@stroke='currentColor'])[2]")
   // WebElement link_forms;

    @FindBy (xpath= "(//*[name()='svg'][@stroke='currentColor'])[3]")
    WebElement link_alerts;

    @FindBy (xpath= "(//*[name()='svg'][@stroke='currentColor'])[4]")
    WebElement link_widgets;

    @FindBy (xpath= "(//*[name()='svg'][@stroke='currentColor'])[5]")
    WebElement link_interactions;

    //constructor - to use initElement method
    public HomePageObjects() {
      //  PageFactory.initElements(driver, this);
    }

}
