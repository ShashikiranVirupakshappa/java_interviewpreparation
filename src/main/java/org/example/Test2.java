package org.example;

import java.sql.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        test(null);
        Integer[] array = {1,2,3,4,5};
        System.out.println(Arrays.stream(array).reduce(1, (integer, integer2) -> integer*integer2).intValue());

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        System.out.println(myList.stream().filter(integer -> integer%2==0).collect(Collectors.toList()));

        System.out.println(myList.stream().filter(integer -> Integer.valueOf(integer).toString().startsWith("1")).collect(Collectors.toList()));
        System.out.println(myList.stream().count());
        System.out.println(myList.stream().max((o1, o2) -> o1.compareTo(o2)).stream().findFirst().get());
        System.out.println(myList.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList()));
        String s = "shashik";

        /*Map<String, String> hm = new HashMap<>();
        hm.put(null,null);
        hm.put(null,"1");*/

        /*Map<String, String> hm = new ConcurrentHashMap<>();
        hm.values().stream().sorted(Comparator.comparing(Function.identity()));
        hm.put(null,null);
        hm.put(null,"1");

        System.out.println(hm);*/
        Supplier<String> stringSupplier = () -> s;
        System.out.println(stringSupplier.get());

        myList.stream().forEach(integer -> System.out.println(Thread.currentThread().getName()));
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = List.of(1,2,3,4,5);
        //list1.add(6);

        System.out.println(list.stream().map(integer -> integer*integer).filter(integer -> integer>10).collect(Collectors.averagingDouble(value -> value)));

        /*List<String> list = new ArrayList<String>();
        list.add("Atto");
        list.add("Rick");
        list.add("Shalini");
        List<String> immuList = Collections.unmodifiableList(list);
        System.out.println(immuList);
        list.add("Raj");
        System.out.println(immuList);
        immuList.add("Shashi");*/

        Arrays.stream(s.split("")).collect(Collectors.collectingAndThen(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()),
                stringLongLinkedHashMap1 -> {
                    stringLongLinkedHashMap1.keySet().stream().filter(s1 -> stringLongLinkedHashMap1.get(s1).longValue() == 1).skip(1).forEach(System.out::println);
                    return null;
                }));

        LinkedHashMap<String, Long> longLinkedHashMap = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        longLinkedHashMap.keySet().stream().filter(s1 -> longLinkedHashMap.get(s1).longValue() == 1).skip(1).forEach(System.out::println);

        //stringLongLinkedHashMap.keySet().stream().filter(s1 -> stringLongLinkedHashMap.get(s1).longValue()==1).skip(1).forEach(System.out::println);

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","aug","Sep","Oct","nov","Dec"};

        System.out.println(Arrays.stream(months).sorted().collect(Collectors.toList()));

        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("2");

        Map<String, String> stringLongHashMap = l.stream().collect(Collectors.toMap(s1 -> s1, s1 -> s1, (oldValue, newValue) -> oldValue));
        System.out.println(stringLongHashMap);

        Map<String, Integer> iterateMap = new HashMap<>();
        iterateMap.put("1", 1);
        iterateMap.put("2", 2);
        iterateMap.put("3", 3);
        iterateMap.put("4", 4);

        iterateMap.forEach((s1, integer) -> System.out.println(s1+" "+integer));



    }

    public static void test(Object o) {
        System.out.println("object");
    }

    public static void test(String s) {
        System.out.println("string");
    }


}
