package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("A");
        copyOnWriteArrayList.add("B");
        copyOnWriteArrayList.add("C");

        Iterator<String> itr = copyOnWriteArrayList.iterator();

        copyOnWriteArrayList.add("D");

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //A,B,C
    }
}
