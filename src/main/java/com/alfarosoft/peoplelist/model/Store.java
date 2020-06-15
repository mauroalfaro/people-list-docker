package com.alfarosoft.peoplelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Store {

    @JsonProperty("storeId")
    private String id = null;

    @JsonProperty("storeName")
    private String storeName = null;

    @JsonProperty("storeAddress")
    private Address address = null;

    public Store(String id, String storeName, Address addresss) {
        this.id = id;
        this.storeName = storeName;
        this.address = address;
    }

    public Store() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(address, store.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeName, address);
    }

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", storeName='" + storeName + '\'' +
                ", address=" + address +
                '}';
    }
}
