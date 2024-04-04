package java8collectorscoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Coding {

    public static List<Student> studentList = Stream.of(
                    new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                    new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                    new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                    new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                    new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                    new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                    new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                    new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                    new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                    new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
            .collect(Collectors.toList());
    public static void main(String[] args) {
        // 1. Find the list of students whose rank is in between 50 and 100
        studentList.stream().filter(student -> student.getRank()>=50 && student.getRank()<=100).forEach(System.out::println);
        System.out.println("========================================================================");

        //2. Find the Students who stays in Karnataka and sort them by their names
        studentList.stream().filter(student -> student.getCity().equals("Karnataka")).sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);
        studentList.stream().filter(student -> student.getCity().equals("Karnataka")).sorted((o1, o2) -> -(o1.getFirstName().compareTo(o2.getFirstName()))).forEach(System.out::println);

        System.out.println("========================================================================");
        // 3. Find all departments names
        studentList.stream().map(student -> student.getDept()).distinct().forEach(System.out::println);

        System.out.println("========================================================================");
        //4.  Find all the contact numbers
        System.out.println(studentList.stream().map(student -> student.getContacts()).flatMap(strings -> strings.stream()).collect(Collectors.toList()));

        System.out.println("========================================================================");
        //5.  Group The Student By Department Names
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.mapping(Student::getFirstName, Collectors.toList()))));
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting())));
        System.out.println("========================================================================");

        //6. Find the department who is having maximum number of students
        Map<String, Long> stringLongMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));

        List<Map.Entry<String, Long>> list = new ArrayList<>(stringLongMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return (int)-(o1.getValue()-o2.getValue());
            }
        });
        System.out.println(list.get(0).getKey()+" "+list.get(0).getValue());

        System.out.println("========================================================================");
        //7. Find the average age of male and female students
        studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge))).forEach((s, aDouble) -> System.out.println(s + " "+ aDouble));


        System.out.println("========================================================================");
        //8. Find the highest rank in each department
        studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy((o1, o2) -> (o1.getRank()-o2.getRank())))).forEach((s, student) -> System.out.println(s + " "+student.get()));

        System.out.println("========================================================================");
        //9 .Find the student who has second rank
        System.out.println(studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get());

    }
}
