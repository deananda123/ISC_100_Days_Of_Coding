package Day88;
import java.util.*;
class Benda {
    public String benda;
    public Benda (String benda) {
        this.benda = benda;
    }
    public static String getBenda(String benda) {
        return benda;
    }
}
public class Day88 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        LinkedList <Benda> benda = new LinkedList<>();
        System.out.print("Masukkan batas inputan : ");
        int a = De.nextInt();
        String b;
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan nama Benda : ");
            b = De.next();
            benda.add(new Benda(b));
        }
        System.out.println("Daftar Benda");
        for (int i = 0; i < benda.size(); i++) {
            System.out.println(benda.get(i).benda);
        }
        benda.pollFirst(); //ini digunakan untuk menghapus elemen pertama
        benda.pollLast(); //ini digunakan untuk menghapus elemen terakhir
        System.out.println("Daftar Benda setelah menghapus elemen pertama dan terakhir");
        for (int i = 0; i < benda.size(); i++) {
            System.out.println(benda.get(i).benda);
        }
    }
}
