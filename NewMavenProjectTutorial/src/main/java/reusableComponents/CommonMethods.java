package reusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CommonMethods {

    //common method to select dropdown value
    public void selectCommonDropdownOption(WebElement element, String valueToBeSelected) throws Exception {
        Select os = new Select(element);
        try {
            os.selectByVisibleText(valueToBeSelected);
        } catch (Exception e) {
            throw new Exception ("Value is not present in dropdown for WebElement: " + element + " Value to be selected is: " + valueToBeSelected);
        }
    }

    //Common method to select Radio buttons
    public void selectCommonRadioButton(List<WebElement> element, String valueToBeSelected) {
        for (WebElement ref : element) {
            if (ref.getText().equalsIgnoreCase(valueToBeSelected)) {
                ref.click();
                break;
            }
        }
    }

    //Common method to select Checkboxes
    public void selectCheckBoxes(List<WebElement> element, String checks) {
        String[] checksArray = checks.split(",");
        for (String str : checksArray) {
            for (WebElement ele : element) {
                if(ele.getText().equalsIgnoreCase(str)) {
                    ele.click();
                    break;
                }
            }
        }

    }

    public List<String> getDropDownOptionsAsList(WebElement element) {
        Select os = new Select(element);
        List<WebElement> list_webElements_state = os.getOptions();
        List<String> actualStateValues = new ArrayList<String>();

        for (WebElement ref : list_webElements_state) {
            actualStateValues.add(ref.getText());
        }
        return actualStateValues;
    }

}
