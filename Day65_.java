package Day65;

import java.util.Scanner;

public class Day65_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int a[] = {1, 4, 5, 7, 3};
        System.out.print("masukkan batas inputan: ");
        int y = De.nextInt();

        for (int i = 0; i < y; i++) {

            System.out.print("\nMasukkan indeks: ");
            int x = De.nextInt();
            int b = array(a, x);
            System.out.printf("data dari indeks ke-%d adalah %d", x, b);
        }
        System.out.println();
    }

    private static int array(int a[], int x) {
        int hasil = 0;
        try {
            hasil = a[x];
        } catch (Exception e) {
            System.err.println(e);
        }
        return hasil;
    }
}
