package com.telR.automation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
    @Test
    public void  testGroupDeletion(){

        goToGroupsPage();

        if(!isGroupPresent()){
            createGroup();
        }

        selectGroup();
        clickOnDeleteGroupButton();
        returnToGroupsPage();
    }

}
