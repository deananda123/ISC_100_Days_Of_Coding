package Day20;

import java.util.Scanner;

public class Day20_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("===Mengetahui luas geometri yang di pilih==");
        /*Angka 1 untuk persegi
        Angka 2 untuk Segitiga
        Angka 3 untuk Lingkaran
        Angka empat untuk Persegi panjang*/

        System.out.print("masukkan angka: ");
        int geometri = De.nextInt();
        int s, a, t, r, p, l;
        double y;

        switch (geometri) {
            case (1):
                System.out.print("Masukkan Sisi Persegi: ");
                s = De.nextInt();
                y = s * s;
                System.out.println("Luas Persegi: " + y);
                break;
            case (2):
                System.out.print("Masukkan Alas Segitiga: ");
                a = De.nextInt();
                System.out.print("Masukkan Tinggi Segitiga: ");
                t = De.nextInt();
                 y = 0.5 * a * t;
                System.out.println("Luas Segitiga: " + y);
                break;
            case (3):
                System.out.print("Masukkan Jari-Jari Lingkaran: ");
                r = De.nextInt();
                y = 3.14 * r * r;
                System.out.println("Luas Lingkaran: " + y);
                break;
            case (4):
                System.out.print("Masukkan Panjang persegi panjang: ");
                p = De.nextInt();
                System.out.print("Masukkan Luas persegi panjang: ");
                l = De.nextInt();
                y = p * l;
                System.out.println("Luas Persegi Panjang: " + y);
                break;
        }

    }

}
