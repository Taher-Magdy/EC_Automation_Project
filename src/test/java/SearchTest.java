import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchTest extends BaseTest {
    private SearchPage searchPage;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Search() throws InterruptedException {
        homePage.searchBar().click();
        homePage.searchBar().sendKeys("Apple");
        homePage.searchButton().click();
        searchPage = new SearchPage(driver);
        Thread.sleep(2000);
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Apple"), "search URL");
        // Snvalid Search
        homePage.searchBar().clear();
        homePage.searchBar().sendKeys("nothing");
        homePage.searchButton().click();

        Thread.sleep(2000);

        String actual = searchPage.noProducts().getText();
        softAssert.assertTrue(actual.contains("No products"));
        // another kind of assertion
        softAssert.assertTrue(searchPage.noProducts().isDisplayed(),"No products");
    }
}