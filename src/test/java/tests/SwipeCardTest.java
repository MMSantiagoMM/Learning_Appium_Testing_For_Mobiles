package tests;

import org.testng.annotations.Test;

public class SwipeCardTest extends BaseMobileTest{

    @Test
    public void testSwipe() throws InterruptedException {
        getSwipeCardScreen();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFirstElement());
        swipeCardScreen.firstCardIsHidden();
        swipeCardScreen.isVisibleSecondCard();
        swipeCardScreen.isSelectedSecondDot();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getSecondElement());
        swipeCardScreen.secondCardIsHidden();
        swipeCardScreen.isVisibleThirdCard();
        swipeCardScreen.isSelectedThirdDot();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getThirdElement());
        swipeCardScreen.thirdCardIsHidden();
        swipeCardScreen.isVisibleFourthCard();
        swipeCardScreen.isSelectedFourthDot();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFourthElement());
        swipeCardScreen.fourthCardIsHidden();
        swipeCardScreen.isVisibleFifthCard();
        swipeCardScreen.isSelectedFifthDot();

        swipeCardScreen.scrollToRightHorizontally(swipeCardScreen.getFifthElement());
        swipeCardScreen.fifthCardIsHidden();
        swipeCardScreen.isVisibleSixthCard();
        swipeCardScreen.isSelectedSixthDot();

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getSixthElement());
        swipeCardScreen.sixthCardIsHidden();
        swipeCardScreen.isVisibleFifthCard();
        swipeCardScreen.isSelectedFifthDot();


        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getFifthElement());
        swipeCardScreen.fifthCardIsHidden();
        swipeCardScreen.isVisibleFourthCard();
        swipeCardScreen.isSelectedFourthDot();

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getFourthElement());
        swipeCardScreen.fourthCardIsHidden();
        swipeCardScreen.isVisibleThirdCard();
        swipeCardScreen.isSelectedThirdDot();

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getThirdElement());
        swipeCardScreen.thirdCardIsHidden();
        swipeCardScreen.isVisibleSecondCard();
        swipeCardScreen.isSelectedSecondDot();

        swipeCardScreen.scrollToLeftHorizontally(swipeCardScreen.getSecondElement());
        swipeCardScreen.secondCardIsHidden();
        swipeCardScreen.isVisibleFirstCard();
        swipeCardScreen.isSelectedFirstDot();
    }

}
