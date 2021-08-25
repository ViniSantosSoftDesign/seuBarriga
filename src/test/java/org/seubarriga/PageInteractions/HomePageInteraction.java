package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.*;

public class HomePageInteraction extends HomePage {

    public HomePageInteraction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAccountsDropDownButton(){
        driver.findElement(dropDownAccountsBy).click();
    }

    public AddAccountPageInteraction clickOnAddButton(){
        clickOnAccountsDropDownButton();
        driver.findElement(addAccountButtonBy).click();
        return new AddAccountPageInteraction(driver);
    }

    public AccountsListInteraction clickOnShowListOfAccounts(){
        clickOnAccountsDropDownButton();
        driver.findElement(showListOfAccountsBy).click();
        return new AccountsListInteraction(driver);
    }

    public CreateFinancialMovementPageInteraction clickOnCreateFinancialMovement(){
        driver.findElement(createFinancialMovementBy).click();
        return new CreateFinancialMovementPageInteraction(driver);
    }

    public BankStatementPageInteraction clickOnMonthlySummary(){
        driver.findElement(monthlySummaryBy).click();
        return new BankStatementPageInteraction(driver);
    }

}
