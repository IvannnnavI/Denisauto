package com.denisauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public SearchPage clickOnShoesLink() {
        driver.findElement(By.xpath("//*[.='Shoes']")).click();
        return new SearchPage(driver);
    }
}
