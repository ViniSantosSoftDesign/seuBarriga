package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAccountPage {
    protected WebDriver driver;

    //We put By in the end of a variable to be ease to track the tipy of it.
    protected By nameBy = By.id("nome");
    protected By saveButtonBy = By.className("btn-primary");
    protected By alertDangerBy = By.className("alert-danger");
    protected By alertSuccessBy = By.className("alert-success");
}
