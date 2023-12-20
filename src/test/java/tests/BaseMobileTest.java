package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import screens.LogInScreen;
import screens.MainScreen;
import screens.SignUpScreen;
import screens.SwipeCardScreen;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseMobileTest {

    AndroidDriver driver;
    MainScreen mainScreen;
    SignUpScreen signUpScreen;
    LogInScreen logInScreen;
    SwipeCardScreen swipeCardScreen;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setAppActivity("MainActivity")
                .setApp("C:/Users/s.mosquera/Downloads/Android-NativeDemoApp-0.4.0.apk");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterTest
    public void afterTests(){
        driver.quit();
    }

    public MainScreen getMainScreen(){
        return mainScreen = new MainScreen(driver);
    }

    public SignUpScreen getSignUpScreen(){
        getMainScreen();
        mainScreen.tapLogInNav();
        return signUpScreen = new SignUpScreen(driver);
    }

    public LogInScreen getLogInScreen(String email, String password) throws InterruptedException {
        //Thread.sleep(5000);
        getSignUpScreen();
        signUpScreen.signUpOnApp(email,password);

        Thread.sleep(5000);
        signUpScreen.clickOkButton();
        return logInScreen = new LogInScreen(driver);
    }

    public SwipeCardScreen getSwipeCardScreen(){
        getMainScreen();
        mainScreen.tapSwipeNav();
        return swipeCardScreen = new SwipeCardScreen(driver);
    }


}
