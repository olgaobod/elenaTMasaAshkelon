package com.telR.automation.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm();
        submitGroupCreation();
        returnToGroupsPage();
    }


}
