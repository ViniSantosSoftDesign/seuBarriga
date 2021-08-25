package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAccountPage {
    protected WebDriver driver;
    protected By nameBy = By.id("nome");
    protected By savaButtonBy = By.className("btn-primary");
    protected By alertDangerBy = By.className("alert-danger");
    protected By alertSuccessBy = By.className("alert-success");

}
