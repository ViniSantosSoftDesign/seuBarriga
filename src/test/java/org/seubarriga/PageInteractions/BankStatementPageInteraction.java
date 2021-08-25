package org.seubarriga.PageInteractions;

import org.openqa.selenium.WebDriver;
import org.seubarriga.Pages.BankStatementPage;

public class BankStatementPageInteraction extends BankStatementPage {

    public BankStatementPageInteraction(WebDriver driver) {
        this.driver = driver;
    }
}
