package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    //We put By in the end of a variable to be ease to track the tipy of it.
    private By emailBy = By.id("email");
    private By loginButtonBy = By.className("btn-primary");
    private By passwordBy = By.id("senha");


    //This is a constructor.
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserEmail(String userEmail) {
        driver.findElement(emailBy).sendKeys(userEmail);

    }

    public void setUserPassword(String userPassword) {
        driver.findElement(passwordBy).sendKeys(userPassword);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButtonBy).click();
        return new HomePage(driver);
    }

    public HomePage loginValidUser(String userEmail, String userPassword) {
        setUserEmail(userEmail);
        setUserPassword(userPassword);
        return new HomePage(driver);

    }
}
