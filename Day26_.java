package Day26;

import java.util.Scanner;

public class Day26_ {

    public static void main(String[] args) {
        String nama, alamat, lanjut;
        int umur, tinggi;
        do {
            Scanner De = new Scanner(System.in);
            System.out.println("===MASUKKAN BIODATA===");
            System.out.print("masukkan nama: ");
            nama = De.nextLine();
            System.out.print("masukkan umur: ");
            umur = De.nextInt();
            System.out.print("masukkan tinggi: ");
            tinggi = De.nextInt();
            System.out.print("masukkan alamat: ");
            alamat = De.nextLine();
            System.out.println("lanjut(y/n)");
            lanjut = De.next();

        } while (lanjut.equals("y"));
        System.out.println("selesai");   
    }

}
