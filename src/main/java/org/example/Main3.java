package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        //List<Integer> numbers1 = List.of(100, 500, 50, 10000, 5000, 25000, 20000, 50000, 40000, 75000, 60000, 100000);
        //List<Integer> numbers2 = List.of(1000, 1300, 1500, 1600, 1200, 1700, 1400);

        Map<String, Integer> employeeSalaryMap = new HashMap<>();

        employeeSalaryMap.put("anil", 1000);
        employeeSalaryMap.put("bhavna", 1300);
        employeeSalaryMap.put("micael", 1500);
        employeeSalaryMap.put("tom", 1600);
        employeeSalaryMap.put("ankit", 1200);
        employeeSalaryMap.put("daniel", 1700);
        employeeSalaryMap.put("james", 1400);


        Map<String, Integer> employeeSalaryMap2 = new HashMap<>();

        employeeSalaryMap2.put("anil", 1000);
        employeeSalaryMap2.put("bhavna", 1200);
        employeeSalaryMap2.put("micael", 1000);
        employeeSalaryMap2.put("tom", 1300);
        employeeSalaryMap2.put("ankit", 1200);
        employeeSalaryMap2.put("daniel", 1300);
        employeeSalaryMap2.put("james", 1200);
        //find nth highest value from a given array

        int n = new Scanner(System.in).nextInt();

        //System.out.println(numbers1.stream().sorted((o1, o2) -> -o1.compareTo(o2)).limit(n).collect(Collectors.toList()).get(n-1));

        List<Integer> mapValues = employeeSalaryMap.values().stream().collect(Collectors.toList());
        System.out.println(mapValues.stream().sorted((o1, o2) -> -o1.compareTo(o2)).limit(n).collect(Collectors.toList()).get(n-1));

        getNthHighestSalary(n, employeeSalaryMap2);


    }

    private static void getNthHighestSalary(int n, Map<String, Integer> employeeSalaryMap2) {
        //LinkedHashMap<Integer, List<String>> collect = employeeSalaryMap2.entrySet().stream()
//                .collect(Collectors.groupingBy(o -> o.getValue(), LinkedHashMap::new, Collectors.mapping(o -> o.getKey(), Collectors.toList())));
        Map<Integer, List<Map.Entry<String, Integer>>> collect = employeeSalaryMap2.entrySet().stream().collect(Collectors.groupingBy(o -> o.getValue()));
        System.out.println(collect);
        System.out.println(collect.entrySet().stream().sorted((o1, o2) -> -o1.getKey().compareTo(o2.getKey())).collect(Collectors.toList()).get(n-1));
        //System.out.println(collect.entrySet().stream().limit(n).collect(Collectors.toList()).get(n-1));
    }
}
