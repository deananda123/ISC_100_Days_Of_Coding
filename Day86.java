package Day86;

import java.util.*;

public class Day86 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("Masukkan batas inputan: ");
        int b = De.nextInt();
        LinkedList <Integer> a = new LinkedList<>();
        
        for (int i = 0; i <b; i++) {
            int c = De.nextInt();
            a.add(c);
            
        }
        System.out.println("\nSebelum Di Ganti");
        System.out.println(a);
        System.out.println("\nSetelah Di Ganti");
        for (int i = 0; i < b; i++) {
            a.set(i, i);//set untuk mengganti isi
        }
        System.out.println(a);
        
       boolean d = a.contains(8); //untuk memeriksa apakah linkedlist mengandung elemen yang di berikan atau tidak
        System.out.println(d);
        
        boolean e = a.offer(3);//untuk memasukkan sis linkedlist tetapi juga mengembalikan true
        System.out.println("\nmenambah menggunakan offer");
        System.out.println(a);
         System.out.println(e);
          System.out.println("\nmenambah menggunakan offerFirst");
         boolean f = a.offerFirst(-1);
         System.out.println(a);
         System.out.println(f);
     System.out.println("\nmenambah menggunakan offerLast");
         boolean g = a.offerLast(100);
         System.out.println(a);
         System.out.println(g);    
     
    }
    
}
