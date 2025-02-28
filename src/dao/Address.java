package dao;

import java.util.Objects;

public class Address {
    private String firstLine;
    private String secondLine;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    public Address(String firstLine, String secondLine, String zipCode, String city, String state, String country) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address(String firstLine,String zipCode, String city, String state, String country) {
        this.zipCode = zipCode;
        this.firstLine = firstLine;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(firstLine, address.firstLine) && Objects.equals(secondLine, address.secondLine) && Objects.equals(zipCode, address.zipCode) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLine, secondLine, zipCode, city, state, country);
    }
}
