package org.seubarriga.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

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

    /*@After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void addAnAccountSuccessfully() {
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Adicionar")).click();


    }


}