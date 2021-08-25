package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.LoginPage;

public class LoginPageInteraction extends LoginPage {

    public LoginPageInteraction(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserEmail(String userEmail) {
        driver.findElement(emailBy).sendKeys(userEmail);

    }

    public void setUserPassword(String userPassword) {
        driver.findElement(passwordBy).sendKeys(userPassword);
    }

    public HomePageInteraction clickLoginButtonReturnsHomePageObject() {
        driver.findElement(loginButtonBy).click();
        return new HomePageInteraction(driver);
    }

}
