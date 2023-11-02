package Day24;

import java.util.Scanner;

public class Day24_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("mengetahi angka ganjil atau genap");
        System.out.print("masukkan angka: ");
        int x = De.nextInt();
        do{
            if(x%2 == 0){
                System.out.println(x+" Genap");
                x+=2;
            }else {
                System.out.println(x+" Ganjil");
                x+=2;
            }
        }while (x<=10);
    
}}
