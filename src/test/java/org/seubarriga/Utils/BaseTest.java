package org.seubarriga.Utils;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @Before
    public void setUpToAllTestsExceptToLoginTest() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://seubarriga.wcaquino.me");
        loginPage.setUserEmail("aguia1@aguia.com.br");
        loginPage.setUserPassword("32690305");
        homePage = loginPage.clickLoginButtonReturnsHomePageObject();

    }

    /*   @After
       public void teardown() {
           if (driver != null) {
               driver.quit();
           }
       }*/
}
