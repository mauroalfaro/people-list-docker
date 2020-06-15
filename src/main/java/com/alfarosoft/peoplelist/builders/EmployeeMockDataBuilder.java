package com.alfarosoft.peoplelist.builders;

import com.alfarosoft.peoplelist.model.Address;
import com.alfarosoft.peoplelist.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMockDataBuilder {
    List<Employee> employeeMocks;

    private Logger log = LoggerFactory.getLogger(EmployeeMockDataBuilder.class);

    public EmployeeMockDataBuilder() {
        this.employeeMocks = new ArrayList<>();
    }

    public List<Employee> buildMockedData(){
        log.info("Employees are being mocked");
        Employee firstEmployee = new Employee();
        Employee secondEmployee = new Employee();
        Employee thirdEmployee = new Employee();

        firstEmployee.setId("employee001");
        firstEmployee.setName("John");
        firstEmployee.setSurname("Marston");
        firstEmployee.setEmail("john@marston.com");
        firstEmployee.setPhone("50552262");
        firstEmployee.setDateHired("07/02/2015");
        firstEmployee.setActiveEmployee(true);

        secondEmployee.setId("employee002");
        secondEmployee.setName("Arthur");
        secondEmployee.setSurname("Morgan");
        secondEmployee.setEmail("arthur@morgan.com");
        secondEmployee.setPhone("55556791");
        secondEmployee.setDateHired("12/22/2014");
        secondEmployee.setActiveEmployee(false);

        thirdEmployee.setId("employee003");
        thirdEmployee.setName("Dutch");
        thirdEmployee.setSurname("Van der Linde");
        thirdEmployee.setEmail("dutch@vanderlinde.com");
        thirdEmployee.setPhone("50552333");
        thirdEmployee.setDateHired("04/30/2011");
        thirdEmployee.setActiveEmployee(false);

        Address firstAddress = new Address();
        Address secondAddress = new Address();
        Address thirdAddress = new Address();

        firstAddress.setStreet("First Street");
        firstAddress.setNumber(145);
        firstAddress.setCity("Tampa");
        firstAddress.setState("Florida");
        firstAddress.setPostalCode("FL190800");
        firstEmployee.setAddress(firstAddress);

        secondAddress.setStreet("Second Street");
        secondAddress.setNumber(175);
        secondAddress.setCity("Jacksonville");
        secondAddress.setState("Florida");
        secondAddress.setPostalCode("FL191811");
        secondEmployee.setAddress(secondAddress);

        thirdAddress.setStreet("Third Street");
        thirdAddress.setNumber(188);
        thirdAddress.setCity("Key West");
        thirdAddress.setState("Florida");
        thirdAddress.setPostalCode("FL18800");
        thirdEmployee.setAddress(thirdAddress);

        employeeMocks.add(firstEmployee);
        employeeMocks.add(secondEmployee);
        employeeMocks.add(thirdEmployee);

        log.info("Employees successfully mocked");
        return employeeMocks;
    }
}
