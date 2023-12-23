package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragScreen extends BaseScreen{
    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
    WebElement firstP;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    WebElement secondP;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    WebElement thirdP;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    WebElement fourthP;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"drag-c2\"]/android.widget.ImageView")
    WebElement fifthP;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"drag-r2\"]/android.widget.ImageView")
    WebElement sixthP;

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"drag-l3\"]/android.widget.ImageView")
    WebElement seventhP;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"drag-c3\"]/android.widget.ImageView")
    WebElement eighthP;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"drag-l3\"]/android.widget.ImageView")
    WebElement ninthP;


    public Actions toMovePiece(WebElement element, Integer x, Integer y){
        return new Actions(driver).dragAndDropBy(element,x,y);
    }

    public Actions toMoveFourthPiece(){
        return toMovePiece(fourthP,200,-900);
    }

    public Actions toMoveThirdPiece(){
        return toMovePiece(thirdP,200,-1100);
    }

    public Actions toMoveEighthPiece(){
        return toMovePiece(eighthP,-330,-700);
    }

    public Actions toMoveFirstPiece(){
        return toMovePiece(firstP,-345,-1200);
    }

    public Actions toMoveSixthPiece() {
        return toMovePiece(sixthP,549,-1000);
    }

    public Actions toMoveSeventhPiece(){
        this.isElementPresent(seventhP);
        return toMovePiece(seventhP,-450,-700);
    }

    public Actions toMoveFifthPiece(){
        this.isElementPresent(fifthP);
        return toMovePiece(fifthP,100,-1000);
    }

    public Actions toMoveSecondPiece(){
        return toMovePiece(secondP,-200,-1100);
    }

    public Actions toMoveNinthPiece(){
        this.isElementPresent(ninthP);
        return toMovePiece(ninthP,-600,-850);
    }


}
