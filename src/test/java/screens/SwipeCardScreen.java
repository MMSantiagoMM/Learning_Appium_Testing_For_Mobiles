package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SwipeCardScreen extends BaseScreen{

    public SwipeCardScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO is fully open source and can be found on GitHub\")")
    private WebElement firstElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(22)")
    private WebElement firstDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO has a great community that supports all members.\")")
    private WebElement secondElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(24)")
    private WebElement secondDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The JS Foundation is host to projects that span the entire JavaScript ecosystem.\")")
    private WebElement thirdElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(26)")
    private WebElement thirdDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The community around WebdriverIO is actively speaking on various user groups or conferences about specific topics around automated testing with WebdriverIO.\")")
    private WebElement fourthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(28)")
    private WebElement fourthDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Adding helper functions, or more complicated sets and combinations of existing commands is simple and really useful\")")
    private WebElement fifthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(30)")
    private WebElement fifthDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO works in combination with most of the TDD and BDD test frameworks in the JavaScript world\")")
    private WebElement sixthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(32)")
    private WebElement sixthDot;


    public void scrollToRightHorizontally() {

        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\"" + element2 + "\").instance(0))"));
        //driver.findElement(AppiumBy
            //    .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingToBeginning(10);"));

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingForward()"));

    }

    public void scrollToLeftHorizontally(){
        driver.findElement(AppiumBy.androidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingBackward()"));
    }

    public Boolean firstCardIsHidden(){
        try {
            return firstElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFirstCard(){
        return firstElement.isDisplayed();
    }

    public Boolean isSelectedFirstDot(){
        return firstDot.isSelected();
    }

    public Boolean isVisibleSecondCard(){
        return secondElement.isDisplayed();
    }

    public Boolean isSelectedSecondDot(){
        return secondDot.isSelected();
    }


    public Boolean secondCardIsHidden(){
        try {
            return secondElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleThirdCard(){
        return thirdElement.isDisplayed();
    }

    public Boolean isSelectedThirdDot(){
        return thirdDot.isSelected();
    }

    public Boolean thirdCardIsHidden(){
        try {
            return thirdElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFourthCard(){
        return fourthElement.isDisplayed();
    }

    public Boolean isSelectedFourthDot(){
        return fourthDot.isSelected();
    }

    public Boolean fourthCardIsHidden(){
        try {
            return fourthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFifthCard(){
        return fifthElement.isDisplayed();
    }

    public Boolean isSelectedFifthDot(){
        return fifthDot.isSelected();
    }

    public Boolean fifthCardIsHidden(){
        try {
            return fifthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleSixthCard(){
        return sixthElement.isDisplayed();
    }

    public Boolean isSelectedSixthDot(){
        return sixthDot.isSelected();
    }

    public Boolean sixthCardIsHidden(){
        try {
            return sixthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }



}
