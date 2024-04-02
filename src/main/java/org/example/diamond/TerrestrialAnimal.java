package org.example.diamond;

public interface TerrestrialAnimal extends Animal {
    default void livesIn() {
        System.out.println("lives in land");
    }
}
