package org.seubarriga.Utils;

import Pages.HomePage;
import org.junit.Test;

public class Login extends BaseTest {

    public HomePage justLogin() {
        loginPage.setUserEmail("aguia1@aguia.com.br");
        loginPage.setUserPassword("32690305");
        
        return loginPage.clickLoginButton();

    }
}
