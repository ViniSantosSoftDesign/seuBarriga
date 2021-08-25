package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    protected WebDriver driver;
    protected By dropDownAccountsBy = By.className("dropdown-toggle");
    protected By addAccountButtonBy = By.linkText("Adicionar");
    protected By showListOfAccountsBy = By.linkText("Listar");
    protected By createFinancialMovementBy = By.linkText("Criar Movimentação");
    protected By monthlySummaryBy = By.linkText("Resumo Mensal");

}
