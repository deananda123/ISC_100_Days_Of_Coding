package Day42;

import java.util.Random;
import java.util.Scanner;

public class Day42_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("ukurang matriks 1: ");
        int a = De.nextInt();
        System.out.print("ukurang matriks 2: ");
        int b = De.nextInt();
        System.out.print("ukurang matriks 3: ");
        int c = De.nextInt();
        System.out.print("ukurang matriks 4: ");
        int d = De.nextInt();

        int[][][][] array = new int[a][b][c][d];

        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        array[i][j][k][l] = r.nextInt(100);

                    }

                }

            }

        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();

                }
                System.out.println();

            }
            System.out.println();

        }

    }

}
