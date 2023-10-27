package com.pcs.employee.employeeManagement.service;

import com.pcs.employee.employeeManagement.controller.CreateEmployeeRequestDto;
import com.pcs.employee.employeeManagement.model.Employee;
import com.pcs.employee.employeeManagement.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployee {
    EmployeeRepo employeeRepo;

    public CreateEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    public Boolean CreateEmployee(CreateEmployeeRequestDto dto){
        Employee employee=new Employee(dto.getFirstName(), dto.getLastName(), dto.getEmailId(), dto.getPhoneNumber());
        employeeRepo.save(employee);
        return true;
    }
}
