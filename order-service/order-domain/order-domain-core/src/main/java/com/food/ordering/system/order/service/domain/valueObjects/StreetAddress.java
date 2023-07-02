package com.food.ordering.system.order.service.domain.valueObjects;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {
    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;
    private final Integer number;

    public StreetAddress(UUID id, String street, String postalCode, String city, Integer number) {
        this.id = id;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return Objects.equals(street, that.street) && Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postalCode, city, number);
    }
}
