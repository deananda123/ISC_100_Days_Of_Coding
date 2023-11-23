package Day45;

import java.util.Random;
import java.util.Scanner;

public class Day45_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("inputkan baris: ");
        int baris = De.nextInt();
        System.out.println("inputkan kolom: ");
        int kolom = De.nextInt();
        
        int[][]array= new int [baris][kolom];
        
        Random x = new Random();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j]= x.nextInt(10));
                System.out.print(", ");
            }
            System.out.println();
            
        }
    }
}
    


