package com.company;

public class Account {
    public String firstName;
    public String lastName;
    public int socialSecurity;
    public static String bank;
    public final String BANK = "Capital 147";

    // Getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    // Setters
    public void setFirstName(java.lang.String fName) {
        this.firstName = fName;
    }
    public void setLastName(java.lang.String lName) {
        this.firstName = lName;
    }
}
