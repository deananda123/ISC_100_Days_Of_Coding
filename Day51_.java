package Day51;

import java.util.Scanner;

public class Day51_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int x = De.nextInt();
        int y,v;
        
        y = f(x);
        System.out.print("sisa bagi x: ");
        System.out.println(y);
        v = g(x);
        System.out.print("hasil perkalian "+x+"x"+x+": ");
        System.out.println(v);

    }

    static int f(int input) {
        int hasil;

        hasil = (input%2);
        return hasil;

    }
    static int g(int z){
        int a;
        a=(z*z);
        return a;
    }

}
