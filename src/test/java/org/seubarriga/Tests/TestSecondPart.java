package org.seubarriga.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seubarriga.Utils.BaseTest;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class TestSecondPart extends BaseTest {

    @Test
    public void validateTheErrorsMandatoryMessageOfFilds() {

        driver.findElement(By.linkText("Criar Movimentação")).click();
        driver.findElement(By.className("btn-primary")).submit();
        List<WebElement> erros = driver.findElements((By.xpath("//div[@class='alert alert-danger']//li")));

        String stringToCompare = "Data da Movimentação é obrigatório" +
                "Data do pagamento é obrigatório" + "Descrição é obrigatório" +
                "Interessado é obrigatório" + "Valor é obrigatório" + "Valor deve ser um número";

        for (WebElement element : erros) {
            if (element.getText() != "Valor deve ser um número") {
                Assert.assertThat(stringToCompare, containsString(element.getText()));
            }

        }

    }

    @Test
    public void validateTheErrorMessageOfValueFieldMustBeOnlyNumbers() {

        createFinancialMovementSendingForbiddenMonetaryValueType();
        Assert.assertEquals("Valor deve ser um número", createFinancialPage.getTextReturnedOnAlertDanger());

    }

    @Test
    public void validateTheMessageWhenFinancialMovementIsCreatedSuccessfully() {
       /* driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.linkText("Criar Movimentação")).click();

        driver.findElement(By.id("data_transacao")).sendKeys("19/08/2021");
        driver.findElement(By.id("data_pagamento")).sendKeys("25/08/2021");
        driver.findElement(By.id("descricao")).sendKeys("Aluguel super atrasado");
        driver.findElement(By.id("interessado")).sendKeys("Herdeiro do Madruga");
        driver.findElement(By.id("valor")).sendKeys("1.99");
        driver.findElement(By.className("btn-primary")).submit();*/

        createFinancialMovementCorrectly();
        Assert.assertEquals("Movimentação adicionada com sucesso!", createFinancialPage.getTextReturnedOnAlertSuccess());
    }

    @Test
    public void validateIfTheFinancialMovementeIsShownAtMonthlyFinancialSummary() {
        String description = "Sim Eu sou uma movimentação e fui cadastrada!";
        String everything = "";

        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.linkText("Criar Movimentação")).click();

        driver.findElement(By.id("data_transacao")).sendKeys("19/08/2021");
        driver.findElement(By.id("data_pagamento")).sendKeys("25/08/2021");
        driver.findElement(By.id("descricao")).sendKeys(description);
        driver.findElement(By.id("interessado")).sendKeys("Herdeiro do Madruga");
        driver.findElement(By.id("valor")).sendKeys("100");
        driver.findElement(By.className("btn-primary")).submit();

        driver.findElement(By.linkText("Resumo Mensal")).click();

        List<WebElement> erros = driver.findElements((By.tagName("tbody")));

        for (WebElement element : erros) {
            everything = everything + element.getText();
        }
        Assert.assertThat(everything, containsString(description));
    }

}
