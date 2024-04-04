public class ReverseStringWithoutSpecialCharacter {
    public static void main(String[] args) {
        String s = "m@r&t^i";
        System.out.println(reverseStringWithoutSpecialCharacter(s));
    }
    private static String reverseStringWithoutSpecialCharacter(String s) {
        String specialChars = "!@#$%^&*()_+";
        char temp = '\u0000';
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length()-1;
        while(i<=j){
            if(!specialChars.contains(""+sb.charAt(i)) && !specialChars.contains(""+sb.charAt(j))) {
                temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }else if(specialChars.contains(""+sb.charAt(i)) && !specialChars.contains(""+sb.charAt(j)))
                i++;
            else if(!specialChars.contains(""+sb.charAt(i)) && specialChars.contains(""+sb.charAt(j)))
                j--;
            else {
                i++;
                j--;
            }
        }

        return sb.toString();
    }
}