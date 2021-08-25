package org.seubarriga.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZbaseToPages {
    protected WebDriver driver;

    public ZbaseToPages(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtons(WebElement element){
        element.click();
    }
}
