package Day72;

import java.io.FileInputStream;
import java.io.IOException;



public class Day72 {
    public static void main(String[] args) throws IOException {
        long start, finish;
      FileInputStream x = new FileInputStream("C:\\Users\\LENOVO\\Documents\\hm.txt");
        System.out.println(x.available());
        
        start = System.nanoTime();
        System.out.println(x.readAllBytes());
        finish= System.nanoTime();
        System.out.println("waktu: "+(finish-start));
        x.close();
        
             
             
         
        
    }
    
}
