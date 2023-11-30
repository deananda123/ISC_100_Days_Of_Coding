package Day52;

import java.util.Scanner;

public class Day52_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int y = De.nextInt();
        int hasil = fibonacci(y);
        System.out.println("nilai fibonacci ke-"+y+" adalah: "+hasil);
        
    }
    static int fibonacci(int x){
        System.out.println("fibonacci ke-"+x);
        if (x <= 1){
            return x;
        }else {
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
}
