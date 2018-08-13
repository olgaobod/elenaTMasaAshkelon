package com.telR.automation.tests.manager;

import com.telR.automation.tests.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelper extends HelperBase {


    public ContactHelper(ChromeDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }



    public void fillContactForm(Contacts contacts) {
        type(By.name("firstname"), contacts.getFirstName());
        type(By.name("lastname"), contacts.getLname());
        type(By.name("address"), contacts.getAddress());
        type(By.name("home"), contacts.getHomePhone());
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
        fillContactForm(new Contacts() .withFirstName("firstName")
                .withLname("lname")
                .withAddress("address")
                .withHomePhone("12345"));
        submitContactCreation();

    }

    public boolean isOnTheHomePage() {
        return isElementPresent(By.id("maintable"));
    }

    public void goToHomePage() {
        click(By.xpath("//a[@href='./']"));
    }

    public void initEditContactByClickingOnThePencil() {
        click(By.xpath("//*[@title='Edit']"));
    }

    public void confirmContactModification() {
        click(By.xpath("//input[@value='Update']"));
    }
}
