import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ResgisterPageTest extends BaseTest{

    SoftAssert softAssert = new SoftAssert();
   private RegisterPage registerPage;

    @Test
    public void register(){
        new HomePage(driver)
                .ClickOnRegister()
                .gender()
                .firstName()
                .lastName()
                .dateOfBirthDay()
                .dateOfBirthMonth()
                .dateOfBirthYear()
                .email()
                .company()
                .password()
                .confirmPassword()
                .registerBtn();
    }
        /*homePage.register().click();
        registerPage = new RegisterPage(driver);
        registerPage.gender_male().click();
        registerPage.firstName().sendKeys("Taher");
        registerPage.lastName().sendKeys("magdy");
        Select select = new Select(registerPage.dateOfBirthDay());
        select.selectByIndex(10);
        select = new Select(registerPage.dateOfBirthMonth());
        select.selectByVisibleText("December");
        select=new Select(registerPage.dateOfBirthYear());
        select.selectByValue("1998");
        registerPage.email().sendKeys("tahermagdy90@gmail.com");
        registerPage.company().sendKeys("T_M");
        registerPage.password().sendKeys("P@sswOrd");
        registerPage.confirmPassword().sendKeys("P@sswOrd");
        registerPage.registerBtn().click();
        String expected = "Your registration completed";
        String actual = registerPage.result().getText();

        softAssert.assertTrue(actual.contains(expected));
        softAssert.assertAll();}*/

    }



