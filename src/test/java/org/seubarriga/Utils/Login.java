package org.seubarriga.Utils;

import org.seubarriga.Pages.HomePage;

public class Login extends BaseTest {

    public HomePage loggingIntoTheSystem() {
        loginPage.setUserEmail("aguia1@aguia.com.br");
        loginPage.setUserPassword("32690305");

        return loginPage.clickLoginButtonReturnsHomePageObject();

    }
    //loginPage = new LoginPage(driver);
}
