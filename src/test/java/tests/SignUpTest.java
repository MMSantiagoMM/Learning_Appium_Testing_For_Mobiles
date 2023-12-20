package tests;

import data.DataProviderMobile;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUpTest extends BaseMobileTest{

    private String verifyValue;

    @BeforeMethod
    @Parameters("verify-sign-up")
    public void beforeMethod(String verify){
        verifyValue = verify;
    }

    @Test(dataProvider = "sign-up-data",dataProviderClass = DataProviderMobile.class)
    public void testSignUp(String email,String password){

        getSignUpScreen();
        signUpScreen.signUpOnApp(email,password);

        Assert.assertEquals(signUpScreen.handleAlert(),verifyValue);
        signUpScreen.clickOkButton();

    }

}
