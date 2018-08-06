package com.telR.automation.tests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelper extends HelperBase {


    public ContactHelper(ChromeDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }



    public void fillContactForm(String firstName, String lname, String address) {
        type(By.name("firstname"), firstName);
        type(By.name("lastname"), lname);
        type(By.name("address"), address);
    }

      public void initContactCreation() {
        click(By.linkText("add new"));
    }


    public void selectContact() {
        click(By.name("selected[]"));
    }

//    public void initContactDeletion() {
//    }

    public void clickOnDeleteContactButton() {
        click(By.xpath("//*[@value='Delete']"));

    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public boolean isContactPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact() {
        initContactCreation();
        fillContactForm("firstName", "lname", "address");
        submitContactCreation();

    }
}
