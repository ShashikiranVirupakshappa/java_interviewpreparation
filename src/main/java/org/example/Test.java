package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*List<Patient> patients = Arrays.asList(
                new Patient("P1",20, "Corona", 18000),
                new Patient("P2",26, "Fever", 6000),
                new Patient("P5",26, "Fever", 10000),
                new Patient("P4",29, "Corona", 8000),
                new Patient("P3",23, "Corona", 12000));

        patients.sort(Comparator.comparing(Patient::getAmount, Comparator.reverseOrder()));

        //patients.forEach(patient -> System.out.println(patient));
        System.out.println(patients.stream().collect(Collectors.filtering(patient -> patient.getAge()>25, Collectors.toList())));*/

        String s = "ilovejavatechie";


        int[][] nums = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(Arrays.stream(nums).collect(Collectors.flatMapping(ints -> Arrays.stream(ints).mapToObj(value -> Integer.valueOf(value)), Collectors.toList())));

        System.out.println(Arrays.stream(nums).flatMap(ints -> Arrays.stream(ints).boxed()).collect(Collectors.toList()));

        //append - after every character in a given string
        System.out.println(Arrays.stream(s.split("")).collect(Collectors.joining("-")));
        //convert all characters to uppercase in a given string during collect method
        System.out.println(Arrays.stream(s.split("")).collect(Collectors.mapping(s1 -> s1.toUpperCase(), Collectors.toList())));

        System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map.keySet().stream().filter(s1 -> map.get(s1).longValue()>1).collect(Collectors.toList()));

        LinkedHashMap<String, Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map1.keySet().stream().filter(s1 -> map1.get(s1).longValue()==1).findFirst().get());

        int[] numbers = {5,9,11,2,8,21,1};
        System.out.println(Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1));

        String[] strings = {"java","techie","springboot", "microservices"};

        System.out.println(Arrays.stream(strings).sorted((o1, o2) -> o1.length()>o2.length() ? -1: o1.length()<o2.length() ? 1: 0).findFirst().get());

        numbers = new int[] {5,9,11,2,8,21,1,29};
        System.out.println(Arrays.stream(numbers).mapToObj(value -> String.valueOf(value)).filter(s1 -> s1.startsWith("2")).collect(Collectors.toList()));

        int[] duplicates = {1,2,3,1,5,2,6,7,4,8,4,3,9,5};
        System.out.println("find the repeating characters in a given string");
        //find the repeating characters in a given string
        Map<Integer, Long> duplicatesMap = Arrays.stream(duplicates).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        duplicatesMap.forEach((integer, aLong) -> {
            if(duplicatesMap.get(integer).longValue()>1)
                System.out.println(integer);
        });

        /*int i=4;
        switch(i) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("nothing");
                break;
        }*/
    }
}
