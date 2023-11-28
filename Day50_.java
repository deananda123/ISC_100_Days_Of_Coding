package Day50;

import java.util.Scanner;

public class Day50_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int x = De.nextInt();
        int sum = 0;
        int avg;
        for (int i = 2; i <= x; i++) {
            boolean prima = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                    
                }
                
            }
            if (prima) {
                    System.out.println(i);
                    sum += i;
                }

        }
        avg = sum / x;
        System.out.println();
        System.out.println("SUM: " + sum);
        System.out.println("AVG: " + avg);
    }

}
