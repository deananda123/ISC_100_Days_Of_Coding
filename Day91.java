package Day91;

import java.util.*;

public class Day91 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        Stack<Integer> data = new Stack<>();
        System.out.println("=====Menebak Isi Tumpukan Teratas=====");
        System.out.print("Masukkan batas: ");
        int a = De.nextInt();
        Random b = new Random();
        for (int i = 0; i < a; i++) {

            int c = b.nextInt(a);
            data.push(c);
        }
        System.out.println(data);
        int e = data.pop();
        while (true) {
            System.out.println("Masukkan tebakan: ");
            int d = De.nextInt();

            if (e == d) {
                System.out.println("Benar!!");
                break;
            } else if (d > e) {
                System.out.println("Terlalu Besar");
            } else if (d < e) {
                System.out.println("Terlalu Kecil");
            }
        }

    }

}
