package org.example;

interface MyInterface1 {
    default void display() {
        int i = 100;
        System.out.println("this is MyInterface1 default method " + i);
    }
}

interface MyInterface2 {
    default void display() {
        int i = 200;
        System.out.println("this is MyInterface2 default method " + i);
    }
}

class MyClass {
    public void display() {
        System.out.println("this is base class display method");
    }
}

public class DiamondProblemTest extends MyClass implements MyInterface1, MyInterface2 {

    DiamondProblemTest() {
        super();
    }

    public static void main(String[] args) {
        MyClass myClass = new DiamondProblemTest();
        myClass.display();
        DiamondProblemTest dpt = new DiamondProblemTest();
        dpt.print();
        dpt.display();
        MyInterface1 myInterface1 = new DiamondProblemTest();
        System.out.println("--------------------------------------------------");
        myInterface1.display();


    }

    public void print() {
        System.out.println("this is display method");
        MyInterface1.super.display();
        MyInterface2.super.display();
    }

    @Override
    public void display() {
        MyInterface1.super.display();
        MyInterface2.super.display();
    }


}
