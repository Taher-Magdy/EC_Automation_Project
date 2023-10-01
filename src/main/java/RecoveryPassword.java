import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecoveryPassword extends BasePage{
    public RecoveryPassword(WebDriver driver) {
        super(driver);
    }
    public WebElement email ()
    {
        return driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement recoveryButton()
    {
        return driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
    }
    public WebElement emailRec(){
        return driver.findElement(By.className("email"));
    }
    public WebElement message()
    {
        return  driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
