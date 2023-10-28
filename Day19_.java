package Day19;

import java.util.Scanner;

public class Day19_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("masukkan case ke-");
        int bulan = De.nextInt();

        switch (bulan) {
            case (1):
                System.out.println("Januari");
                break;
            case (2):
                System.out.println("Februari");
                break;
            case (3):
                System.out.println("Maret");
                break;
            case (4):
                System.out.println("April");
                break;
            case (5):
                System.out.println("Mei");
                break;
            case (6):
                System.out.println("juni");
                break;
            case (7):
                System.out.println("Juli");
                break;
            case (8):
                System.out.println("Agustus");
                break;
            case (9):
                System.out.println("September");
                break;
            case (10):
                System.out.println("Oktober");
                break;
            case (11):
                System.out.println("November");
                break;
            case (12):
                System.out.println("Desember");
                break;

        }

    }
}
