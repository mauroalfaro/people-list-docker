package com.alfarosoft.peoplelist.validation;

import com.alfarosoft.peoplelist.exception.AddressValidationException;
import com.alfarosoft.peoplelist.model.Address;

public class AddressValidation {
    public AddressValidation() {
    }

    //As a mock example, this validates that the address coming should have the state 'Florida'
    public void validateAddress (Address address){
        if(!address.getState().equals("Florida")){
            throw new AddressValidationException("Address validation failed: state should be Florida");
        }
    }

}
