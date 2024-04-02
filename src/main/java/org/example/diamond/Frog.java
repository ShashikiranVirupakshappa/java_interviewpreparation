package org.example.diamond;

public class Frog implements AcquaticAnimal, TerrestrialAnimal {

    @Override
    public void specialities() {
        System.out.println("frogs hops from place to place");
    }

    @Override
    public void livesIn() {
        AcquaticAnimal.super.livesIn();
        TerrestrialAnimal.super.livesIn();
    }

    /*public void describeFrog() {
        AcquaticAnimal.super.livesIn();
        TerrestrialAnimal.super.livesIn();
        specialities();
    }*/

    public static void main(String[] args) {
        Frog frog = new Frog();
        //frog.describeFrog();
        frog.livesIn();
        frog.specialities();
    }
}
