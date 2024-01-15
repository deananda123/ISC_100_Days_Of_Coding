package Day98;

import java.util.*;

public class Day98 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        HashSet<String> nama = new HashSet<>();
        System.out.println("-ABSENSI-");
        System.out.println("Jumlah mahasiswa: ");
        int a = De.nextInt();
        boolean d;

        for (int i = 0; i < a; i++) {
            System.out.println("Nama: ");
            String b = De.next();
            System.out.println("Keterangan: ");
            String c = De.next();
            if (c.equalsIgnoreCase("hadir")) {
                nama.add(b);
            } else {
                System.out.println("-1");
            }
        }
        System.out.println(nama);
        System.out.println("\n-Absen Akhir Kelas-");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Masukkan nama yang ingin di cari: ");
            String e = De.next();
            d = nama.contains(e);
            if (d == true) {
                System.out.println("Hadir");
            } else {
                System.out.println("-Nama tidak di temukan-");
                System.out.println("ingin menambahkan ke absen? y/n");
                String g = De.next();
                if (g.equalsIgnoreCase("y")) {
                    nama.add(e);
                }
            }
        }
        System.out.println("Apa ada yang telat? y/n");
        String h = De.next();
        if (h.equalsIgnoreCase("y")) {
            System.out.println("Masukkan nama");
            String i = De.next();
            nama.remove(i);
           
        }else{
            System.out.println("-Tidak ada yang bolos-");
        }
        System.out.println("-Absen yang hadir-");
        System.out.println(nama);
        System.out.println("\nIngin membersihkan absen? y/n");
        String f = De.next();

        if (f.equalsIgnoreCase("y")) {
            nama.clear();
            System.out.println("-ABSEN SELESAI-");
        } else {
            System.out.println("-ABSEN SELESAI-");
        }

    }
}
