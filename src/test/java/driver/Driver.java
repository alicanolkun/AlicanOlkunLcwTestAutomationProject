package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;

import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.WebDriver;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeSuite
    public void initializeDriver(){
        //Bu metod driver'ı ayağa kaldırır. Driver işlemleri bu metod altında yapılır.
        webDriver = DriverFactory.getDriver();
        //webDriver.get("https://www.lcwaikiki.com/tr-TR/TR"); // web sitesi urli verilir ve siteye girilir.
        webDriver.manage().window().maximize(); //açılan web sayfasını full screen yapar.

    }

    // Close the webDriver instance
    @AfterSuite
    public void closeDriver(){
        //Bu metod test sonrasında web driver'ı kapatır.
        webDriver.quit();
    }

}
