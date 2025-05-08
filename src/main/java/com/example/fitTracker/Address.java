package com.example.fitTracker;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}
