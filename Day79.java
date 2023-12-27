package Day79;

import java.util.*;

public class Day79 {
    public static void main(String[] args) {
        ArrayList <Integer> angka = new ArrayList<>();
       angka.add(2);
       angka.add(3);
       angka.add(6);
       angka.add(88);
       angka.add(1);
       angka.add(9);
        System.out.println(angka);
        
        Collections.sort(angka);
        System.out.println(angka);
        
        angka.remove(3);
        System.out.println(angka);
    }
    
}
