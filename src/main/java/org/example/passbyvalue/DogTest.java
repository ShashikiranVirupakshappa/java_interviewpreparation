package org.example.passbyvalue;

class Dog {

    private String color;
    private String name;

    public Dog() {
    }

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog foo(Dog d) {
        System.out.println("inside foo method d hashcode "+d.hashCode());
        //d = new Dog();  //you are new Dog object here --- White and Whitey is lost here but in main method it is still alive
        //System.out.println("new object created in above line "+d.hashCode());
        d.color = "Black";
        d.name = "Blacky";
        return d;           //d is now Black and Blacky
    }

    public Dog bar(Dog d) {
        System.out.println("inside bar method d hashcode "+d.hashCode());       // this will print the same hashcode as main
        d = new Dog();  //you are new Dog object here --- White and Whitey is lost here but in main method it is still alive
        System.out.println("new object created in above line so hashcode will be changed here "+d.hashCode());
        d.color = "Black";
        d.name = "Blacky";
        return d;
    }

    public void bar1(Dog d) {
        System.out.println("inside bar method d hashcode "+d.hashCode());       // this will print the same hashcode as main
        d = new Dog();  //you are new Dog object here --- White and Whitey is lost here but in main method it is still alive
        System.out.println("new object created in above line so hashcode will be changed here "+d.hashCode());
        d.color = "Black";
        d.name = "Blacky";
        System.out.println(d.getColor() +" "+d.getName());
    }

    public void bar2(Dog d) {
        System.out.println("inside bar method d hashcode "+d.hashCode());       // this will print the same hashcode as main
        //d = new Dog();  //you are new Dog object here --- White and Whitey is lost here but in main method it is still alive
        System.out.println("new object created in above line so hashcode will be changed here "+d.hashCode());
        d.color = "Black";
        d.name = "Blacky";
        System.out.println(d.getColor() +" "+d.getName());
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog("White", "Whitey");
        System.out.println(d.getColor() +" "+d.getName());        //White and Whitey
        System.out.println(d.hashCode());
        Dog d1 = d.foo(d);  //d is still White and Whitey always in the parameter
        System.out.println("d1 ===> "+d1.hashCode());
        System.out.println(d == d1);
        System.out.println(d.getColor() +" "+d.getName());        //Black and Blacky - if and only if you are updating the dog object without creating new object using new keyword otherwise it will have attribute values
                                                                  // similar to passed in dog object to the foo method.
        System.out.println(d1.getColor() +" "+d1.getName());        //Black and Blacky
    }
}
