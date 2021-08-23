package org.seubarriga.Utils;

import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;
    protected HomePage loginPage;

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://seubarriga.wcaquino.me");

        loginPage = new LoginPage(driver);

    }

}
