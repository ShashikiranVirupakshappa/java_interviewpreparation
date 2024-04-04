package java8collectorscoding;

import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        //List<Integer> integers1 = List.of(4,2,7,1,3,5,9,6,10,8,6,11,9,1,4,7);
        List<Integer> integers1 = List.of(111, 222, 333, 111, 555, 333, 777, 222);
        System.out.println(integers1.stream().filter(integer -> integers1.indexOf(integer)!=integers1.lastIndexOf(integer)).collect(Collectors.toSet()));

    }
}
