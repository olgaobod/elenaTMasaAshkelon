package com.telR.automation.tests;

public class Contacts {
    private final String firstName;
    private final String lname;
    private final String address;
    private String phone;

    public Contacts(String firstName, String lname, String address, String phone) {
        this.firstName = firstName;
        this.lname = lname;
        this.address = address;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
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
