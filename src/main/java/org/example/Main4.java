package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println(list.stream().mapToInt(value -> value).sum());

        System.out.println(list.stream().reduce(0, (integer, integer2) -> integer+integer2).intValue());
        System.out.println(list.stream().max((o1, o2) -> o1.compareTo(o2)).get());


        List<String> fruits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Cantaloupe");
        System.out.println(fruits.stream().collect(Collectors.groupingBy(s -> {
            if(s.startsWith("C"))
                return "C";
            return s;
        }, Collectors.counting())));

        System.out.println(fruits.stream().map(String::toUpperCase).collect(Collectors.toList()));

        System.out.println(list.stream().filter(integer -> integer%2==0).count());

        System.out.println(list.stream().mapToInt(Integer::intValue).sum()/list.size());

        System.out.println(fruits.stream().collect(Collectors.joining(",")));

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,2,3);
        System.out.println(list2.stream().distinct().collect(Collectors.toList()));


        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );

        people.sort((o1, o2) -> o1.getAge()<o2.getAge()?-1:o1.getAge()>o2.getAge()?1:0);
        System.out.println(people);

        people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );

        System.out.println(people.stream().sorted((o1, o2) -> o1.getAge()<o2.getAge()?-1:o1.getAge()>o2.getAge()?1:0).collect(Collectors.toList()));


    }
}
