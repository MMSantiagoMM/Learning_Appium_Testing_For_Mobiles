package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainTest extends BaseMobileTest{


    //@Test(dataProvider = "navigation-data",dataProviderClass = DataProviderMobile.class)
    @Test
    @Parameters({"first","second","third","fourth","fifth","sixth"})
    public void testMain(String webParam,String login,String input, String swipe, String dragAndDrop,String support){
        getMainScreen();
        Assert.assertEquals(mainScreen.tapWebView(),webParam);
        Assert.assertEquals(mainScreen.tapLogInNav(),login);
        Assert.assertEquals(mainScreen.tapFormsNav(),input);
        Assert.assertEquals(mainScreen.tapSwipeNav(),swipe);
        Assert.assertEquals(mainScreen.tapDragNav(),dragAndDrop);
        Assert.assertEquals(mainScreen.tapHomeNav(),support);

    }
}
