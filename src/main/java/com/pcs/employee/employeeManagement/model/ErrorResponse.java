package com.pcs.employee.employeeManagement.model;

public class ErrorResponse {
    public String getErrorCode() {
        return ErrorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    String ErrorCode;
    String ErrorMessage;

    public ErrorResponse(String errorCode, String errorMessage) {
        ErrorCode = errorCode;
        ErrorMessage = errorMessage;
    }
}
