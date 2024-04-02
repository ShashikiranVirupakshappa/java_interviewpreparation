package concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class ModifySynchronizedMap implements Runnable {

    Map<String, Integer> map;

    public ModifySynchronizedMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        map.put("child", 1);
    }
}

public class SynchrnizedMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("main0", 0);
        map.put("main2", 2);
        map.put("main3", 3);
        map.put("main4", 4);
        map.put("main5", 5);
        map.put("main6", 6);

        map = Collections.synchronizedMap(map);

        Thread thread1 = new Thread(new ModifySynchronizedMap(map));
        Thread thread2 = new Thread(new ModifySynchronizedMap(map));
        Thread thread3 = new Thread(new ModifySynchronizedMap(map));

        thread1.start();
        thread2.start();
        thread3.start();

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
