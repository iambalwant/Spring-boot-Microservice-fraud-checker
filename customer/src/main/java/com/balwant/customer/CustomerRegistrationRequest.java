package com.balwant.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastName,
        String email
) {

}
