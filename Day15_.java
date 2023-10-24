package Day15;

import java.util.Scanner;

public class Day15_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("~Menghitung diskon di toko Dezz~");
        System.out.print("masukkan jumlah belanjaan: ");
        int x = De.nextInt();
        double a,b,c;
        a=0.05;
        b=0.1;
        
        if(x<50000){
            System.out.println("Tidak ada diskon");
        }else if (x>=100000){
            c = x-(x*b);
            System.out.println("dikenakan diskon sebesar 10% maka totalnya: "+c);
        }else if (x>=50000){
            c = x-(x*a);
            System.out.println("Dikenakan diskon sebesar 5% maka totalnya: "+c);
        }
    }
}
