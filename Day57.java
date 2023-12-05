package Day57;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("masukkan kalimat 1: ");
        String kalimat = De.nextLine();
        
        System.out.println("\nmengambil komponen dari string");
        System.out.println(kalimat.charAt(3));
        
        System.out.println("\nsubstring");
        String kata = kalimat.substring(5, 10);
        System.out.println(kata);
        
        System.out.println("\nconcat");
        String kalimat2= kata+ " bagus";
        System.out.println(kalimat2);
        
        System.out.println();
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        System.out.print("\nmasukan kalimat ke 2: ");
        String kalimat1 = De.nextLine();
        
        if(kalimat.equals(kalimat1)){
            System.out.println("kalimat 1 dan 2 sama");
        }else {
            System.out.println("kalimat 1 dan 2 tidak sama");
        }
    }
    
}
