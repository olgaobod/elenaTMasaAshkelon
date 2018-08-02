package com.telR.automation.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends  TestBase{


    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm();
        submitContactCreation();

    }

}
