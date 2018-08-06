package com.telR.automation.tests.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
    @Test
    public void  testGroupDeletion(){

        app.getGroupHelper().goToGroupsPage();

        if(!app.getGroupHelper().isGroupPresent()){
            app.getGroupHelper().createGroup();
        }

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickOnDeleteGroupButton();
        app.getGroupHelper().returnToGroupsPage();
    }

}
