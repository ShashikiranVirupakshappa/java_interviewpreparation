package flowcontrol;

public class BreakTest {
    public static void main(String[] args) {
        /*int x = 10;
        if(x == 10)
            break;

        l1: for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i==j)
                    continue l1;
                System.out.println(i+" ... "+j);
            }
        }*/

        int x = 0;

        do {
            ++x;
            if (x < 2) continue;
            System.out.println(x);
            x++;
        } while (x++ < 10);
    }
}

