package org.seubarriga.Utils;

import Pages.AddAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    protected LoginPage loginPage;
    protected HomePage homePage;

    protected AddAccountPage accountPage;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUpToAllTestsExceptToLoginTest() {
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

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
