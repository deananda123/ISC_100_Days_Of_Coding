package Day81;

import java.util.*;

public class Day81 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        ArrayList <Short> a = new ArrayList<>();
        short b = 0;
        System.out.print("Masukkan Indeks: ");
        int e = De.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.print("Masukkan isi: ");
            b = De.nextShort();
            a.add(b);
        }
        System.out.println("\nSebelum Di Hapus: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.print("\nMasukkan indeks yang ingin di hapus: ");
        int c = De.nextInt();
        a.remove(c);
        
        System.out.println("\nSetelah Di Hapus: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        
        System.out.println("\nSetelah Di Urutkan: ");
        Collections.sort(a);
        System.out.println(a);
        
        
        
    }
    
}
