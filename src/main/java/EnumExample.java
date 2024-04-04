import java.util.ArrayList;
import java.util.List;

enum DayOfTheWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

public class EnumExample {


    public static void main(String[] args) {
        System.out.println(DayOfTheWeek.SUNDAY.ordinal());
        System.out.println(DayOfTheWeek.MONDAY.ordinal());
        System.out.println(DayOfTheWeek.TUESDAY.ordinal());
        System.out.println(DayOfTheWeek.WEDNESDAY.ordinal());
        System.out.println(DayOfTheWeek.THURSDAY.ordinal());
        System.out.println(DayOfTheWeek.FRIDAY.ordinal());
        System.out.println(DayOfTheWeek.SATURDAY.ordinal());

        System.out.println(DayOfTheWeek.SUNDAY.name());
        System.out.println(DayOfTheWeek.MONDAY.name());
        System.out.println(DayOfTheWeek.TUESDAY.name());
        System.out.println(DayOfTheWeek.WEDNESDAY.name());
        System.out.println(DayOfTheWeek.THURSDAY.name());
        System.out.println(DayOfTheWeek.FRIDAY.name());
        System.out.println(DayOfTheWeek.SATURDAY.name());


        for (DayOfTheWeek s : DayOfTheWeek.values()) {
            System.out.println(s);
        }
        //System.out.println(getStrings());
    }

    public static List<String> getStrings() {
        var list = new ArrayList<String>();
        list.add("shashi");
        list.add("raj");
        return list;
    }
}
