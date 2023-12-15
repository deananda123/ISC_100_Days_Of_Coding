package Day67;

import java.io.FileInputStream;
import java.io.IOException;


public class Day67_ {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fn = new FileInputStream("C:\\Users\\LENOVO\\Documents\\file.txt");
        
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.print((char)fn.read());
        System.out.println((char)fn.read());
    }
    
}
