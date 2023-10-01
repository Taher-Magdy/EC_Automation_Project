import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WishlistTest extends BaseTest{

    private WishlistPage wishListPage;
    SoftAssert softAssert = new SoftAssert();
    int num;
    @Test
    public void step1() throws InterruptedException {

        homePage.addWishList().click();//.get(2)
        Thread.sleep(4000);
        wishListPage = new WishlistPage(driver);
        wishListPage.addWishListInPage().click();
        Thread.sleep(2000);


        softAssert.assertTrue(wishListPage.wishSuccessMsg().isDisplayed(), "Success Message");

        String actual = wishListPage.wishSuccessMsg().getCssValue("background-color");
        String expected = "rgba(75, 176, 122, 1)";
        softAssert.assertEquals(actual, expected, "Message color");

        String text = homePage.wishList().getText();
        text = text.replaceAll("[^0-9]", "");
        num = Integer.parseInt(text);

        Assert.assertTrue(num > 0, "count of wishlist items");

        homePage.closeB().click();
        Thread.sleep(1000);
        homePage.wishList().click();



        // First Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"), "wishlist URL");
        // Second Assertion
        int size = wishListPage.wishListItems();
        softAssert.assertTrue(size > 0,"wishlist items");
        // Assert All
        softAssert.assertAll();
    }


    }

