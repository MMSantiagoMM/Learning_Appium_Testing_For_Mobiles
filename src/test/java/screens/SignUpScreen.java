package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends BaseScreen{
    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Sign up\")")
    private WebElement signUpLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Email\")")
    private WebElement emailInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Password\")")
    private WebElement passwordInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").text(\"Confirm password\")")
    private WebElement confirmPasswordInput;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"SIGN UP\")")
    private WebElement signUpButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Signed Up!\")")
    private WebElement signedAlert;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").text(\"OK\")")
    private WebElement buttonSignedUp;

    public void signUpOnApp(String email,String password){
        this.clickOnElement(signUpLink);
        signUpLink.click();

        emailInput.sendKeys(email);
        this.isElementPresent(passwordInput);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
        this.clickOnElement(signUpButton);

    }

    public String handleAlert(){
        //this.clickOnElement(signedAlert);
        this.isElementPresent(signedAlert);
        return signedAlert.getText();
    }

    public void clickOkButton() {
        /*this.clickOnElement(buttonSignedUp);
        Thread.sleep(5000);
        buttonSignedUp.click();*/
        driver.switchTo().alert().accept();
    }









}
