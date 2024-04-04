package org.example;

class Parent1 {
    static {
        System.out.println("Parent static block");              //1
    }

    {
        System.out.println("Parent IIB");                       //4
    }

    public Parent1() {
        System.out.println("Parent constructor");               //5
    }
}


class Child1 extends Parent1 {
    static {
        System.out.println("Child static block");               //2
    }

    {
        System.out.println("Child IIB");                        //6
    }

    public Child1() {
        System.out.println("Child constructor");                //7
    }

    public static void main(String[] args) {
        System.out.println("main started");                     //3
        Parent1 parent1 = new Child1();
        System.out.println("main ends");                        //8
    }
}