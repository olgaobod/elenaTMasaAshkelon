package com.telR.automation.tests.manager;

import com.telR.automation.tests.Group;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper  extends  HelperBase{

    public GroupHelper(ChromeDriver wd) {
        super(wd);
    }

    public void returnToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
         }

    public void fillGroupForm(Group group) {
        type(By.name("group_name"), group.getName());
        type(By.name("group_header"), group.getHeader());
       type(By.name("group_footer"), group.getFooter());

    }

    public void initGroupCreation() {
        click(By.name("new"));
          }

    public void goToGroupsPage() {
        click(By.linkText("groups"));
            }

    public void selectGroup() {
        click(By.name("selected[]"));

    }

    public int getGroupsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void clickOnDeleteGroupButton() {
        click(By.name("delete"));
          }

    public  boolean isGroupPresent(){
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        initGroupCreation();
        fillGroupForm(new Group("testGroup", "test", "test"));
        submitGroupCreation();
        returnToGroupsPage();
    }

    public void submitGroupModification() {
        click(By.xpath("//*[@type='submit']"));

    }

    public void initGroupModification() {
        click(By.name("edit"));

    }

}
