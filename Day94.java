package Day94;

import java.util.*;

public class Day94 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        Queue<Double> angka = new LinkedList<>();
        System.out.println("Masukkan Batas: ");
        int a = De.nextInt();
        for (int i = 0; i < a; i++) {
            double b = De.nextDouble();
            boolean c = angka.offer(b);
             
             System.out.println(c);
        }
       System.out.println(angka);
       
        System.out.println(" baris pertama pada Queue: "+ angka.peek());
        double d = angka.poll();//mengambil baris pertama
       
        System.out.println("Apa baris pada Queue kosong? "+angka.isEmpty());
        
        
        
        
        
    }
    
}
