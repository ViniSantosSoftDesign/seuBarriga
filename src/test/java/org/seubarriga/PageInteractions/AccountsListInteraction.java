package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.AccountsListPage;

public class AccountsListInteraction extends AccountsListPage {

    public AccountsListInteraction(WebDriver driver) {
        this.driver = driver;
    }

    public EditAccountPageInteraction clickOnEditButton(){
        driver.findElement(editButton).click();
        return new EditAccountPageInteraction(driver);
    }


}
