package com.telR.automation.tests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    ChromeDriver wd;

    public HelperBase(ChromeDriver wd) {
        this.wd = wd;
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean areElementsPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();

    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
