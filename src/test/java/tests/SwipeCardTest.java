package tests;

import org.testng.annotations.Test;

public class SwipeCardTest extends BaseMobileTest{

    @Test
    public void testSwipe() throws InterruptedException {
        getSwipeCardScreen();
        swipeCardScreen.scrollHorizontally();
    }
}
