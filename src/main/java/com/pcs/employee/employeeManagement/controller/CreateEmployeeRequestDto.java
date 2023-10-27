package com.pcs.employee.employeeManagement.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateEmployeeRequestDto {
    @JsonProperty("first_name")
    String FirstName;
    @JsonProperty("last_name")
    String LastName;
    @JsonProperty("email_id")
    String EmailId;
    @JsonProperty("phone_number")
    String PhoneNumber;

    public CreateEmployeeRequestDto(String firstName, String lastName, String emailId, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        EmailId = emailId;
        PhoneNumber = phoneNumber;
    }



    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
