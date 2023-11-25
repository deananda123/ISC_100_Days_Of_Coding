package Day47;

import java.util.Scanner;

public class Day47_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int a = 0, x = 3, y = 3;
        int [][]angka = new int [x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("masukkan nilai untuk array "+(angka[i][j]+a)+" : ");
                a++;
                angka [i][j]= De.nextInt();
            }
            
        }
        
        System.out.println("Array 2D");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(angka[i][j]+" ");
                
            }
            System.out.println();
        }

    }

}
