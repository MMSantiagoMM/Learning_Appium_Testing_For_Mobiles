package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseMobileTest{


    @Test
    public void testLogIn() throws InterruptedException {
        getLogInScreen();
        logInScreen.fillLogIn();
        Assert.assertEquals(logInScreen.catchMessage(),"Success");
    }
}
