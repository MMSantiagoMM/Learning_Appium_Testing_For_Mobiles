package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import screens.MainScreen;
import screens.SignUpScreen;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseMobileTest {

    AndroidDriver driver;
    MainScreen mainScreen;
    SignUpScreen signUpScreen;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setAppActivity("MainActivity")
                .setApp("C:/Users/s.mosquera/Downloads/Android-NativeDemoApp-0.4.0.apk");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    public MainScreen getMainScreen(){
        return mainScreen = new MainScreen(driver);
    }

    public SignUpScreen getSignUpScreen(){
        getMainScreen();
        mainScreen.tapLogInNav();
        return signUpScreen = new SignUpScreen(driver);
    }


}
