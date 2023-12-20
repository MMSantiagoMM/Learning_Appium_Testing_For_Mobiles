package data;

import org.testng.annotations.DataProvider;

import java.util.Random;

public class DataProviderMobile {
    @DataProvider(name = "sign-up-data")
    public Object[][] getDataSignUp(){
        Object[][] data = new Object[][] {
                {"john.doe@example.com", "password1"},
                {"jane.doe@example.com", "password2"},
                {"bob.smith@example.com", "password3"},
                {"alice.johnson@example.com", "password4"},
                {"charlie.brown@example.com", "password5"},
                {"tom.hanks@example.com", "password6"},
                {"lucy.ball@example.com", "password7"},
                {"mike.myers@example.com", "password8"},
                {"eve.adams@example.com", "password9"},
                {"sam.hill@example.com", "password10"},
                {"rachel.green@example.com", "password11"},
                {"ross.geller@example.com", "password12"},
                {"chandler.bing@example.com", "password13"},
                {"joey.tribbiani@example.com", "password14"},
                {"monica.geller@example.com", "password15"},
                {"phoebe.buffay@example.com", "password16"},
                {"emma.swan@example.com", "password17"},
                {"snow.white@example.com", "password18"},
                {"james.bond@example.com", "password19"},
                {"sheldon.cooper@example.com", "password20"}
        };

        Random random = new Random();

        int randomIndex = random.nextInt(data.length);

        return new Object[][] {data[randomIndex]};
    }

    @DataProvider(name = "navigation-data")
    public Object[][] getDataLogIn(){
        return new Object[][]{{"Webview","LOGIN","Input field:",
                "Swipe horizontal","Drag and Drop","Support"} };
    }
}
