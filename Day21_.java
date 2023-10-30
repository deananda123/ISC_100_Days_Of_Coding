package Day21;

import java.util.Scanner;

public class Day21_ {

    public static void main(String[] args) {
        //Ternary
        Scanner De= new Scanner(System.in);
        System.out.println("===mengecek data ganjil atau genap===");
        System.out.println("__jika data bernilai ganjil maka akan di pangkat 2__");
        System.out.println("__jika data bernilai genap maka akan di bagi 2__");
        System.out.print("masukkan data: ");
        int x = De.nextInt();

        int y = (x % 2 != 0) ? (x + x) : (x / 2);
        System.out.println("nilai x = "+ y);
    }

}
