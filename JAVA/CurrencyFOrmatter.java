import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    
    public static void main(String[] args) {
        /* Read input */
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        // Locale indiaLocale = new Locale("en", "IN");
        
        NumberFormat objus=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat objin=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat objch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat objfr=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=objus.format(payment);
        String in=objin.format(payment);
        String ch=objch.format(payment) ;
        String fr=objfr.format(payment);
       
       System.out.println("US: " +us );
        System.out.println("India: " + in );
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
