package Model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailModel extends Driver {
    public static By btn_Size = By.xpath("//div[@id='option-size-alert']/../a[1]");
    public static By btn_AddToCart = By.xpath("//*[@id='pd_add_to_cart']");
    public static By txt_ProductPrice = By.xpath("//span[@class='price']");
    public static By btn_MyCart = By.id("spanCart");

    public String productPrice1;
    public String productPrice2;
    public static By txt_ProductPriceFromCart = By.xpath("//span[@class='rd-cart-item-price mb-15']");

    WebDriverWait wait = new WebDriverWait(webDriver,5);

    public void selectProductSize() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_Size));
        wait.until(ExpectedConditions.elementToBeClickable(btn_Size));
        webDriver.findElement(btn_Size).click();
        Thread.sleep(3000);
    }

    public void clickToAddToCartButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_AddToCart));
        wait.until(ExpectedConditions.elementToBeClickable(btn_AddToCart));
        webDriver.findElement(btn_AddToCart).click();
    }

    public String getProductPrice(){
        productPrice1 =  webDriver.findElement(txt_ProductPrice).getText();
        return productPrice1;
    }

    public void clickToMyCartButton(){
        getProductPrice();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_MyCart));
        wait.until(ExpectedConditions.elementToBeClickable(btn_MyCart));
        webDriver.findElement(btn_MyCart).click();
    }

    public String getProductPriceFromCart(){
        productPrice2 =  webDriver.findElement(txt_ProductPriceFromCart).getText();
        return productPrice2;
    }
}
