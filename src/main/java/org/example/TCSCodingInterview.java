package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TCSCodingInterview {
    public static void main(String[] args) {
        String s = "Eelcome to java";
        int index = new Scanner(System.in).nextInt();
        char ch = new Scanner(System.in).next().charAt(0);
        StringBuffer sb = new StringBuffer(s);
        sb.setCharAt(index, ch);
        System.out.println(sb.toString());


        String[] strings = {"AA", "ZZ", "CC", "FF"};


        System.out.println(Arrays.stream(strings).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
