package com.fas.supplier.dtos;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class UpdateSupplier {
    @Length(min = 6, max = 16, message = "Username should be of length b/w 6 and 16")
    private String username;
    @Length(min=4, max=16, message = "First name must be b/w 4 and 16")
    private String firstName;
    @Length(min=4, max=16, message = "Last name must be b/w 4 and 16")
    private String lastName;

    @Min(1)
    @Max(999999)
    private Long pincode;

    @Length(min=10, max=14)
    @NotEmpty
    private String phnNumber;

    public UpdateSupplier(String username, String john, String doe, String s, String s1) {
    }

    public UpdateSupplier() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }

    @Override
    public String toString() {
        return "UpdateSupplier{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pincode=" + pincode +
                ", phnNumber='" + phnNumber + '\'' +
                '}';
    }
}
