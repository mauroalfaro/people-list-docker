package com.alfarosoft.peoplelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Customer {

    @JsonProperty("customerId")
    private String id = null;

    @JsonProperty("customerName")
    private String name = null;

    @JsonProperty("customerSurname")
    private String surname= null;

    @JsonProperty("loyaltyId")
    private String loyaltyId = null;

    @JsonProperty("customerAddress")
    private Address address = null;

    @JsonProperty("customerPhone")
    private String phone = null;

    @JsonProperty("customerEmail")
    private String email = null;

    public Customer() {
    }

    public Customer(String id, String name, String surname, String loyaltyId, Address address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.loyaltyId = loyaltyId;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLoyaltyId() {
        return loyaltyId;
    }

    public void setLoyaltyId(String loyaltyId) {
        this.loyaltyId = loyaltyId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(loyaltyId, customer.loyaltyId) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(phone, customer.phone) &&
                Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, loyaltyId, address, phone, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", loyaltyId='" + loyaltyId + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
