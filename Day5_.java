package day5_;

import java.util.Scanner;

public class Day5_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);

        System.out.print("masukkan no peserta: ");
        byte no = De.nextByte();
        System.out.println("masukkan nama: ");
        String nama = De.nextLine();
        De.nextLine();
        System.out.print("masukkan jenis kelamin: ");
        String jk = De.nextLine();
        System.out.print("masukkan umur: ");
        byte umur = De.nextByte();
        System.out.print("masukkan berat badan: ");
        float bb = De.nextFloat();
        System.out.print("masukkan keaktifan: ");
        boolean keaktifan = De.nextBoolean();

        System.out.println("No peserta: " + no);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + jk);
        System.out.println("Umur: " + umur);
        System.out.println("Berat badan: " + bb);
        System.out.println("Keaktifan: " + keaktifan);

    }

}
