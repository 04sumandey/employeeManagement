package com.pcs.employee.employeeManagement.model;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String FirstName;
    String LastName;
    String EmailId;
    String PhoneNumber;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailId, String phoneNumber) {
        FirstName = firstName;
        LastName = lastName;
        EmailId = emailId;
        PhoneNumber = phoneNumber;
    }



    public Long getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }


}
