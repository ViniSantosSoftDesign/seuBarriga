package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By dropDownAccountsBy = By.className("dropdown-toggle");
    private By addAccountButtonBy = By.linkText("Adicionar");
    private By showListOfAccountsBy = By.linkText("Listar");
    private By createFinancialMovementBy = By.linkText("Criar Movimentação");
    private By monthlySummaryBy = By.linkText("Resumo Mensal");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccountsDropDownButton(){
        driver.findElement(dropDownAccountsBy).click();
    }

    public AddAccountPage clickToAddButton(){
        clickAccountsDropDownButton();
        driver.findElement(addAccountButtonBy).click();
        return new AddAccountPage(driver);
    }

    public AccountsList clickToShowListOfAccounts(){
        clickAccountsDropDownButton();
        driver.findElement(showListOfAccountsBy).click();
        return new AccountsList(driver);
    }
    public void clickToCreateFinancialMovement(){
        driver.findElement(createFinancialMovementBy).click();
    }

    public void clickToMonthlySummary(){
        driver.findElement(monthlySummaryBy).click();
    }
}
