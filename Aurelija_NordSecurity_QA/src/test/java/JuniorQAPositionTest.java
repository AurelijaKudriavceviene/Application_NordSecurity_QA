
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageobject.CareersPage;
import pageobject.HomePage;

public class JuniorQAPositionTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = {"Mid Manual QA Engineer", "Mid Manual QA Eng", "Junior Quality Assurance", "Junior Quality Assur"})
    void assertForSearchingJobTitle(String jobTitle) {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);

        homePage.goToCareersPage();
        careersPage.setSearchJobTitle(jobTitle);

        Assertions.assertEquals(jobTitle, careersPage.getSearchInputValue(),
                "Search input value does not match the search query");
        String errorMessage = "So sad, there are no " + jobTitle + " positions at the moment";
        Assertions.assertTrue(careersPage.hasAJobTitle(jobTitle),
                errorMessage);

        System.out.println("----- param is = " + jobTitle);
    }
}
