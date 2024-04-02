package java8collectorscoding;

import java.util.*;

public class SortMapByValuesWithoutJava8 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abcd",4);
        map.put("ab",2);
        map.put("a",1);
        map.put("abcdef",6);
        map.put("pqrs",4);
        map.put("abcde",5);
        map.put("abc",3);

        List<Integer> tempList = new ArrayList<>(map.values());

        Collections.sort(tempList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(tempList);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Integer i : tempList) {
            for(Map.Entry<String, Integer> entry: map.entrySet()) {
                if(entry.getValue().equals(i)) {
                    if(!sortedMap.containsKey(entry.getKey())) {
                        sortedMap.put(entry.getKey(), i);
                        break;
                    }
                }
            }
        }
        System.out.println(sortedMap);
    }
}
