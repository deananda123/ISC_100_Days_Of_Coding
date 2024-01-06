package Day89;

import java.util.*;

public class Day89 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        LinkedList <Float> angka = new LinkedList<>();
        System.out.println("Masukkan batas: ");
        int a = De.nextInt();
        
        Random b = new Random();
        for (int i = 0; i < a; i++) {
            float c = b.nextFloat(2);
            
            angka.add(c);
        }
        System.out.println(angka);
        angka.pollFirst();
        System.out.println("\npollFirst\n"+angka);
        angka.pollLast();
        System.out.println("\npollLast\n"+angka);
        boolean d = angka.isEmpty();
        System.out.println("Apakah LinkedList ini kosong? "+d);
    }
    
}
