package com.alfarosoft.peoplelist.controller;

import com.alfarosoft.peoplelist.exception.AddressValidationException;
import com.alfarosoft.peoplelist.exception.PeopleListException;
import com.alfarosoft.peoplelist.model.Customer;
import com.alfarosoft.peoplelist.service.CustomerService;
import com.alfarosoft.peoplelist.validation.AddressValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

@RestController
@RequestMapping(value = "/services/customers")
public class CustomerController {

    private final CustomerService customerService;
    private final AddressValidation addressValidation;

    @Autowired
    public CustomerController(CustomerService customerService, AddressValidation addressValidation) {
        this.customerService = customerService;
        this.addressValidation = addressValidation;
    }

    @PostMapping(value = "/add", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> addCustomer (@RequestBody Customer customer){
        addressValidation.validateAddress(customer.getAddress());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerService.addCustomer(customer));
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> lookupCustomer (@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomer(id));
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> searchCustomers(){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomers());
    }

    @PutMapping(value = "/update/{id}" , produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> updateCustomer (@PathVariable String id, @RequestBody Customer customer){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.updateCustomer(id, customer));
    }

    @DeleteMapping(value = "/delete/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteCustomer(@PathVariable String id){
        customerService.removeCustomer(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Customer successfully removed");
    }

    @ExceptionHandler(PeopleListException.class)
    public ResponseEntity<String> handleException(final PeopleListException e){
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }

    @ExceptionHandler(AddressValidationException.class)
    public ResponseEntity<String> handleException(final AddressValidationException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
