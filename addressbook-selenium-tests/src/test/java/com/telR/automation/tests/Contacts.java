package com.telR.automation.tests;

public class Contacts {
    private String firstName;
    private String lname;
    private String address;
    private String homePhone;

    public Contacts withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Contacts withLname(String lname) {
        this.lname = lname;
        return this;
    }

    public Contacts withAddress(String address) {
        this.address = address;
        return this;
    }

    public Contacts withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }
}
