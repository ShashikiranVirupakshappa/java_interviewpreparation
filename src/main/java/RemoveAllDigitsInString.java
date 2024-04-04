public class RemoveAllDigitsInString {
    public static void main(String[] args) {
        String s = "245ja89va";
        String finalString = "";
        for(int i=0;i<s.length();i++) {
            if(Character.isAlphabetic(s.charAt(i)))
                finalString = finalString+s.charAt(i);
        }
        System.out.println(finalString);
        String s1 = "java\sdsdas";
        System.out.println(s1);
    }
}