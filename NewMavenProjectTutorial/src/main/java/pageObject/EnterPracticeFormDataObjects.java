package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EnterPracticeFormDataObjects {

   // @FindBy (xpath = "(//span[normalize-space()="Practice Form'])[1]")
    WebElement  practice_form;

    @FindBy( id = "firstName")
    WebElement  txt_firstname;

    @FindBy ( id = "lastName")
    WebElement txt_lastname;

    @FindBy (id = "userEmail")
    WebElement txt_emailfield;

    @FindBy (xpath = "//input[@name=\"gender\"]/parent::div")
    List<WebElement> rdo_gender;

    @FindBy (id = "userNumber")
    WebElement txt_mobilenumber;

    @FindBy (id = "dateOfBirthInput")
    WebElement date_dateofbirth;

    @FindBy (xpath = "//input[@type=\"checkbox\"]/parent::div")
    List<WebElement> cbox_hobbies;

    @FindBy (id = "currentAddress")
    WebElement txt_currentaddress;

    @FindBy(className = "css-19bqh2r")
    WebElement dd_selectstate;


    //constructor that initializes all page objects
    public EnterPracticeFormDataObjects() {
 //       PageFactory.initElements(driver, this);
    }
}
