package org.seubarriga.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage {
    protected WebDriver driver;
    protected By editButton = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[1]/span[@class='glyphicon glyphicon-edit']");
    protected By deleteButton = By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[2]/span[@class='glyphicon glyphicon-remove-circle']");


}
