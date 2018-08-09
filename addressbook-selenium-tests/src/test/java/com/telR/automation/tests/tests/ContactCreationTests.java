package com.telR.automation.tests.tests;

import com.telR.automation.tests.Contacts;
import org.testng.annotations.Test;

public class ContactCreationTests extends  TestBase{


    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new Contacts("firstName", "lname", "address", "12345"));
        app.getContactHelper().submitContactCreation();

    }

}
