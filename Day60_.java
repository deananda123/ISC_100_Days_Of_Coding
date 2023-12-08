package Day60;

import java.util.Scanner;

public class Day60_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        String kalimat = "Allah tidak membebani seseorang melainkan sesuai dengan kemampuannya";
        System.out.println("\nmengambil komponen dari string");
        System.out.println(kalimat.charAt(6));
        
        System.out.println("\nsubstring");
        String kata = kalimat.substring(6, 11);
        System.out.println(kata);
        
        
        System.out.println();
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        System.out.print("\nmasukan kalimat ke 1: ");
        String kalimat1 = De.nextLine();
        System.out.print("masukan kalimat ke 2: ");
        String kalimat2 = De.nextLine();
        
        if(kalimat1.equals(kalimat2)){
            System.out.println("kalimat 1 dan 2 sama");
        }else {
            System.out.println("kalimat 1 dan 2 tidak sama");
        }
    }
    
}
