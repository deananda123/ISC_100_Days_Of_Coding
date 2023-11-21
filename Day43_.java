package Day43;

import java.util.Scanner;

public class Day43_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int x = De.nextInt();
        int y =0;
        for (int i = 1; i <= x; i++) {
            System.out.print(i);
            y+=i;
            if(i < (x)){
                System.out.print(" + ");
            }else if(i==x){
                System.out.print(" = "+ y);
            }
            
        }
        System.out.println();
    
    }
    
}
