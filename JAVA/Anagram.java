import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length()!=b.length())
            return false;
        else{
            char temp1[] = a.toCharArray();
            char temp2[] = b.toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
            if(Arrays.equals(temp1,temp2))
                return true;
            else
                return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
