package org.example.diamond;

public interface AcquaticAnimal extends Animal {
     default void livesIn() {
         System.out.println("lives in water");
     }
}
