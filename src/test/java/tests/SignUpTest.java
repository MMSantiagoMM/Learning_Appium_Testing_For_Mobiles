package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseMobileTest{

    @Test(dataProvider = "signUpData",dataProviderClass = DataProviderMobile.class)
    public void testSignUp(String email,String password){

        getSignUpScreen();
        signUpScreen.signUpOnApp(email,password);

        Assert.assertEquals(signUpScreen.handleAlert(),"Signed Up!");

    }

}
