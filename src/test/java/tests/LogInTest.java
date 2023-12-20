package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.*;

public class LogInTest extends BaseMobileTest{
    private String verifyValue2;

    @BeforeMethod
    @Parameters("verify-log-in")
    public void beforeTest(String verify){
        verifyValue2 = verify;
    }

    @Test(dataProvider = "sign-up-data",dataProviderClass = DataProviderMobile.class)
    public void testLogIn(String email,String password) throws InterruptedException {
        getLogInScreen(email,password);
        logInScreen.fillLogIn();
        Assert.assertEquals(logInScreen.catchMessage(),verifyValue2);
    }
}
