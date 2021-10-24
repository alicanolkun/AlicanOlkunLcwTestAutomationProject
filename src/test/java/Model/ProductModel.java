package Model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class ProductModel extends Driver {
    public static By btn_SeeMoreProduct = By.id("pageIndex");
    public static By allProducts = By.xpath("//div[@data-category='//']");


    WebDriverWait wait = new WebDriverWait(webDriver,5);

    public void scrollUntillElement() throws InterruptedException {
        WebElement element = webDriver.findElement(btn_SeeMoreProduct);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element);
        actions.perform();
        Thread.sleep(500);
    }

    public void clickToSeeMoreProductButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_SeeMoreProduct)); //daha fazla urun gor locator'ını görene kadar bekler.
        wait.until(ExpectedConditions.elementToBeClickable(btn_SeeMoreProduct)); //daha fazla urun gor locator'ını tıklanabilir olana kadar bekler.
        webDriver.findElement(btn_SeeMoreProduct).click(); //daha fazla urun gor locator'ına tıklar.
    }

    public void selectRandomProduct() throws InterruptedException {
        List<WebElement> products = webDriver.findElements(allProducts);
        Random random = new Random();
        int number = random.nextInt(products.size());
        products.get(number).click();
        Thread.sleep(500);
    }


}
