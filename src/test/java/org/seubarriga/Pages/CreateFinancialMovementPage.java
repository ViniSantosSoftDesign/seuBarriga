package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateFinancialMovementPage {

    protected WebDriver driver;
    protected By dataOFTransactionBy  = By.id("data_transacao");
    protected By dataOFpaymenteBy = By.id("data_pagamento");
    protected By descriptionBy = By.id("descricao");
    protected By whoWantsBy = By.id("interessado");
    protected By valueBy = By.id("valor");
    protected By saveButtonby = By.className("btn-primary");
    protected By alertDangerBy = By.className("alert-danger");
    protected By alertSuccessBy = By.className("alert-success");

}
