package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.CustomerMockDataBuilder;
import com.alfarosoft.peoplelist.model.Customer;

import java.util.List;

public class CustomerService {
    private CustomerMockDataBuilder customerMockDataBuilder;
    private List<Customer> customerList;

    public CustomerService() {
        this.customerMockDataBuilder = new CustomerMockDataBuilder();
        customerList = customerMockDataBuilder.buildMockedData();
    }

    public Customer getCustomer(String id){
        return new Customer();
    }

    public List<Customer> getCustomers(){
        return customerList;
    }

    public Customer addCustomer (Customer customer){
        customerList.add(customer);
        return customer;
    }

    public Customer updateCustomer(String id, Customer customer){
        return customer;
    }

    public void removeCustomer (String id){
        //Not implemented
    }
}
