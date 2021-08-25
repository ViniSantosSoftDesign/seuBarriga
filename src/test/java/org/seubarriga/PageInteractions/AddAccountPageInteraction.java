package org.seubarriga.PageInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.AddAccountPage;

public class AddAccountPageInteraction extends AddAccountPage {

    public AddAccountPageInteraction(WebDriver driver) {
        this.driver = driver;
    }

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
