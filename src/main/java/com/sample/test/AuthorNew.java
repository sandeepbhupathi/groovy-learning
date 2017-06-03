package com.sample.test;

/**
 * Created by sande on 5/29/2017.
 */
public class AuthorNew {
    private String firstName;
    private String lastName;

    public AuthorNew(String thisFirstName,String thisLastName){
        firstName = thisFirstName;
        lastName = thisLastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
