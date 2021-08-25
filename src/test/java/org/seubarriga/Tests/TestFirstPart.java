package org.seubarriga.Tests;

import org.junit.*;
import org.openqa.selenium.By;

import org.seubarriga.Utils.BaseTest;

public class TestFirstPart extends BaseTest {

    @Test
    public void validateMessageReturnedWhenCreateAnAccountSuccessfully() {
        addAnAccountWithName("titia10");
        Assert.assertEquals("Conta adicionada com sucesso!", accountPage.getTextReturnedOnAlertSuccess());
    }

    @Test
    public void validateTheErrorMessageReturnedWhenCreateAnAccountWithoutPutName() {
        addAnAccountWithNoName();
        Assert.assertEquals("Informe o nome da conta", accountPage.getTextReturnedOnAlertDanger());
    }

    @Test
    public void mustShowAllAccountsOnTheSystem() {
        accountList = homePage.clickOnShowListOfAccounts();
        //O que validar??
    }

    @Test
    public void validateMessageReturnedWhenChangeTheNameOfAnAccountSuccessfully() {

       /* accountList = homePage.clickOnShowListOfAccounts();

        driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[1]/span[@class='glyphicon glyphicon-edit']")).click();
        driver.findElement(By.id("nome")).clear();
        driver.findElement(By.id("nome")).sendKeys("ALTERADO");
        driver.findElement(By.className("btn-primary")).submit();*/
        changeAnAccountName("ALTERADO");
        Assert.assertEquals("Conta alterada com sucesso!", driver.findElement(By.className("alert-success")).getText());
    }

    @Test
    public void validateMessageReturnedWhenDeleteAnAccountSuccessfully() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Listar")).click();
        driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[2]/span[@class='glyphicon glyphicon-remove-circle']")).click();
        Assert.assertEquals("Conta removida com sucesso!", driver.findElement(By.className("alert-success")).getText());
    }


}
