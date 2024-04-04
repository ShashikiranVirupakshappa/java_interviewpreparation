package flowcontrol;

import java.util.*;

public class ForLoopTest {
    public static void main(String[] args) {
        /*for(int i=0;true;i++) {
            System.out.println("hello");
        }
        System.out.println("hi");   //CE:unreachable statement*/

        /*for(int i=0;false;i++) {            //CE:loop body unreachable at this line due to false test condition
            System.out.println("hello");
        }
        System.out.println("hi");*/

        /*for(int i=0;;i++) {
            System.out.println("hello");
        }
        System.out.println("hi");       //CE: unreachable statement due to always true test condition in for loop construct*/
        int a=10,b=20;
        /*int a=10,b=20;
        for(int i=0;a<b;i++) {
            System.out.println("hello");
        }
        System.out.println("hi");               //valid but infinite loop since a and b are not changing their values anywhere*/

        a=10;
        b=20;
        for(int i=0;a>b;i++) {
            System.out.println("hello");
        }
        System.out.println("hi");           //valid output hi

        /*final int x = 10,y=20;
        for(int i=0;x<y;i++) {
            System.out.println("hello");
        }
        System.out.println("hi");        //CE: unreachable statement due to always true test condition in for loop construct*/

        /*final int x = 10,y=20;
        for(int i=0;x>y;i++) {          //CE:loop body unreachable at this line due to false test condition
            System.out.println("hello");
        }
        System.out.println("hi");       */
        for(int i1 : Arrays.stream(new int[] {10,20,30}).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray()) {
            System.out.println(i1);
        }

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            Integer i1 = it.next();


        }

    }
}
