package flowcontrol;

public class OldSwitchTest {
    public static void main(String[] args) {
        String animal = "CAT";

        //********* case1:old switch version without clubbing or merging multiple cases ****************
        switch(animal) {
            case "DOG": System.out.println("domestic animal");
                                break;
            case "CAT": System.out.println("domestic animal");
                                break;
            case "TIGER": System.out.println("wild animal");
                                break;
            case "LION": System.out.println("wild animal");
                                break;
            default: System.out.println("unknown animal");
                        break;
        }

        //********* case2:old switch version but clubbing or merging with multiple cases ****************
        switch(animal) {
            case "DOG":
            case "CAT":
                System.out.println("domestic animal");
                break;
            case "TIGER":
            case "LION":
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }

        //case3: advanced switch by clubbing multiple cases under one case but there is no return statement but advanced compared to case1 above
        switch(animal) {
            case "DOG", "CAT" -> System.out.println("domestic animal");
            case "TIGER", "LION" -> System.out.println("wild animal");
            default -> System.out.println("unknown animal");
        }

        //case4: advanced switch by clubbing multiple cases under one case and also return statement, more advanced than above 3 cases

        var result = switch(animal) {
            case "DOG", "CAT" -> "domestic animal";
            case "TIGER", "LION" -> "wild animal";
            default -> "unknown animal";
        };
        System.out.println(result);

        //case5: if you want execute some statements

        switch(animal) {
            case "DOG", "CAT" -> {
                System.out.println("hi dog and cat");
                //yield "domestic animal";
            }
            case "TIGER", "LION" -> {
                System.out.println("hello tiger and lion");
                //yield "wild animal";
            }
            default -> {
                System.out.println("hmm i don't know who are you");
                //yield "unknown animal";
            }
        };

        //case6: before to return something, we will execute some statements and atlast return -- remember that yield is return statement here  and not to use return keyword

        var result1 = switch(animal) {
            case "DOG", "CAT" -> {
                System.out.println("hi dog and cat");
                yield "domestic animal";
            }
            case "TIGER", "LION" -> {
                System.out.println("hello tiger and lion");
                yield "wild animal";
            }
            default -> {
                System.out.println("hmm i don't know who are you");
                yield "unknown animal";
            }
        };
        System.out.println(result1);

        String month = "JUNE";
        var result2 = switch (month) {
            case "JANUARY", "JUNE", "JULY" ->  3;
            default -> 0;
        };


        int x = 10;
        int y = 20;
        switch (x+1) {
            case  10:
                System.out.println("10");
                break;
            case 10+20+30:
                System.out.println(y);
                break;
        }

        char c = 'c';
        int returnVal = 0;
        returnVal = switch(c) {
            case 97 -> 97;
            default -> 122;
        };
        System.out.println(returnVal);
    }


}
