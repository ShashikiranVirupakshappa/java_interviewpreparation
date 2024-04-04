package org.example;

class Parent {
    static {
        System.out.println("Parent static block");              //2
    }

    {
        System.out.println("Parent IIB");                       //4
    }

    public Parent() {
        System.out.println("Parent constructor");               //5
    }
}


class Child extends Parent {
    static {
        System.out.println("Child static block");               //3
    }

    {
        System.out.println("Child IIB");                        //6
    }

    public Child() {
        System.out.println("Child constructor");                //7
    }
}

public class Test10 {
    public static void main(String[] args) {
        System.out.println("main started");                     //1
        Parent parent = new Child();
        System.out.println("main ends");                        //8
    }
}