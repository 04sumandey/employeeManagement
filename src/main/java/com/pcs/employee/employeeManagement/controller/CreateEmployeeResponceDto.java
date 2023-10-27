package com.pcs.employee.employeeManagement.controller;

public class CreateEmployeeResponceDto {

    Boolean Success;
    public Boolean getSuccess() {
        return Success;
    }

    public void setSuccess(Boolean success) {
        Success = success;
    }


    public CreateEmployeeResponceDto(Boolean success) {
        Success = success;
    }


}
