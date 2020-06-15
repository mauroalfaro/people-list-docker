package com.alfarosoft.peoplelist.builders;

import com.alfarosoft.peoplelist.model.Address;
import com.alfarosoft.peoplelist.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomerMockDataBuilder {
    List<Customer> customerMocks;

    private Logger log = LoggerFactory.getLogger(CustomerMockDataBuilder.class);


    public CustomerMockDataBuilder() {
        this.customerMocks = new ArrayList<>();
    }

    public List<Customer> buildMockedData(){
        log.info("Customers are being mocked");

        Customer firstCustomer = new Customer();
        Customer secondCustomer = new Customer();
        Customer thirdCustomer = new Customer();

        firstCustomer.setId("customer001");
        firstCustomer.setName("Michael");
        firstCustomer.setSurname("De Santa");
        firstCustomer.setEmail("michael@desanta.com");
        firstCustomer.setPhone("50552262");
        firstCustomer.setLoyaltyId("loyalty001");

        secondCustomer.setId("customer002");
        secondCustomer.setName("Franklin");
        secondCustomer.setSurname("Clinton");
        secondCustomer.setEmail("arthur@morgan.com");
        secondCustomer.setPhone("55556791");
        secondCustomer.setLoyaltyId("loyalty002");

        thirdCustomer.setId("customer003");
        thirdCustomer.setName("Dutch");
        thirdCustomer.setSurname("Van der Linde");
        thirdCustomer.setEmail("dutch@vanderlinde.com");
        thirdCustomer.setPhone("50552333");
        thirdCustomer.setLoyaltyId("loyalty003");

        Address firstAddress = new Address();
        Address secondAddress = new Address();
        Address thirdAddress = new Address();

        firstAddress.setStreet("First Street");
        firstAddress.setNumber(145);
        firstAddress.setCity("Tampa");
        firstAddress.setState("Florida");
        firstAddress.setPostalCode("FL190800");
        firstCustomer.setAddress(firstAddress);

        secondAddress.setStreet("Second Street");
        secondAddress.setNumber(175);
        secondAddress.setCity("Jacksonville");
        secondAddress.setState("Florida");
        secondAddress.setPostalCode("FL191811");
        secondCustomer.setAddress(secondAddress);

        thirdAddress.setStreet("Third Street");
        thirdAddress.setNumber(188);
        thirdAddress.setCity("Key West");
        thirdAddress.setState("Florida");
        thirdAddress.setPostalCode("FL18800");
        thirdCustomer.setAddress(thirdAddress);

        customerMocks.add(firstCustomer);
        customerMocks.add(secondCustomer);
        customerMocks.add(thirdCustomer);

        log.info("Customers successfully mocked");

        return customerMocks;
    }
}
