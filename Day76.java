package Day76;

import java.util.*;

public class Day76 {
    public static void main(String[] args) {
        Enumeration hari;
        Vector hari1 = new Vector();
        hari1.add("Senin");
        hari1.add("Selasa");
        hari1.add("Rabu");
        hari1.add("Kamis");
        hari1.add("Jumat");
        hari1.add("Sabtu");
        hari1.add("Minggu");
        
        hari = hari1.elements();
        System.out.println("Nama Hari: ");
        while(hari.hasMoreElements()){
            System.out.println(hari.nextElement());
        }
        
    }
    
}
