import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CurrencyTest extends BaseTest {

    SoftAssert softassert = new SoftAssert();

    @Test
    public void currency_test() throws InterruptedException {
        String expected = "https://demo.nopcommerce.com/";
        String actual = driver.getCurrentUrl();
        softassert.assertTrue(actual.contains(expected));

        homePage = new HomePage(driver);
        System.out.println("Assert 1 ");
        Select select = new Select(homePage.currency());
        select.selectByVisibleText("Euro");
        Thread.sleep(1000);

        //String expected = "€";
        String actual1 = homePage.sign().getText();
        softassert.assertTrue(actual1.contains("€"));
        System.out.println("Assert 1 ");
        Select select2 = new Select(homePage.currency());
        select2.selectByVisibleText("US Dollar");
        Thread.sleep(1000);
        String actual2 = homePage.sign().getText();
        softassert.assertTrue(actual2.contains("$"));
    }
}