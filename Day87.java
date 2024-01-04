package Day87;

import java.util.*;
class Nama{
    private String nama;
    
    public Nama(String nama){
        this.nama = nama;
        
       
    }
    public String getnama(){
    return nama;
}
}
public class Day87 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        LinkedList <Nama> a = new LinkedList<>();
        System.out.println("Masukkan Batas: ");
        int b = De.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println("Masukkan Nama: ");
            String c = De.next();
            a.add(new Nama(c));
        }
        
        System.out.println("Masukkan Indeks Yang ingin Di hapus: ");
        int d = De.nextInt();
        a.remove(d);
         
        System.out.println("=======OUTPUT=======");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getnama());
        }
        
    }
    
}
