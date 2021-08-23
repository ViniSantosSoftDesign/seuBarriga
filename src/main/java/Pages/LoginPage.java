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

    public void writeEmailInTheField(String userEmail) {
        driver.findElement(emailBy).sendKeys(userEmail);

    }

    public void writePasswordInTheField(String userPassword) {
        driver.findElement(passwordBy).sendKeys(userPassword);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButtonBy).click();
        return new HomePage(driver);
    }

    public HomePage loginValidUser(String userEmail, String userPassword) {
        writeEmailInTheField(userEmail);
        writePasswordInTheField(userPassword);
        return new HomePage(driver);

    }


    public void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me");
        driver.findElement(By.id("email")).sendKeys("aguia1@aguia.com.br");
        driver.findElement(By.id("senha")).sendKeys("32690305");
        driver.findElement(By.className("btn-primary")).submit();
    }
}
