package Model;
import org.apache.log4j.Logger;
import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePageModel extends Driver {
    // Burada HomePagede yapılacak işlemlerin metodları yazılacaktır.
    // HomePageModel , Driver classından miras alır ve Driver classının tüm özelliklerini kullanabilir.

    public static By btn_Login = By.xpath("//span[contains(text(),'Giriş Yap')]");
    public static By btn_MyAccount = By.xpath("//span[contains(text(),'Hesabım')]");
    public static By tbx_SearchBar = By.xpath("//*[@class='searchBox']");
    public static By btn_Search = By.xpath("//*[@class='searchButton']");
    public Logger logger = Logger.getLogger(HomePageModel.class);

    WebDriverWait wait = new WebDriverWait(webDriver,5);
    public void GoToUrl(String url){
        webDriver.get(url);
    }

    public void checkHomePageOpened(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_Login)); //login locator'ını görene kadar bekler.
        Assert.assertTrue("Anasayfa acilmadi!",webDriver.findElement(btn_Login).isDisplayed()); // Anasayfada login butonu görülüyorsa 'true" döner.
        logger.info("Anasayfa açıldı");
    }

    public void clickToLoginButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_Login)); //login locator'ını görene kadar bekler.
        webDriver.findElement(btn_Login).click(); //login locator'ına tıklar.
        logger.info("Login butonuna tıkladı");
    }

    public void checkLoginProcess(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_MyAccount)); //hesabım locator'ını görene kadar bekler.
        Assert.assertTrue("Login olunamadı!",webDriver.findElement(btn_MyAccount).isDisplayed()); // Login olunursa 'true" döner.
    }

    public void clickToSearchBar(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tbx_SearchBar)); //login locator'ını görene kadar bekler.
        wait.until(ExpectedConditions.elementToBeClickable(tbx_SearchBar)); //login locator'ını tıklanabilir olana kadar bekler.
        webDriver.findElement(tbx_SearchBar).click(); //login locator'ına tıklar.
    }

    public void clickToSearchButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_Search)); //ara locator'ını görene kadar bekler.
        wait.until(ExpectedConditions.elementToBeClickable(btn_Search)); //ara locator'ını tıklanabilir olana kadar bekler.
        webDriver.findElement(btn_Search).click(); //ara locator'ına tıklar.
    }

    public void setProductNameToSearchBox(String productName){
        clickToSearchBar();
        webDriver.findElement(tbx_SearchBar).sendKeys(productName);
        clickToSearchButton();
    }
}
