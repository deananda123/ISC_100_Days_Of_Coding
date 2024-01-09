package Day92;

import java.util.*;

public class Day92_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        Stack<Integer> angka = new Stack<>();
        System.out.print("Masukkan batas: ");
        int a = De.nextInt();
        int e;

        Random b = new Random();
        for (int i = 0; i < a; i++) {
            int c = b.nextInt(a);
            angka.push(c);

        }
        System.out.println("-PILIH BERDASARKAN NOMOR MENU-");
        System.out.println("=================");
        System.out.println("|MENU");
        System.out.println("|1.Mengetahui Stack kosong atau tidak");
        System.out.println("|2.Melihat elemen teratas");
        System.out.println("|3.Mencari Elemen");
        System.out.println("=================");

        System.out.print("\nMasukkan Pilihan: ");
        int f = De.nextInt();
        System.out.println("\nHasil");
        switch (f) {
            case 1:
                System.out.println("Apakah Stack Kosong? " + angka.empty());
                break;
            case 2:
                System.out.println("Elemen Teraras Adalah: " + angka.peek());
                break;
            case 3:
                System.out.println("Masukkan Elemen: ");
                int g = De.nextInt();
                int posisi = angka.search(g);
                if (posisi == -1) {
                    System.out.println("Tidak ada");
                } else {
                    System.out.println("Ada");
                }
                break;
            default:
                System.out.println("Tidak Ada Pada Menu");

        }

        int angka1 = angka.pop();
        int angka2 = angka.pop();
        System.out.println("\n=================");
        System.out.println("|\tMENU");
        System.out.println("|\t1.+");
        System.out.println("|\t2.-");
        System.out.println("|\t3./");
        System.out.println("|\t4.*");
        System.out.println("=================");
        System.out.print("\nMasukkan Pilihan: ");
        int d = De.nextInt();
        System.out.println("\nHasil");
        switch (d) {
            case 1:
                e = angka1 + angka2;
                
                System.out.println(angka1 + " + " + angka2 + "= " + e);
                break;
            case 2:
                e = angka1 - angka2;
                
                System.out.println(angka1 + " - " + angka2 + "= " + e);
                break;
            case 3:
                e = angka1 / angka2;
                
                System.out.println(angka1 + " / " + angka2 + "= " + e);
                break;
            case 4:
                e = angka1 - angka2;
                
                System.out.println(angka1 + " / " + angka2 + "= " + e);
                break;
            default:
                System.out.println("Tidak Ada Pada Menu");
        }
    }

}
