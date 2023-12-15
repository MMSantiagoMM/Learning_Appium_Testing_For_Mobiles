package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LogInScreen extends BaseScreen{
    public LogInScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login\").instance(0)")
    private WebElement logInLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Email\")")
    private WebElement emailInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Password\")")
    private WebElement passwordInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"LOGIN\")")
    private WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Success\")")
    private WebElement logInMessage;

    public void fillLogIn(){
        logInLink.click();
        //emailInput.sendKeys(email);
        //passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String catchMessage(){
        return logInMessage.getText();
    }




}
