package reusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CommonMethods {

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
