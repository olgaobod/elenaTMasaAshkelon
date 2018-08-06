package com.telR.automation.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test(priority = 1)
    public void testGroupCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm("testGroup", "test", "test");
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before+1);
    }


    @Test(priority = 2)
    public void testGroupWithLongNameCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm("testGroupoooooooooooooooooooooo", "test", "test");
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();
        System.out.println("count before creation is: " + before +" ; count after creation is: " + after );

        Assert.assertEquals(after, before+1);
    }

    @Test(priority = 3)
    public void testGroupWithEmptyFieldsCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm("", "", "");
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before+1);
    }

}
