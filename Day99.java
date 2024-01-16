package Day99;

import java.util.*;

public class Day99 {
    public static void main(String[] args) {
        Scanner de = new Scanner (System.in);
        HashMap<String,String> absen = new HashMap<String, String>();
        System.out.println("batas");
        int a = de.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Nama");
            String b = de.next();
            System.out.println("keterangan");
            String c = de.next();
            absen.put(b, c);
        }
        
        System.out.println("Nama : "+ absen.keySet());
        System.out.println("Keterangan: "+absen.values());
        System.out.println("Absensi: "+absen);
    }
    
}
