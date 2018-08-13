package com.telR.automation.tests.tests;

import com.telR.automation.tests.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends  TestBase{


    @Test
    public void testContactCreation() {
        if(!app.getContactHelper().isOnTheHomePage()){
            app.getContactHelper().goToHomePage();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new Contacts()
                .withFirstName("firstName")
                .withLname("lname")
                .withAddress("address"));
        app.getContactHelper().submitContactCreation();

        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before+1);

    }

}
