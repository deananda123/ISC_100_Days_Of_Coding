package Day80;

import java.util.*;

public class Day80 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        ArrayList <Double> a = new ArrayList<>();
        System.out.println("Masukkan indeks: ");
        int b =De.nextInt();
        double c = 0;
        for (int i = 0; i < b; i++) {
            System.out.print("Masukkan angka: ");
            c = De.nextDouble();
            a.add(c);
            
        }
        System.out.println(a);
    }
    
}
