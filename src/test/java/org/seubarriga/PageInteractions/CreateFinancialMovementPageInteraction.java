package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seubarriga.Pages.CreateFinancialMovementPage;

import java.util.List;

public class CreateFinancialMovementPageInteraction extends CreateFinancialMovementPage {

    public CreateFinancialMovementPageInteraction(WebDriver driver) {
        this.driver = driver;
    }

    public void setDataOFTransaction(String data) {
        driver.findElement(dataOFTransactionBy).sendKeys(data);
    }

    public void setDataOFpayment(String data) {
        driver.findElement(dataOFpaymenteBy).sendKeys(data);
    }

    public void setDescription(String data) {
        driver.findElement(descriptionBy).sendKeys(data);
    }

    public void setWhoWants(String data) {
        driver.findElement(whoWantsBy).sendKeys(data);
    }

    public void setValue(String data) {
        driver.findElement(valueBy).sendKeys(data);
    }

    public void clickOnSaveButtonToSaveAFinancialMovement() {
        driver.findElement(saveButtonby).click();
    }

    public String getTextReturnedOnAlertDanger() {
        return driver.findElement(alertDangerBy).getText();
    }

    public String getTextReturnedOnAlertSuccess() {
        return driver.findElement(alertSuccessBy).getText();
    }

    public List<WebElement> getAllMessagesAlertDanger(){

        List<WebElement> listOfErros;

        listOfErros = driver.findElements(erros);
        return listOfErros;
    }

}
