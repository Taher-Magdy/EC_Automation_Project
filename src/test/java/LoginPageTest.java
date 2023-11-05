import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    private LoginPage loginPage;

    @Test
    public void valid_login() throws InterruptedException {
        new HomePage(driver)
                .ClickOnloginButton()
                .email()
                .password()
                .ClickOnlogin_btn();

        /*homePage.login().click();
        loginPage = new LoginPage(driver);
        loginPage.email().sendKeys("tahermagdy90@gmail.com");
        loginPage.password().sendKeys("01286481826");
        // this.email().sendKeys(new CharSequence[]{email});
        //  this.password().sendKeys(new CharSequence[]{password});
        Thread.sleep(1000L);

        loginPage.login_btn().click();*/


    }
}