public class ComparableDemo {
    public static void main(String[] args) {
        Comparable<Integer> comparable = (o -> o < 10 ? -1: o ==10 ? 0 : 1);
        System.out.println(comparable.compareTo(20));
    }
}
