package Day30;

import java.util.Scanner;

public class Day30_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("---Kelipatan 3---");
        System.out.print("Masukkan batas: ");
        int n = De.nextInt();
        for (int i = 1; i < n; i++) {
            if(i % 3 == 0)
            System.out.println(i);
            
        }
        
    }
    
}
