package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeCardTest extends BaseMobileTest{

    @Test
    public void testSwipe() {
        getSwipeCardScreen();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFirstElement());
        Assert.assertFalse(swipeCardScreen.firstCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleSecondCard());
        Assert.assertTrue(swipeCardScreen.isSelectedSecondDot());

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getSecondElement());
        Assert.assertFalse(swipeCardScreen.secondCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleThirdCard());
        //I couldn't catch the variable size of this element
        Assert.assertTrue(swipeCardScreen.isSelectedThirdDot());


        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getThirdElement());
        Assert.assertFalse(swipeCardScreen.thirdCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleFourthCard());
        //I couldn't catch the variable size of this element
        Assert.assertTrue(swipeCardScreen.isSelectedFourthDot());

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFourthElement());
        Assert.assertFalse(swipeCardScreen.fourthCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleFifthCard());
        Assert.assertTrue(swipeCardScreen.isSelectedFifthDot());

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFifthElement());
        Assert.assertFalse(swipeCardScreen.fifthCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleSixthCard());
        Assert.assertTrue(swipeCardScreen.isSelectedSixthDot());

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getSixthElement());
        Assert.assertFalse(swipeCardScreen.sixthCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleFifthCard());
        Assert.assertTrue(swipeCardScreen.isSelectedFifthDot());

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getFifthElement());
        Assert.assertFalse(swipeCardScreen.fifthCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleFourthCard());
        Assert.assertTrue(swipeCardScreen.isSelectedFourthDot());

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getFourthElement());
        Assert.assertFalse(swipeCardScreen.fourthCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleThirdCard());
        Assert.assertTrue(swipeCardScreen.isSelectedThirdDot());

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getThirdElement());
        Assert.assertFalse(swipeCardScreen.thirdCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleSecondCard());
        Assert.assertTrue(swipeCardScreen.isSelectedSecondDot());


        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getSecondElement());
        Assert.assertFalse(swipeCardScreen.secondCardIsHidden());
        Assert.assertTrue(swipeCardScreen.isVisibleFirstCard());
        Assert.assertTrue(swipeCardScreen.isSelectedFirstDot());

    }

}
