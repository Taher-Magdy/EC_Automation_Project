import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;



    @BeforeTest
    public void openDriver() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();

    }

}
