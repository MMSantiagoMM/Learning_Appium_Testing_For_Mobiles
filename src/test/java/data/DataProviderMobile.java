package data;

import org.testng.annotations.DataProvider;

public class DataProviderMobile {

    @DataProvider(name = "signUpData")
    public Object[][] getDataSignUp(){
        return new Object[][]{{"CarlaV@gmail.com","secretPassword"}};
    }




}
