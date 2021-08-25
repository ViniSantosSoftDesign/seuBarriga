package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountPage {
    protected WebDriver driver;
    protected By nameBy = By.id("nome");
    protected By savaButtonBy = By.className("btn-primary");
    protected By alertDangerBy = By.className("alert-danger");
    protected By alertSuccessBy = By.className("alert-success");

    public void setName(String name) {
        driver.findElement(nameBy).sendKeys(name);
    }

    public void clickOnSaveButtonToSaveAnAccount() {
        driver.findElement(savaButtonBy).click();
    }

    public String getTextReturnedOnAlertDanger() {
        return driver.findElement(alertDangerBy).getText();
    }

    public String getTextReturnedOnAlertSuccess() {
        return driver.findElement(alertSuccessBy).getText();
    }
}
