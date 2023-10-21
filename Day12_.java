package day12_;

import java.util.Scanner;

public class Day12_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("~Toko Cahya~");
        System.out.print("Stok Baju: ");
        int Kemeja = De.nextInt();
        System.out.print("Stok kotak: ");
        int kotak = De.nextInt();
        System.out.print("Jumlah pesanaan atau kotak yang terisi:");
        int pesanan = De.nextInt();
        
        int x = (Kemeja-pesanan);
        System.out.println("kemeja yang belum dikemas: "+x);
    }

}
