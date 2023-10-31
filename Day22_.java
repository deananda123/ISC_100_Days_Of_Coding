package Day22;

import java.util.Scanner;

public class Day22_ {
     public static void main(String[] args) {
         Scanner De = new Scanner(System.in);
         //Jika memasukkan angka gajil maka akan ditambah 1 dan akan mengasilkan angka genap
         System.out.print("Masukkan angka: ");
         int x = De.nextInt();
         
         if(x%2 != 0){
             int y = x+1;
             System.out.println(y + " Bilangan benap");
         }else{
             System.out.println("angka yang di imput bukan bilangan ganjil");
         }
     }
     
    
}
