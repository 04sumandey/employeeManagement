package com.pcs.employee.employeeManagement.repository;

import com.pcs.employee.employeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
}