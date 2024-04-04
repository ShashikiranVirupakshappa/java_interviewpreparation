package java8collectorscoding;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("shashi");
        list1.add("raj");

        List<String> list2 = new ArrayList<>();
        list2.add("shashi");
        list2.add("raj");

        System.out.println(list1==list2); //false
        System.out.println(list1.equals(list2)); //true         //equals method in collection interface is overriden to do content checking rather than reference checking
    }
}
