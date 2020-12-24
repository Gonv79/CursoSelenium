package tests.examen.tests;

import org.testng.annotations.DataProvider;

public class NetflixDataProvider {

    @DataProvider (name="email")
    public static Object [] [] invalidEmails() {
        Object[][] invalidEmails = new Object[][]{
                {"test@test.com", "holamundo"},
                {"sadfasd@vrer", "holamundo"},
                {"aaaaaaa@sdfads@.com", "holamundo"}
        };
        return invalidEmails;
    }

}
