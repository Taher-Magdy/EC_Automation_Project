import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement register(){

        return  driver.findElement(By.className("ico-register"));
    }
    public WebElement login() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement currency(){
        return driver.findElement(By.className("currency-selector"));
    }
    /*    public List<WebElement> sign(){
            return driver.findElement(By.xpath("(//div[@class='prices'])[1]"));
        }*/
    public WebElement sign(){
        return driver.findElement(By.xpath("(//div[@class='prices'])[1]"));
    }
    public WebElement searchBar(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    /* public WebElement categoryList(){
         return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
     }*/
    public WebElement desktopInPage(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1"));
    }
    public WebElement computers(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }
    public WebElement desktops(){ //(//a[@href='/desktops'])[2]
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
    }
    public WebElement slider(String sliderNum){
        return driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }
    public WebElement facebook() {
        return driver.findElement(By.className("facebook"));
    }
    public WebElement twitter() {
        return driver.findElement(By.className("twitter"));
    }

    public WebElement youtube() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
    }
    public WebElement wishList() {
        return driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }
//    public List<WebElement> addWishList() {
public WebElement addWishList() {
        //return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
     return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement closeB() {
        return driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

}
