package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

//JPA의 내장타입이라는거기 떄문에
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
