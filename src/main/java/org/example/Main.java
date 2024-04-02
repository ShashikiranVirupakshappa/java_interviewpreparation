package org.example;

public class Main {
    public static void main(String[] args) {

        //java 7 support for only integers
        int value = 5;
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Unknown");
        }

        //java 8 support for string and enums --- string example below
        String s = "MONDAY";
        switch (s) {
            case "MONDAY":
                System.out.println("MONDAY");
                break;
            case "TUESDAY":
                System.out.println("TUESDAY");
                break;
            case "WEDNESDAY":
                System.out.println("WEDNESDAY");
                break;
            case "THURSDAY":
                System.out.println("THURSDAY");
                break;
            case "FRIDAY":
                System.out.println("FRIDAY");
                break;
            case "SATURDAY":
                System.out.println("SATURDAY");
                break;
            case "SUNDAY":
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("UNKNOWN");
        }


        //java 8 support for enums --- enums example below
        enum DAYS {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        DAYS days = DAYS.SUNDAY;
        //DAYS days = null;


        //multiple case labels in java 12 and 13 versions as preview
        switch (days) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Weekday");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
            default -> System.out.println("Unknown");
            case null -> System.out.println("null value passed");
        }


        //switch returns value aka switch expressions

        String str = switch (days) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Unknown";
            case null -> "null value passed";
        };
        System.out.println(str);

        //or

        System.out.println(switch (days) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Unknown";
            case null -> "null value passed";});
    }
}