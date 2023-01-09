import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> L = new ArrayList<Integer>(n);
        for (int i=0;i<n;i++){
            L.add(scanner.nextInt());
        }
                
        int t = scanner.nextInt();
        for (int i=0;i<t;i++){
            String operation = scanner.next();
            if (operation.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                L.add(index, value);
            }
            else if (operation.equals("Delete")){
                int index = scanner.nextInt();
                L.remove(index);
            }
        }
        
        for (int element: L){
            System.out.print(element + " ");
        }
    }
}
