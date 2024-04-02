package java8collectorscoding;

public class AnonymousArrays {
    public static void main(String[] args) {
        sum(new int[]{10,20,30});
        product(new int[]{100,200,300});
        int[][] x = new int[][] {{10,20},{30,40,50}};
        int[][] y =  {{10,20},{30,40,50}};

    }

    private static void sum(int[] ints) {
        int sum = 0;

        for(int i : ints) {
            sum+=i;
        }
        System.out.println(sum);
    }

    private static void product(int[] ints) {
        int product = 1;

        for(int i : ints) {
            product*=i;
        }
        System.out.println(product);
    }


}
