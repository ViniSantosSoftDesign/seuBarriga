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
    protected AccountsListInteraction accountList;
    protected EditAccountPageInteraction editAccount;
    protected CreateFinancialMovementPageInteraction createFinancialPage;

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
        accountList = new AccountsListInteraction(driver);
        editAccount = new EditAccountPageInteraction(driver);
        createFinancialPage = new CreateFinancialMovementPageInteraction(driver);

        loginPage.setUserEmail("aguia1@aguia.com.br");
        loginPage.setUserPassword("32690305");
        homePage = loginPage.clickLoginButtonReturnsHomePageObject();
    }

    public void addAnAccountWithNoName() {
        accountPage = homePage.clickOnAddButton();
        accountPage.clickOnSaveButtonToSaveAnAccount();
    }

    public void addAnAccountWithName(String name) {
        accountPage = homePage.clickOnAddButton();
        accountPage.setName(name);
        accountPage.clickOnSaveButtonToSaveAnAccount();
    }

    public void changeAnAccountName(String name) {
        accountList = homePage.clickOnShowListOfAccounts();
        editAccount = accountList.clickOnEditButton();
        editAccount.clearName();
        editAccount.setName(name);
        editAccount.clickOnSaveButton();
    }

    public void deleteAnAccount() {

        accountList = homePage.clickOnShowListOfAccounts();
        accountList.clickOnDeleteButton();
    }

    public void createFinancialMovementSendingForbiddenMonetaryValueType() {
        createFinancialPage = homePage.clickOnCreateFinancialMovement();
        createFinancialPage.setDataOFTransaction("25/08/2021");
        createFinancialPage.setDataOFpayment("26/08/2021");
        createFinancialPage.setDescription("Aluguel super atrasado");
        createFinancialPage.setWhoWants("Herdeiro do Madruga");
        createFinancialPage.setValue("NuncaPagarei");
        createFinancialPage.clickOnSaveButtonToSaveAFinancialMovement();
    }

    public void createFinancialMovementCorrectly() {
        createFinancialPage = homePage.clickOnCreateFinancialMovement();
        createFinancialPage.setDataOFTransaction("25/08/2021");
        createFinancialPage.setDataOFpayment("26/08/2021");
        createFinancialPage.setDescription("Aluguel super atrasado");
        createFinancialPage.setWhoWants("Herdeiro do Madruga");
        createFinancialPage.setValue("1.99");
        createFinancialPage.clickOnSaveButtonToSaveAFinancialMovement();
    }



    public void createFinancialMovementBlanc() {
        createFinancialPage = homePage.clickOnCreateFinancialMovement();
        createFinancialPage.clickOnSaveButtonToSaveAFinancialMovement();
    }

    /*   @After
       public void teardown() {
           if (driver != null) {
               driver.quit();
           }
       }*/


}
