package com.malaka96.ecom_application.user.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;

}
