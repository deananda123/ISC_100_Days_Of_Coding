package Day41;

import java.util.Scanner;

public class Day41_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int x = De.nextInt();
        int sum  = 0;
        for (int i = 1; i <= x; i++) {
            System.out.print("inputan"+i+" :");
            int y = De.nextInt();
            sum+=y;
            
        }
        int avg= sum/x;
        System.out.println("Average: "+avg);
        System.out.println("SUM: "+sum);
    }
    
}
