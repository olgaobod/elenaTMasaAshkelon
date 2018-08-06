package com.telR.automation.tests.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends  TestBase{


    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm("firstName", "lname", "address");
        app.getContactHelper().submitContactCreation();

    }

}
