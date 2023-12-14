package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseMobileTest{


    @Test
    public void testMain(){
        getMainScreen();
        Assert.assertEquals(mainScreen.tapWebView(),"Webview");
        Assert.assertEquals(mainScreen.tapLogInNav(),"LOGIN");
        Assert.assertEquals(mainScreen.tapFormsNav(),"Input field:");
        Assert.assertEquals(mainScreen.tapSwipeNav(),"Swipe horizontal");
        Assert.assertEquals(mainScreen.tapDragNav(),"Drag and Drop");
        Assert.assertEquals(mainScreen.tapHomeNav(),"Support");

    }
}
