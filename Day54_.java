package Day54;

import java.util.Scanner;

public class Day54_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("masukkan indeks [" + i + "]" + "[" + j + "]: ");
                a[i][j] = De.nextInt();
                b *= a[i][j];
            }

        }
        System.out.println("hasil perkalian: " + b);
    }

}
