package Day69;

import java.io.*;
import java.util.Scanner;

public class Day69_ {
    public static void main(String[] args) throws IOException{
        String nama = "C:\\Users\\LENOVO\\Documents\\teks.txt";
        
        try{
            FileInputStream a = new FileInputStream(nama);
            Scanner De = new Scanner(a);
            while(De.hasNextLine()){
                String b = De.nextLine();
                System.out.println(b);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
