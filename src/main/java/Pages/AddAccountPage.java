package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountPage {
    private WebDriver driver;
    private By nameBy = By.id("nome");
    private By savaButtonBy = By.className("btn-primary");
    private By alertDangerBy = By.className("alert-danger");
    private By alertSuccessBy = By.className("alert-success");


    public AddAccountPage(WebDriver driver) {
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
