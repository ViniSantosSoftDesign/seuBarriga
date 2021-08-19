package org.seubarriga.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class TestSecondPart {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.id("email")).sendKeys("aguia@aguia.com.br");
        driver.findElement(By.id("senha")).sendKeys("32690305");
        driver.findElement(By.className("btn-primary")).submit();
    }

 /*   @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void validateTheErrorsMandatoryMessageOfFilds() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.linkText("Criar Movimentação")).click();
        driver.findElement(By.className("btn-primary")).submit();
        List<WebElement> erros = driver.findElements((By.xpath("//div[@class='alert alert-danger']//li")));
        List<String> retorno = new ArrayList<String>();
        String stringToCompare = "Data da Movimentação é obrigatório" +
                "Data do pagamento é obrigatório" + "Descrição é obrigatório" +
                "Interessado é obrigatório" + "Valor é obrigatório" + "Valor deve ser um número";

        for (WebElement element : erros) {
            if (element.getText() != "Valor deve ser um número") {
                Assert.assertThat(stringToCompare, containsString(element.getText()));
            }

        }


    }


}
