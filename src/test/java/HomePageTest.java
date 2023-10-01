import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void testPageTitle(){
        String expected = "https://demo.nopcommerce.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
}
