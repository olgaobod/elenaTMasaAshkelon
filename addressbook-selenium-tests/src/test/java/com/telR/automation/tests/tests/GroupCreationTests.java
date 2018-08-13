package com.telR.automation.tests.tests;

import com.telR.automation.tests.Groups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new Groups()
                .withName("testGroup")
                .withHeader("test")
                .withFooter("test"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before+1);
    }


    @Test
    public void testGroupWithLongNameCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new Groups()
                .withHeader("testGroupoooooooooooooooooooooo")
                .withFooter("test"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();
        System.out.println("count before creation is: " + before +" ; count after creation is: " + after );

        Assert.assertEquals(after, before+1);
    }

    @Test
    public void testGroupWithEmptyFieldsCreation() {
        app.getGroupHelper().goToGroupsPage();

        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new Groups());
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before+1);
    }

}
