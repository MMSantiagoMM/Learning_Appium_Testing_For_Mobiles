package screens;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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


    public void scrollToRightHorizontally(WebElement element) {
       //driver.findElement(AppiumBy.androidUIAutomator(
               //"new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingForward()"));

    Actions actions = new Actions(driver);
    actions.dragAndDropBy(element,-900,0).perform();

    }


    public void scrollToLeftHorizontally(WebElement element){
        //driver.findElement(AppiumBy.androidUIAutomator(
        //"new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().flingBackward()"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element,900,0).perform();

    }

    public Boolean firstCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(firstElement);
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


    public Boolean secondCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(secondElement);
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

    public Boolean thirdCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(thirdElement);
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

    public Boolean fourthCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(fourthElement);
        try {
            return fourthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFifthCard(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(fifthElement));
        return fifthElement.isDisplayed();
    }

    public Boolean isSelectedFifthDot(){
        return fifthDot.isSelected();
    }

    public Boolean fifthCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(fifthElement);
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

    public Boolean sixthCardIsHidden() throws InterruptedException {
        //scrollToRightHorizontally(sixthElement);
        try {
            return sixthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public WebElement getFirstElement() {
        return firstElement;
    }

    public WebElement getSecondElement() {
        return secondElement;
    }

    public WebElement getThirdElement() {
        return thirdElement;
    }

    public WebElement getFourthElement() {
        return fourthElement;
    }

    public WebElement getFifthElement() {
        return fifthElement;
    }

    public WebElement getSixthElement() {
        return sixthElement;
    }
}
