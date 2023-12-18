package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseMobileTest{


    @Test(dataProvider = "signUpData",dataProviderClass = DataProviderMobile.class)
    public void testLogIn(String email,String password) throws InterruptedException {
        getLogInScreen(email,password);
        logInScreen.fillLogIn();
        Assert.assertEquals(logInScreen.catchMessage(),"Success");
    }
}
