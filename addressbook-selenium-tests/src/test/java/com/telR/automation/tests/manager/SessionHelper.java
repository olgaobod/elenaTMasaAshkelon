package com.telR.automation.tests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(ChromeDriver wd) {
        super(wd);
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);
        type(By.name("pass"), password);

        click(By.xpath("//*[@type='submit']"));

    }
}
