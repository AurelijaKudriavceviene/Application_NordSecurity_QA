
package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {super(driver);
    }

    @FindBy(css = "span[class='flex items-center']")
    private WebElement hoverCareersBtnElement;

    @FindBy(css = "a[href='/careers/jobs']")
    private WebElement openPositionsBtnElement;


    public void goToCareersPage() {
        waitForVisibilityOf(cookiesBtnElement);
        cookiesBtnElement.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverCareersBtnElement).perform();
        openPositionsBtnElement.click();
    }

}
