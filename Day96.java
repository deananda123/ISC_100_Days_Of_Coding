package Day96;

import java.util.*;

public class Day96 {
    public static void main(String[] args) {
        HashSet data = new HashSet();
        Scanner De = new Scanner(System.in);
        System.out.println("batas: ");
        int a = De.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Nama: ");
            String n = De.next();  
            data.add(n);
            
        }
        System.out.println("panjang HashSet "+data.size());
        System.out.println("apakah HashSet kosng? "+data.isEmpty());
       
        
        
        
    }
    
}
