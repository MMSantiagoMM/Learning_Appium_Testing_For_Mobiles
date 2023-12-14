import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomeTest {

    @Test
    public void testAndroid() throws InterruptedException {



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

        /*
        Thread.sleep(3000);

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

        WebElement eight = driver.findElement(AppiumBy.xpath(
                "//android.view.ViewGroup[@content-desc=\"drag-l3\"]/android.widget.ImageView"
        ));

        actions.dragAndDropBy(eight,-500,-800).perform();




        //WebElement nine = driver.findElement(AppiumBy.xpath(
          //      "//android.view.ViewGroup[@content-desc=\"drag-r3\"]/android.widget.ImageView"
        //));
        //actions.dragAndDropBy(nine,449,-700).perform();


        putPiece(driver,"//android.view.ViewGroup[@content-desc=\"drag-r3\"]/android.widget.ImageView",
                449,-700).perform();


    }

    public Actions putPiece(WebDriver driver,String elementPath,Integer x,Integer y){

        WebElement element = driver.findElement(AppiumBy.xpath(elementPath));
        Actions actions = new Actions(driver);
        return actions.dragAndDropBy(element,x,y);
    }


*/



}

}
