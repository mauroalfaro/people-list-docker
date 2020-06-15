package com.alfarosoft.peoplelist.builders;

import com.alfarosoft.peoplelist.model.Address;
import com.alfarosoft.peoplelist.model.Store;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class StoreMockDataBuilder {
    List<Store> storeMocks;

    private Logger log = LoggerFactory.getLogger(StoreMockDataBuilder.class);

    public StoreMockDataBuilder() {
        this.storeMocks = new ArrayList<>();
    }

    public List<Store> buildMockedData(){
        log.info("Stores are being mocked");
        Store firstStore = new Store();
        Store secondStore = new Store();

        firstStore.setId("store001");
        firstStore.setStoreName("Shake Shack - Florida Mall");

        secondStore.setId("store002");
        secondStore.setStoreName("Chick-fil-A - Florida Mall");

        Address firstAddress = new Address();
        Address secondAddress = new Address();

        firstAddress.setStreet("First Street");
        firstAddress.setNumber(145);
        firstAddress.setCity("Tampa");
        firstAddress.setState("Florida");
        firstAddress.setPostalCode("FL190800");
        firstStore.setAddress(firstAddress);

        secondAddress.setStreet("Second Street");
        secondAddress.setNumber(175);
        secondAddress.setCity("Jacksonville");
        secondAddress.setState("Florida");
        secondAddress.setPostalCode("FL191811");
        secondStore.setAddress(secondAddress);

        storeMocks.add(firstStore);
        storeMocks.add(secondStore);

        log.info("Stores successfully mocked");
        return storeMocks;
    }
}
