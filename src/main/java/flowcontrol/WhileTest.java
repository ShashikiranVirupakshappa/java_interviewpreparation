package flowcontrol;

public class WhileTest {
    public static void main(String[] args) {
        int a =10, b = 20;
        while(a>b) {
            System.out.println("Hello");
        }
        System.out.println("hi");
        for(int i=0;i<10;i++);

        /*for(int i=0;true;i++) {
            System.out.println("Hello");
        }                                                               ////infinite loop becoz, of test condition always true*/

       /* for(int i=0;i<10;i++)
            int x = 10;             //invalid, declaration should not be the only statement in the for loop*/

        for(int i=0;i<10;i++) {
            int x = 10;
        }

        for(int i=0,j=20;i<10;i++) {
            System.out.println(i+j);
        }
        int i=0;
        for(System.out.println("hello boss");i<3;i++) {
            System.out.println("no boss");
        }

        /*for(int j=0;returnBoolean();j++) {

        }                       //infinite loop becoz, returnBoolean() method is always returns true*/
        /*int k=0;
        for(System.out.println("hello");k<3; System.out.println("hi") ) {
            System.out.println("k value now "+k);
        }                                                                                                                       ////infinite loop*/

        int l=0;
        for(System.out.println("hello");l<3; System.out.println("hi")) {
            l++;
        }                                   //hello, hi, hi, hi


        /*int m=0;
        for(System.out.println("shashi");returnBoolean();incrementVariable(m)){
            
        }           //valid but infinite loop becoz, returnBoolean will always return true*/

        int n=0;
        for(System.out.println("shashi");n<5;n=incrementVariable(n)){
            System.out.println("raj");
        }

        /*for(;;);        //infinite loop*/

        /*for(; ;) {
            System.out.println("hello");
        }               //infinite loop*/


    }

    private static int incrementVariable(int m) {
        return ++m;
    }

    public static boolean returnBoolean() {
        return true;
    }


}
