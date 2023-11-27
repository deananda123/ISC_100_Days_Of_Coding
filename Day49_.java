package Day49;

import java.util.*;

public class Day49_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        while (true) {
            System.out.print("masukkan panjang: ");
            int panjang = De.nextInt();
            System.out.print("masukkan lebar: ");
            int lebar = De.nextInt();
            gambar(panjang, lebar);
            System.out.println("Keliling persegi panjang: " + keliling(panjang, lebar));

            System.out.println("continue or break?");
            String a = De.next();
            if (a.equals("continue")) {
                continue;
            } else {
                break;
            }

        }
    }

    private static int keliling(int panjang, int lebar) {
        int hasil = 2 * (panjang * lebar);
        return hasil;

    }

    private static void gambar(int panjang, int lebar) {
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
