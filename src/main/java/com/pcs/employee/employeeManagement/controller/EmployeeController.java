package com.pcs.employee.employeeManagement.controller;

import com.pcs.employee.employeeManagement.model.Employee;
import com.pcs.employee.employeeManagement.model.ErrorResponse;
import com.pcs.employee.employeeManagement.service.CreateEmployee;
import com.pcs.employee.employeeManagement.service.GetEmployee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    CreateEmployee createEmployeeService;
    GetEmployee getEmployeeService;

    public EmployeeController(CreateEmployee createEmployeeService, GetEmployee getEmployeeService) {
        this.createEmployeeService = createEmployeeService;
        this.getEmployeeService = getEmployeeService;
    }

    @PostMapping("/create")
    public CreateEmployeeResponceDto createEmployee(@RequestBody CreateEmployeeRequestDto dto){
        Boolean success=createEmployeeService.CreateEmployee(dto);
        return new CreateEmployeeResponceDto(success);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> GetEmployeeByID(@PathVariable String id ){
        Employee employee=getEmployeeService.GetEmployee(id);
        if (employee!=null){
            return ResponseEntity.ok(employee);
        }else{
            ErrorResponse errorResponse=new ErrorResponse("INVALID_ID", "Vendor Does not Exists");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }

}
