package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import screens.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseMobileTest {
    String PROPERTIES_FILE = "src/test/resources/config.properties";
    private final Properties properties = new Properties();

    AndroidDriver driver;
    MainScreen mainScreen;
    SignUpScreen signUpScreen;
    LogInScreen logInScreen;
    SwipeCardScreen swipeCardScreen;


    @BeforeMethod
    public void beforeTest() {
        loadProperties();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setUpCapabilities(capabilities);
        try {
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }

    public void loadProperties(){

        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
            properties.load(fileInputStream);
        }catch (IOException e){
            throw new RuntimeException("Error loading the properties file " + PROPERTIES_FILE);
        }
    }

    public void setUpCapabilities(UiAutomator2Options capabilities){
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppPackage(getCapability("appPackage"));
        capabilities.setAppActivity(getCapability("appActivity"));
    }

    public String getCapability(String variable){
        return properties.getProperty(variable);
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
        Thread.sleep(5000);
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
