package com.alfarosoft.peoplelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Address {

    @JsonProperty("street")
    private String street = null;

    @JsonProperty("number")
    private Integer number = null;

    @JsonProperty("floor")
    private String floor = null;

    @JsonProperty("apartment")
    private String apartment = null;

    @JsonProperty("postalCode")
    private String postalCode = null;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    public Address(String street, Integer number, String floor, String apartment, String postalCode, String city, String state) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.apartment = apartment;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(number, address.number) &&
                Objects.equals(floor, address.floor) &&
                Objects.equals(apartment, address.apartment) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(city, address.city) &&
                Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, floor, apartment, postalCode, city, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", floor='" + floor + '\'' +
                ", apartment='" + apartment + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
