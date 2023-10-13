
package day4_inputdataa;

import java.util.Scanner;


public class Day4_inputdataa {

    
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.println("indentitas: ");
        System.out.print("masukkan nama: ");
        String nama = De.nextLine();
        
        System.out.print("masukkan nim: ");
        String nim = De.nextLine();
        
        System.out.print("masukkan kelas: ");
        String kelas = De.nextLine();
        
        System.out.println("Nama: "+ nama);
        System.out.println("Nim: "+ nim);
        System.out.println("Kelas: "+ kelas);
        
        
    }
    
}
