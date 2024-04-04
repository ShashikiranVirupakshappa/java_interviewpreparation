package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(6);             //auto boxing 6 will internally converted to Integer
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(1);

        byte b = 10;

        double d = b;

        System.out.println(d);


        double d1 = 110.0;

        byte b1 = (byte)d1;

        System.out.println(b1);


        String s = "shashi";

        Object o = s;

        System.out.println(o);

        String s1 = "shashi";

        Object o1 = s;

        String s2 = (String) o1;

        System.out.println(s2);

        Integer i =10; // internally 10 will be converted to Integer Object through autoboxing

        int i1 = i;     // internally Integer reference i will be converted to int primitive through autounboxing


        NavigableSet<Integer> integerNavigableSet = treeSet.descendingSet();
        System.out.println(integerNavigableSet);
        for(Iterator<Integer>  it=treeSet.descendingIterator();it.hasNext();) {
            System.out.println(it.next());
        }

    }
}
