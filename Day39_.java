package Day39;

import java.util.Scanner;

public class Day39_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int y = De.nextInt();
        int z;
        System.out.print("[");
        int[] x = new int[y];

        if (y % 2 == 0) {
            z = 2;
            for (int i = 0; i < y; i++) {
                x[i] = z;
                z += 2;
                System.out.print(x[i]+" ");
            }
        } else if (y % 2 != 0) {
            z = 1;
            for (int i = 0; i < y; i++) {
                x[i] = z;
                z += 2;
                System.out.print(x[i]+" ");
            }
        }

        System.out.print("]");

    }

}
