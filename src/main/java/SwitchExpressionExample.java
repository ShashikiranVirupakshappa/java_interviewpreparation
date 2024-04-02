import java8collectorscoding.Java8Coding;
import java8collectorscoding.Student;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int me = 4;
        String operation = "doubleMe";

        Object obj = new Student();
        int result = 0;
        switch (operation) {
            case "doubleMe" -> {
                System.out.println("inside doubleme");
                result = me * 2;
            }
            case "squareMe" ->  {
                System.out.println("inside squareme");
                result = me * me;
            }
            default -> {
                System.out.println("inside default");
                result = me;
            }
        };
        System.out.println(result);
        String res = null;
        res = switch(obj) {
            case  String s -> "this is string type";
            case  Student student -> "this is student type";
            case Object o -> "this is object type";
        };
        System.out.println(res);
    }
}
























/*


    var a = "shashi";

    var student = new Student();
        System.out.println(a instanceof String);
                System.out.println(a instanceof Object);
                System.out.println(student instanceof Student);
                System.out.println(student instanceof Object);

                student = Java8Coding.studentList.get(0);
                System.out.println(student.getAge()+"\t"+student.getFirstName());*/
