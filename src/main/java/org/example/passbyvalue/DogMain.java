package org.example.passbyvalue;

public class DogMain {
    public static void main(String[] args) {
        /*Dog d = new Dog("White", "Whitey");
        System.out.println(d.getColor() +" "+d.getName());        //White and Whitey
        System.out.println(d.hashCode());                          //some hashcode value
        Dog d1 = d.foo(d);  //d is still White and Whitey always in the parameter
        System.out.println("d1 ===> "+d1.hashCode());               //same hashcode as d -- no new object is created inside foo object.
        System.out.println(d == d1);                                //true
        System.out.println(d.getColor() +" "+d.getName());        //Black and Blacky
        // if and only if you are updating the dog object without creating new object using new keyword otherwise it will have attribute values
        // similar to passed in dog object to the foo method. so in this case foo will not create any new object so it will send the updated values so you are working on d object itself internally
        System.out.println(d1.getColor() +" "+d1.getName());        //Black and Blacky*/
        /*Dog d = new Dog("White", "Whitey");
        System.out.println(d.getColor() + " " + d.getName());        //White and Whitey
        System.out.println(d.hashCode());                          //some hashcode value
        Dog d1 = d.bar(d);  //d is still White and Whitey always in the parameter
        System.out.println("d1 ===> " + d1.hashCode());               //different hashcode -- new object is created inside bar method
        System.out.println(d == d1);                                //false
        System.out.println(d.getColor() + " " + d.getName());        //White and Whitey
        // if and only if you are updating the dog object without creating new object using new keyword otherwise it will have attribute values
        // similar to passed in dog object to the foo method. so in this case bar will create new object and d object value will be same as what is being set in main method
        System.out.println(d1.getColor() + " " + d1.getName());        //Black and Blacky*/
        /*Dog d = new Dog("White", "Whitey");
        System.out.println(d.getColor() + " " + d.getName());        //White and Whitey
        System.out.println(d.hashCode());                          //some hashcode value
        d.bar1(d);  //d is still White and Whitey always in the parameter
        //System.out.println("d1 ===> " + d1.hashCode());               //different hashcode -- new object is created inside bar method
        //System.out.println(d == d1);                                //false
        System.out.println(d.getColor() + " " + d.getName());        //White and Whitey
        // if and only if you are updating the dog object without creating new object using new keyword otherwise it will have attribute values
        // similar to passed in dog object to the foo method. so in this case bar will create new object and d object value will be same as what is being set in main method
        //System.out.println(d1.getColor() + " " + d1.getName());        //Black and Blacky*/

        Dog d = new Dog("White", "Whitey");
        System.out.println(d.getColor() + " " + d.getName());        //White and Whitey
        System.out.println(d.hashCode());                          //some hashcode value
        d.bar2(d);  //d is still White and Whitey always in the parameter
        //System.out.println("d1 ===> " + d1.hashCode());               //different hashcode -- new object is created inside bar method
        //System.out.println(d == d1);                                //false
        System.out.println(d.getColor() + " " + d.getName());        //Black and Blacky
        // if and only if you are updating the dog object without creating new object using new keyword otherwise it will have attribute values
        // similar to passed in dog object to the foo method. so in this case bar will create new object and d object value will be same as what is being set in main method
        //System.out.println(d1.getColor() + " " + d1.getName());        //Black and Blacky

    }
}
