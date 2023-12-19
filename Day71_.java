package Day71;

import java.util.Scanner;

public class Day71_ {
    public static void main(String[] args) {
        Scanner De = new Scanner (System.in);
        int a[]= new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("masukkan indeks-"+i+": ");
            a[i]= De.nextInt();
        }
        System.out.print("\nmasukkan panjang indeks yang ingin di jumlah: ");
        int x = De.nextInt();
        int b = y(a,x);
        System.out.printf("\n\nMenjumlahkan indek awal hingga indek-%1d \nmaka di dapatkan hasil: %2d",x,b);
    }
    private static int y(int a[],int x){
       int hasil = 0;
       try{
        for (int i = 0; i < x; i++) {
            hasil+=a[i];
        }
    }catch(Exception e){
                System.out.println(e);
                }
        return hasil;
    }
    
}
