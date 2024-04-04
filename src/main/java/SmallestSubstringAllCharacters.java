import java.util.Arrays;

public class SmallestSubstringAllCharacters {
    public static void main(String[] args) {
        char[] arr = {'x','y','z'};
        String str = "xyyzxyzyx"; //String str = "zxy"; //
        int i=0,j=str.length(),k=0;
        String res = "";
        int[] visitedArr = new int[arr.length];
        while((j-i)>=arr.length) {
            while(k<arr.length) {
                if(Arrays.binarySearch(arr,str.charAt(i+k))!=-1 && visitedArr[Arrays.binarySearch(arr,str.charAt(i+k))]==0) {
                    visitedArr[Arrays.binarySearch(arr, str.charAt(i+k))] = 1;
                    res += str.charAt(i+k);
                    k++;
                }else {
                    i++;
                    k=0;
                    res = "";
                    visitedArr = new int[arr.length];
                    break;
                }
            }
            if(res.length()==arr.length)
                break;
        }
        System.out.println(res);
    }
}