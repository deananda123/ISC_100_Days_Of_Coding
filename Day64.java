package Day64;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("masukkan kalimat: ");
        String kalimat = De.nextLine();
        System.out.print("masukkan indeks yang ingin di print: ");
        int x = De.nextInt();
        System.out.print("masukkan indeks kata yang ingin di print: ");
        int d = De.nextInt();
        System.out.println("\n==================\n");
        p(kalimat, x, d);
        
        

    }

    static void p(String a, int x, int d) {
        System.out.println("kalimat: " + a);
        System.out.println(a.charAt(x));
        System.out.println(a.substring(d));

    }
}
