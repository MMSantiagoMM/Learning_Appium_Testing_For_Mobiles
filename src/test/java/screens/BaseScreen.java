package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    AndroidDriver driver;

    public BaseScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    protected void clickOnElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    protected Boolean isElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isEnabled();
    }


}
