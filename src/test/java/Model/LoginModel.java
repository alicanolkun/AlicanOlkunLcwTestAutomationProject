package Model;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginModel extends Driver {
    public static By tbx_EmailAddress= By.id("LoginEmail");
    public static By tbx_Password = By.id("Password");
    public static By btn_LoginButton = By.id("loginLink");

    WebDriverWait wait = new WebDriverWait(webDriver,5);

    public void setEmailAddress(String emailAddress){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tbx_EmailAddress)); //email textbox alanını gözükene kadar bekler
        webDriver.findElement(tbx_EmailAddress).sendKeys(emailAddress); // email textbox alanına email adresini yazar
    }

    public void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tbx_Password)); //password textbox alanını gözükene kadar bekler
        webDriver.findElement(tbx_Password).sendKeys(password); // password textbox alanına password'ü yazar
    }

    public void clickToLoginButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(btn_LoginButton));
        wait.until(ExpectedConditions.elementToBeClickable(btn_LoginButton)); //Login butonunun tıklanılabilir olana kadar bekler
        webDriver.findElement(btn_LoginButton).click(); //login butonuna tıklar
    }

}
