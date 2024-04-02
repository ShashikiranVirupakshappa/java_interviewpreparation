package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable("null");
        optionalString.ifPresent(System.out::println);
    }
}
