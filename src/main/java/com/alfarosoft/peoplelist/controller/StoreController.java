package com.alfarosoft.peoplelist.controller;

import com.alfarosoft.peoplelist.exception.AddressValidationException;
import com.alfarosoft.peoplelist.exception.PeopleListException;
import com.alfarosoft.peoplelist.model.Store;
import com.alfarosoft.peoplelist.validation.AddressValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.alfarosoft.peoplelist.service.StoreService;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

@RestController
@RequestMapping(value = "/services/stores")
public class StoreController {
    private final StoreService storeService;
    private final AddressValidation addressValidation;

    @Autowired
    public StoreController(StoreService storeService, AddressValidation addressValidation) {
        this.storeService = storeService;
        this.addressValidation = addressValidation;
    }

    @PostMapping(value = "/add", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Store> addStore(@RequestBody Store store){
        addressValidation.validateAddress(store.getAddress());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(storeService.addStore(store));
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Store>> searchStores(){
        return ResponseEntity.status(HttpStatus.OK).body(storeService.getStores());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Store> lookupStore (@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(storeService.getStore(id));
    }

    @PutMapping(value = "/update/{id}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Store> updateStore (@PathVariable String id, @RequestBody Store store){
        return ResponseEntity.status(HttpStatus.OK).body(storeService.updateStore(id, store));
    }

    @DeleteMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteStore(@PathVariable String id){
        storeService.removeStore(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Store successfully removed");
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
