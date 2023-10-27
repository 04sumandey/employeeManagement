package com.pcs.employee.employeeManagement.service;

import com.pcs.employee.employeeManagement.model.Employee;
import com.pcs.employee.employeeManagement.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class GetEmployee {
    EmployeeRepo employeeRepo;

    public GetEmployee(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee GetEmployee(String id){
        if (employeeRepo.findById(id).isPresent()){
            return employeeRepo.findById(id).get();
        }

        return null;
    }
}
