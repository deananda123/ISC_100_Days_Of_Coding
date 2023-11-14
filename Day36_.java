package Day36;

import java.util.Scanner;

public class Day36_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        
        System.out.print("masukkan baris: ");
        int x = De.nextInt();
        System.out.print("masukkan kolom: ");
        int y = De.nextInt();
        
        int [][]angka = new int [x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                angka [i][j]= De.nextInt();
            }
            
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(angka[i][j]+" "); 
            }
            System.out.println();
        }
       
        
    }
    
}
