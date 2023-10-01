import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverCategoriesTest extends BaseTest {
    @Test
    public void Categories() throws InterruptedException {

/*      Actions action = new Actions(driver);
        action.moveToElement(homePage.computers()).perform();
        Thread.sleep(1000);
        homePage.desktops().click();
        Assert.assertTrue(homePage.desktopInPage().getText().contains("Desktops"));  */
        homePage.computers().click();
        Thread.sleep(1000);
        homePage.desktops().click();
        Thread.sleep(1000);
        Assert.assertTrue(homePage.desktopInPage().getText().contains("Desktops"));
    }
}