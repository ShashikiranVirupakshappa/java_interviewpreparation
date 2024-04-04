package singletoncheck;

import java.io.*;
import java.util.Arrays;

public class BreakSIngletonUsingSerialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {

        Singleton demo1 =Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("F:/serial.ser"));
        out.writeObject(demo1);
        Singleton demo2 =null;
        ObjectInput in = new ObjectInputStream(new FileInputStream("F:/serial.ser"));

        demo2 = (Singleton)in.readObject();

        System.out.println("Hascode demo1 : " +demo1);
        System.out.println("Hascode demo2 : " +demo2);
        System.out.println("Hascode demo1 : " +demo1.hashCode());
        System.out.println("Hascode demo2 : " +demo2.hashCode());


        System.out.println(demo1);
        System.out.println(demo2);

        Arrays.stream(demo2.getClass().getDeclaredFields()).forEach(System.out::println);
        Singleton demo1Clone = (Singleton)demo1.clone();
        System.out.println(demo1Clone.hashCode());
        System.out.println(demo1.hashCode());
    }
}