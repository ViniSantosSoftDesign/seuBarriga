package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseToPages {
    private WebDriver driver;

    public BaseToPages(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtons(WebElement element){
        element.click();
    }
}
