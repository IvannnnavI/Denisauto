package com.denisauto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }






    public boolean isElementVisible(WebElement el) {
        try {
            el.isDisplayed();
            return true;
        }catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }

    }


    public String getValueAttribute(WebElement element) {
        return element.getAttribute("aria-describedby");
    }



}
