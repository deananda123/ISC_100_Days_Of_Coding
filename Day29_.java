package Day29;

import java.util.Scanner;

public class Day29_ {

    public static void main(String[] args) {
        String nama, alamat;
        int umur, tinggi;
        while(true){
            Scanner De = new Scanner(System.in);
            System.out.println("===MASUKKAN BIODATA===");
            System.out.print("masukkan nama: ");
            nama = De.nextLine();
            System.out.print("masukkan umur: ");
            umur = De.nextInt();
            System.out.print("masukkan tinggi: ");
            tinggi = De.nextInt();
            System.out.print("masukkan alamat: ");
            alamat = De.nextLine();
            
            System.out.println("continue / break / return?");
            String lanjut = De.next();
            if(lanjut.equals("continue")){
                continue;
            }else if(lanjut.equals("break")){
                break;
            }else if(lanjut.equals("return")){
                return;
            }
            
        }

    }
}
