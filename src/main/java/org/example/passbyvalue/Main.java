package org.example.passbyvalue;

public class Main {
    // swap() doesn't swap i and j
    public static void swap(Integer i, Integer j)
    {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }
    public static void main(String[] args)
    {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);

        String s = new String("abc");
        System.out.println("before "+s);            //abc
        //display(s);                               ---- reason becoz, string is immutable, s remains with same value after display method executes
        displayString(s);                             //reassigning the return value to s will update value
        System.out.println("after "+s);             //abc
        StringBuffer sb = new StringBuffer("abc");
        System.out.println("sb before "+sb.toString());                         //abc
        displayStringBuffer(sb);
        System.out.println("sb after "+sb.toString());                          //abcxyz
        StringBuilder sbuilder = new StringBuilder("abc");
        System.out.println("sbuilder before "+sbuilder.toString());             //abc
        displayStringBuilder(sbuilder);
        System.out.println("sbuilder after "+sbuilder.toString());              //abcxyz
    }

    private static void displayString(String s) {
        s = "xyz";
    }

    private static void displayStringBuffer(StringBuffer sb) {
        sb.append("xyz");
    }

    private static void displayStringBuilder(StringBuilder sbuild) {
        sbuild.append("xyz");
    }


}
