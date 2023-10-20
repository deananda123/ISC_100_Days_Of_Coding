
package day11_logika;

import java.util.Scanner;


public class Day11_logika {

    
    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        int x = 4;
        int y;
        boolean StatusTebakan;
        
        System.out.println("menebak aknga x: ");
        System.out.print("masukkan tebakan: ");
        y = De.nextInt();
        System.out.print("hasilnya: ");
        StatusTebakan = (x == y);
        System.out.println(StatusTebakan);
        
        System.out.println("apakah x>y?");
        System.out.print("masukkan tebakan: ");
        y = De.nextInt();
        System.out.print("hasilnya: ");
        StatusTebakan = (x>y);
        System.out.println(StatusTebakan);
        
        System.out.println("apakah x<y?");
        System.out.print("masukkan tebakan: ");
        y = De.nextInt();
        System.out.print("hasilnya: ");
        StatusTebakan = (x < y);
        System.out.println(StatusTebakan);
        
        System.out.println("apakah x!=y?: ");
        System.out.print("masukkan tebakan: ");
        y = De.nextInt();
        System.out.print("hasilnya: ");
        StatusTebakan = (x != y);
        System.out.println(StatusTebakan);
        
        System.out.println("tebakan terakhir!!: ");
        System.out.println("berapa nilai x??");
        System.out.print("masukkan tebakan: ");
        y = De.nextInt();
        System.out.print("hasilnya: ");
        StatusTebakan = (x == y);
        System.out.println(StatusTebakan);
        
        
        
    }
    
}
