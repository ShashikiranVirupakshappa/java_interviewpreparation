package concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnWriteArrayListExampleRunnable  implements Runnable {

    private CopyOnWriteArrayList<String> copyOnWriteArrayList;
    private List<String> list ;

    public CopyOnWriteArrayListExampleRunnable(CopyOnWriteArrayList copyOnWriteArrayList, List<String> list) {
        this.copyOnWriteArrayList  = copyOnWriteArrayList;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        copyOnWriteArrayList.add("L");
        list.add("I");
    }
}

public class CopyOnWriteArrayListExample2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();

        copyOnWriteArrayList.add("A");
        copyOnWriteArrayList.add("B");
        copyOnWriteArrayList.add("C");
        copyOnWriteArrayList.add("D");
        copyOnWriteArrayList.add("E");
        copyOnWriteArrayList.add("F");
        copyOnWriteArrayList.add("G");
        copyOnWriteArrayList.add("H");

        List<String> subList = copyOnWriteArrayList.subList(0, 6);
        Thread copyOnWriteArrayListExampleRunnable = new Thread(new CopyOnWriteArrayListExampleRunnable(copyOnWriteArrayList, subList));
        copyOnWriteArrayListExampleRunnable.start();
        Iterator itr = subList.iterator();

        while (itr.hasNext()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(itr.next());
        }
    }
}