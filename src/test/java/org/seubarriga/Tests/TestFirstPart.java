package org.seubarriga.Tests;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.seubarriga.Utils.BaseTest;

public class TestFirstPart extends BaseTest {

    private WebDriver driver;

    @Test
    public void validateMessageReturnedWhenCreateAnAccountSuccessfully(WebDriver driver) {

        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Adicionar")).click();
        driver.findElement(By.id("nome")).sendKeys("99999");
        driver.findElement(By.className("btn-primary")).submit();
        Assert.assertEquals("Conta adicionada com sucesso!", driver.findElement(By.className("alert-success")).getText());
    }

    @Test
    public void validateTheErrorMessageReturnedWhenCreateAnAccountWithoutPutName() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Adicionar")).click();
        driver.findElement(By.className("btn-primary")).submit();
        Assert.assertEquals("Informe o nome da conta", driver.findElement(By.className("alert-danger")).getText());
    }

    @Test
    public void mustShowAllAccountsOnTheSystem() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Listar")).click();
    }

    @Test
    public void validateMessageReturnedWhenChangeTheNameOfAnAccountSuccessfully() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Listar")).click();
        driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[1]/span[@class='glyphicon glyphicon-edit']")).click();
        driver.findElement(By.id("nome")).clear();
        driver.findElement(By.id("nome")).sendKeys("ALTERADO");
        driver.findElement(By.className("btn-primary")).submit();
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
