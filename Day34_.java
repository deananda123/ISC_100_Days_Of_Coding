package Day34;

import java.util.Scanner;

public class Day34_ {
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        System.out.print("size array: ");
        int a = De.nextInt();
        String nama[]=new String[a];
        for (int i = 0; i <a; i++){
            nama[i]=De.nextLine();
        }
        System.out.println("-----outpout-----");
        for (int i = 1; i < a; i++) {
            System.out.println("nama: "+nama[i]);
            
        }
    }
    
}
