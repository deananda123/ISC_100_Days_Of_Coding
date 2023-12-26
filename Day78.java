package Day78;

import java.util.LinkedList;

public class Day78 {
    public static void main(String[] args) {
        LinkedList<String> makanan = new LinkedList<String>();
        makanan.add("Mie Ayam");
        makanan.add("Martabak Keju");
        makanan.add("Bakso");
        makanan.add("Es Krim");
        makanan.add("Pangsit");
        makanan.add("Mie Instan");
        System.out.println("Sebelum penghapusan: "+makanan);
        
        makanan.removeLast();
        System.out.println("Setelah penghapusan: "+makanan);
        
        String a = makanan.get(3);
        makanan.set(2, a+" Strawberry");
        makanan.remove(3);
        System.out.println("Setelah berubah: "+makanan);
        
        
        
    }
    
}
