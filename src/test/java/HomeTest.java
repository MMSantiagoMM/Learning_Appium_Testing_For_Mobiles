import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeTest {

    @Test
    public void testAndroid() throws InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setAppActivity("MainActivity")
                .setApp("C:/Users/s.mosquera/Downloads/Android-NativeDemoApp-0.4.0.apk");

        WebDriver driver = null;
        try {
            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        //WebElement logIn = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Login\"]"));

        //driver.findElement(AppiumBy.androidUIAutomator(
          //      "new UiSelector().text(\"Forms\")")).click();

        //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Home\")")).click();

        //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Webview\")")).click();

        //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Swipe\")")).click();



        //logIn.click();

        //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Email\")")).
                //sendKeys("Santiago@gmail.com");

        //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")")).
                //sendKeys("Santiago@gmail.com");

        //driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Login\"])[2]")).click();
        Thread.sleep(1000);

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Drag\")")).click();

        WebElement one = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-c1\"]/android.widget.ImageView"
        ));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(one,-200,-1100).perform();

        //Thread.sleep(2000);

        WebElement two = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-r1\"]/android.widget.ImageView"
        ));

        //Actions actions2 = new Actions(driver);
        actions.dragAndDropBy(two,200,-1100).perform();

        WebElement three = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-l1\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(three,-330,-1378).perform();

        WebElement four = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(four,100,-902).perform();

        WebElement five = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-r2\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(five,549,-1129).perform();

        WebElement six = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-c2\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(six,150,-1129).perform();

        WebElement seven = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-c3\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(seven,-400,-700).perform();




    }






}
