import org.testng.Assert;
import org.testng.annotations.Test;

public class RecoveryPasswordTest extends BaseTest {
    private LoginPage loginPage;
    private RecoveryPassword recoveryPassword;

    @Test
    public void RecoveryPassword_test() throws InterruptedException {
        new HomePage(driver)
                .ClickOnloginButton()
                .forgot_password()
                .emailRec()
                .ClickOnrecoveryButton();

      /*  homePage.login().click();
        loginPage = new LoginPage(driver);
    //    loginPage.forgot_password().click();
        recoveryPassword = new RecoveryPassword(driver);

        recoveryPassword.emailRec().sendKeys("tahermagdy90@gmail.com");
        Thread.sleep(2000);

        recoveryPassword.recoveryButton().click();
        Thread.sleep(2000);
        */
        String expected = "Email with instructions has been sent to you";
        String actual = recoveryPassword.message().getText();
        Assert.assertTrue(actual.contains(expected));

    }
}
