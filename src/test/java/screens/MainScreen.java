package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MainScreen extends BaseScreen{
    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login\")")
    private WebElement logInNav;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    private WebElement logInButtonMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Forms\")")
    private WebElement formsNav;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Input field:\")")
    private WebElement messageForms;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    private WebElement homeNav;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Support\")")
    private WebElement homeMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Webview\")")
    private WebElement webViewMessage;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe\")")
    private WebElement swipeNav;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement swipeMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag\")")
    private WebElement dragNav;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Drag and Drop\")")
    private WebElement dragMessage;


    public String tapWebView(){
        this.clickOnElement(webViewMessage);
        return webViewMessage.getText();
    }

    public String tapLogInNav(){
        this.clickOnElement(logInNav);
        this.isElementPresent(logInButtonMessage);
        return logInButtonMessage.getText();
    }

    public String tapFormsNav(){
        this.clickOnElement(formsNav);
        this.isElementPresent(messageForms);

        return messageForms.getText();
    }

    public String tapSwipeNav(){
        this.clickOnElement(swipeNav);
        this.isElementPresent(swipeMessage);

        return swipeMessage.getText();
    }

    public String tapDragNav(){
        this.clickOnElement(dragNav);
        this.isElementPresent(dragMessage);
        return dragMessage.getText();
    }


    public String tapHomeNav(){
        this.clickOnElement(homeNav);
        this.isElementPresent(homeMessage);
        return homeMessage.getText();
    }






}
