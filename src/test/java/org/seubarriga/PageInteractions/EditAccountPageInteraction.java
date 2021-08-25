package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.EditAccountPage;

public class EditAccountPageInteraction extends EditAccountPage {

    public EditAccountPageInteraction(WebDriver driver) {
        this.driver=driver;
    }

    public void clearName(){
        driver.findElement(nameBy).clear();
    }
    public void setName(String name){
        driver.findElement(nameBy).sendKeys(name);
    }
    public void clickOnSaveButton()

}
