import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum=a;
            for(int j=0;j<n;j++)
            {
                sum=sum+(int)Math.pow(2,j)*b;
                System.out.printf("%s ",sum);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
