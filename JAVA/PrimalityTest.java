import java.util.*;
import java.math.*;

public class Solution {

   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        if(n.isProbablePrime(1000))
            System.out.println("prime");
        else
            System.out.println("not prime");
   }
}