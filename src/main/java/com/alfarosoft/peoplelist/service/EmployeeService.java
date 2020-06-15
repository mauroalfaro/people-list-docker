package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.EmployeeMockDataBuilder;
import com.alfarosoft.peoplelist.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeMockDataBuilder employeeMockDataBuilder;
    private List<Employee> employeeList;

    public EmployeeService() {
        this.employeeMockDataBuilder = new EmployeeMockDataBuilder();
        employeeList = employeeMockDataBuilder.buildMockedData();
    }

    public Employee getEmployee(String id){
        return new Employee();
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Employee addEmployee (Employee employee){
        employeeList.add(employee);
        return employee;
    }

    public Employee updateEmployee (String id, Employee employee){
        return employee;
    }

    public void removeEmployee (String id){
        //Not implemented
    }
}
