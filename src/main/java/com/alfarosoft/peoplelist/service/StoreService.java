package com.alfarosoft.peoplelist.service;

import com.alfarosoft.peoplelist.builders.StoreMockDataBuilder;
import com.alfarosoft.peoplelist.model.Store;

import java.util.List;

public class StoreService {
    private StoreMockDataBuilder storeMockDataBuilder;
    private List<Store> storeList;

    public StoreService() {
        this.storeMockDataBuilder = new StoreMockDataBuilder();
        storeList = storeMockDataBuilder.buildMockedData();
    }

    public Store getStore(String id){
        return new Store();
    }

    public List<Store> getStores() {
        return storeList;
    }

    public Store addStore (Store store){
       storeList.add(store);
       return store;
    }

    public Store updateStore (String id, Store store){
        return store;
    }

    public void removeStore (String id){
        //Not implemented
    }
}
