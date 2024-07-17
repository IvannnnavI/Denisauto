package com.denisauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uc-accept-all-button")
    WebElement accept;

    public SearchPage clickOnAccept() {
        click(accept);

        return this;
    }



    public SearchPage selectKids() {
        driver.findElement(By.xpath("//*[.='Kids']")).click();
        return this;
    }
}
