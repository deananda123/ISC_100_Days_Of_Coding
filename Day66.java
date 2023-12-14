package Day66;

import java.util.*;

public class Day66 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int a[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan isi: ");
            a[i] = De.nextInt();
        }
        System.out.println(Arrays.toString(a));

        System.out.print("\nMasukkan indeks: ");
        int x = De.nextInt();
        System.out.println("masukkan indeks: ");
        int y = De.nextInt();
        int b = array(a, x, y);
        System.out.printf("hasil jumblah dari indeks ke-%1d  dan indeks ke- %2d adalah %3d", x, y, b);
        System.out.println();

    }

    private static int array(int a[], int x, int y) {
        int hasil = 0;
        try {
            hasil = a[x] + a[y];
        } catch (Exception e) {
            System.err.println(e);
        }
        return hasil;
    }
}
