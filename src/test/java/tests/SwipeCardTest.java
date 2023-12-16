package tests;

import org.testng.annotations.Test;

public class SwipeCardTest extends BaseMobileTest{

    @Test
    public void testSwipe(){
        getSwipeCardScreen();
        swipeCardScreen.scrollToRightHorizontally();
        swipeCardScreen.firstCardIsHidden();
        swipeCardScreen.isVisibleSecondCard();
        swipeCardScreen.isSelectedSecondDot();

        swipeCardScreen.scrollToRightHorizontally();
        swipeCardScreen.secondCardIsHidden();
        swipeCardScreen.isVisibleThirdCard();
        swipeCardScreen.isSelectedThirdDot();

        swipeCardScreen.scrollToRightHorizontally();
        swipeCardScreen.thirdCardIsHidden();
        swipeCardScreen.isVisibleFourthCard();
        swipeCardScreen.isSelectedFourthDot();

        swipeCardScreen.scrollToRightHorizontally();
        swipeCardScreen.fourthCardIsHidden();
        swipeCardScreen.isVisibleFifthCard();
        swipeCardScreen.isSelectedFifthDot();

        swipeCardScreen.scrollToRightHorizontally();
        swipeCardScreen.fifthCardIsHidden();
        swipeCardScreen.isVisibleSixthCard();
        swipeCardScreen.isSelectedSixthDot();

        swipeCardScreen.scrollToLeftHorizontally();
        swipeCardScreen.sixthCardIsHidden();
        swipeCardScreen.isVisibleFifthCard();
        swipeCardScreen.isSelectedFifthDot();

        swipeCardScreen.scrollToLeftHorizontally();
        swipeCardScreen.fifthCardIsHidden();
        swipeCardScreen.isVisibleFourthCard();
        swipeCardScreen.isSelectedFourthDot();

        swipeCardScreen.scrollToLeftHorizontally();
        swipeCardScreen.fourthCardIsHidden();
        swipeCardScreen.isVisibleThirdCard();
        swipeCardScreen.isSelectedThirdDot();

        swipeCardScreen.scrollToLeftHorizontally();
        swipeCardScreen.thirdCardIsHidden();
        swipeCardScreen.isVisibleSecondCard();
        swipeCardScreen.isSelectedSecondDot();

        swipeCardScreen.scrollToLeftHorizontally();
        swipeCardScreen.secondCardIsHidden();
        swipeCardScreen.isVisibleFirstCard();
        swipeCardScreen.isSelectedFirstDot();
    }

}
