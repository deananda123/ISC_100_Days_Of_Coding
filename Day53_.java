package Day53;

import java.util.Scanner;

public class Day53_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int a[] = new int[5];
        int x = 0, y = 0, z = 0, o = 0, u = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("indeks-" + i + ": ");
            a[i] = De.nextInt();
            if (a[i] > 0) {
                x++;

            }
            if (a[i] < 0) {
                y++;

            }
            if (a[i] % 2 != 0) {
                z++;
            }
            if (a[i] % 2 == 0 && a[i] != 0) {
                o++;
            }
            if (a[i] == 0) {
                u++;
            }

        }
        System.out.println("jumlah bilangan positif: " + x);
        System.out.println("jumlah bilangan negatif: " + y);
        System.out.println("jumlah bilangan ganjil: " + z);
        System.out.println("jumlah bilangan genap: " + o);
        System.out.println("jumlah angka 0: " + u);

    }

}


