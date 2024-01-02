package Day85;

import java.util.*;

public class Day85 {
    public static void main(String[] args) {
        LinkedList <String> buah = new LinkedList<>();
        buah.add("semangka");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("pisang");
        System.out.println(buah);
        buah.remove(1);//menghapus sesuai indeks
        System.out.println("\nSaat indek-1 di hapus: "+buah);
        buah.removeFirst(); //menghapus indeks pertama
        System.out.println("\nSaat indek pertama juga di hapus: "+buah);
        buah.removeLast();//menghapus indeks terakhir
        System.out.println("\nSaat indek terakhir juga di hapus: "+buah);
       boolean a = buah.isEmpty();//memerikasa apakah LinkedList kosong atau tidak
       
        System.out.println("Apakah tidak berisi? "+a);
        
        for (int i = 0; i < buah.size(); i++) {
            System.out.print(buah);
        }
    }
    
}
