
package pageobject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "#search")
    private WebElement searchJobTitleInputElement;

    @FindBy (css = "button[type='submit']")
    private WebElement searchBtnElement;

    @FindBy(css = "a.JobsList_wrapper___Pkj1")
    private List<WebElement> jobListElements;

    @FindBy(css = "div.flex-nowrap.items-start.justify-between.md\\\\:flex.px-12")
    private WebElement jobTitleElement;

    public void setSearchJobTitle(String jobTitle) {
        searchJobTitleInputElement.sendKeys(jobTitle);
        searchBtnElement.click();
    }

    public boolean hasAJobTitle(String jobTitle) {
        for (WebElement jobTitleElement : jobListElements) {
            String title = jobTitleElement.getText();
            if (title.contains(jobTitle)) {
                return true;
            }
        }
        return false;
    }

    public String getSearchInputValue() {
        return searchJobTitleInputElement.getAttribute("value");
    }
}
