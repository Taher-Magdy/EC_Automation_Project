import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Set;

public class FollowUsTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void followUs() throws InterruptedException {
        Thread.sleep(2000);

        String Main = driver.getWindowHandle();
        homePage.facebook().click();
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"));
        Thread.sleep(3000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1)).close();
        driver.switchTo().window(Main);


        homePage.twitter().click();
        Thread.sleep(3000);
        softAssert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce", "twitter link");
        ArrayList<String> Tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs1.get(1)).close();
        driver.switchTo().window(Main);
        Thread.sleep(3000);


        homePage.youtube().click();
        Thread.sleep(3000);
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce", "youtube link");
        ArrayList<String> Tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs2.get(1)).close();
        driver.switchTo().window(Main);
        Thread.sleep(3000);


    }
}



