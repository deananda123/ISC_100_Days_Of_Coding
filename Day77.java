package Day77;

import java.io.*;
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args)  throws IOException{
        Scanner De = new Scanner(System.in);
            System.out.println("penulisan file");
            String file = "C:\\Users\\LENOVO\\Documents\\tulis.txt";
            System.out.print("mulai menulis :");
            String penulisan = De.nextLine();
        
        try {
            FileWriter a = new FileWriter(file);
            a.write(penulisan);
            a.close();
            
            System.out.println("selesai");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }      
    }
    
}
