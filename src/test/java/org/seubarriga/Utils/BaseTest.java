package org.seubarriga.Utils;


import org.seubarriga.PageInteractions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    protected LoginPageInteraction loginPage;
    protected HomePageInteraction homePage;
    protected AddAccountPageInteraction accountPage;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUpToAllTestsExceptToLoginTest() {
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me");
        homePage = new HomePageInteraction(driver);
        loginPage = new LoginPageInteraction(driver);
        accountPage = new AddAccountPageInteraction(driver);

        loginPage.setUserEmail("aguia1@aguia.com.br");
        loginPage.setUserPassword("32690305");
        homePage = loginPage.clickLoginButtonReturnsHomePageObject();

    }
    public void addAnAccountWithNoName(){
        accountPage = homePage.clickOnAddButton();
        accountPage.setName("Conta1");
        accountPage.clickOnSaveButtonToSaveAnAccount();
    }

    public void addAnAccountWithName(String name){
        accountPage = homePage.clickOnAddButton();
        accountPage.setName(name);
        accountPage.clickOnSaveButtonToSaveAnAccount();
    }

    /*   @After
       public void teardown() {
           if (driver != null) {
               driver.quit();
           }
       }*/


}
