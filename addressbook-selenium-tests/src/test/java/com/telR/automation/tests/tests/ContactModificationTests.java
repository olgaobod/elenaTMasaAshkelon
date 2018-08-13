package com.telR.automation.tests.tests;

import com.telR.automation.tests.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends  TestBase{
     @Test
    public void testContactModification(){
         if(!app.getContactHelper().isOnTheHomePage()){
             app.getContactHelper().goToHomePage();
               }
         if(!app.getContactHelper().isContactPresent()){
             app.getContactHelper().createContact();
         }
         int before = app.getContactHelper().getContactCount();

     app.getContactHelper().initEditContactByClickingOnThePencil();
       app.getContactHelper().fillContactForm(new Contacts()
               .withFirstName("modifyed")
               .withLname("modifyed")
               .withAddress("modifyed")
               .withHomePhone("modifyed"));
         app.getContactHelper().confirmContactModification();

         int after = app.getContactHelper().getContactCount();
         Assert.assertEquals(after, before);

    }
}
