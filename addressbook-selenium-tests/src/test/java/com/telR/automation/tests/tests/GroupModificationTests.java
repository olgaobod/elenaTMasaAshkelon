package com.telR.automation.tests.tests;

import com.telR.automation.tests.Group;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase {
    @Test
    public  void  testGroupModification(){
        app.getGroupHelper().goToGroupsPage();

        if(!app.getGroupHelper().isGroupPresent()){
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new Group("ModifyGroup", "Modtest", "modtest"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();

        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before);

    }

}
