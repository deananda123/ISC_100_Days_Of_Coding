package Day68;

import java.util.*;

public class Day68_ {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("Masukkan Batas: ");
        int x = De.nextInt();
        int a[] = new int[x];

        Random b = new Random();
        for (int i = 0; i < x; i++) {
            a[i] = b.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        System.out.print("Masukkan indeks-");
        int y = De.nextInt();
        int o = array(a, y);
        System.out.printf("indeks-%1d yang awalnya berisi %2d menjadi berisi %3d",y,a[y],o);
    }

    static int array(int o[], int i) {
        Scanner De = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int c = De.nextInt();
        System.out.print("masukkan operasi: ");
        char d =De.next().charAt(0);
        int hasil = 0;
        try {
            if(d == '+'){
            hasil = o[i]+c;
            }else if(d =='-'){
                hasil = o[i]-c;
            }else if(d =='/'){
                hasil = o[i]/c;
            }else if(d =='*'){
                hasil = o[i]*c;
            }else if(d =='%'){
                hasil = o[i]%c;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return hasil;
    }

}
