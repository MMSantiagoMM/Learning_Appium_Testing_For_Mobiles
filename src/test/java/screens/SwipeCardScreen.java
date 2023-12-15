package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class SwipeCardScreen extends BaseScreen{

    public SwipeCardScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "(//android.view.ViewGroup[@content-desc=\"card\"])[1]")
    private WebElement element;

    @AndroidFindBy(uiAutomator = "(//android.view.ViewGroup[@content-desc=\"card\"])[2]")
    private WebElement element2;



    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, anchor))
                .release().perform();
    }

    public void scrollHorizontally() throws InterruptedException {

        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"" + element2 + "\").instance(0))"));
        //driver.findElement(AppiumBy
            //    .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingToBeginning(10);"));

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingForward()"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingToBeginning(10)"));
    }


}
