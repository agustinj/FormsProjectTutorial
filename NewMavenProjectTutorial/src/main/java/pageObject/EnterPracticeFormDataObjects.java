package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import java.util.List;

public class EnterPracticeFormDataObjects extends TestBase {

    @FindBy (xpath = "//span[normalize-space()='Practice Form']")
    WebElement  practice_form;

    @FindBy( id = "firstName")
    public WebElement  txt_firstname;

    @FindBy ( id = "lastName")
    public WebElement txt_lastname;

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
        PageFactory.initElements(driver, this);
    }

    public void clickOnPracticeFormsLink() {
        practice_form.click();
    }

    public void enterFirstName(String firstname) {
        txt_firstname.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        txt_lastname.sendKeys(lastname);
    }

    public List<String> getDropdownValues_State() {
        return cm.getDropDownOptionsAsList(dd_selectstate);
    }

}
