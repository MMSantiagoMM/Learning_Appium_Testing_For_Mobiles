package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwipeCardScreen extends BaseScreen{

    public SwipeCardScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO is fully open source and can be found on GitHub\")")
    private WebElement firstElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(18)")
    private WebElement firstDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO has a great community that supports all members.\")")
    private WebElement secondElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(20)")
    private WebElement secondDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The JS Foundation is host to projects that span the entire JavaScript ecosystem.\")")
    private WebElement thirdElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(22)")
    private WebElement thirdDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The community around WebdriverIO is actively speaking on various user groups or conferences about specific topics around automated testing with WebdriverIO.\")")
    private WebElement fourthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(24)")
    private WebElement fourthDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Adding helper functions, or more complicated sets and combinations of existing commands is simple and really useful\")")
    private WebElement fifthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(26)")
    private WebElement fifthDot;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO works in combination with most of the TDD and BDD test frameworks in the JavaScript world\")")
    private WebElement sixthElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(28)")
    private WebElement sixthDot;


    public void scrollToRightHorizontally(WebElement element) {

    Actions actions = new Actions(driver);
    actions.dragAndDropBy(element,-800,0).perform();

    }


    public void scrollToLeftHorizontally(WebElement element){

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element,800,0).perform();

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
        return firstDot.getSize().getHeight() < 745;
    }

    public Boolean isVisibleSecondCard(){
        return secondElement.isDisplayed();
    }

    public Boolean isSelectedSecondDot(){
        this.isElementPresent(secondDot);
        return secondDot.getSize().getHeight() > 17;
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

    public Boolean isSelectedThirdDot() {
        return thirdDot.getSize().getHeight() >= 17;
    }

    public Boolean thirdCardIsHidden() {

        try {
            return thirdElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFourthCard(){
        this.isElementPresent(fourthElement);
        return fourthElement.isDisplayed();
    }

    public Boolean isSelectedFourthDot(){
        this.isElementPresent(fourthDot);
        return fourthDot.getSize().getHeight() >= 17;
    }

    public Boolean fourthCardIsHidden()  {
        try {
            return fourthElement.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Boolean isVisibleFifthCard(){
        this.isElementPresent(fifthElement);
        return fifthElement.isDisplayed();
    }

    public Boolean isSelectedFifthDot(){
        return fifthDot.getSize().getHeight() > 17;
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
        this.isElementPresent(sixthDot);
        return sixthDot.getSize().getHeight() > 17;
    }

    public Boolean sixthCardIsHidden() {
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
