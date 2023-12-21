package Day73;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Day73 {
    public static void main(String[] args) throws  IOException{
        FileInputStream file1 = new FileInputStream("C:\\Users\\LENOVO\\Documents\\file1.txt");
        FileReader file2 = new FileReader("C:\\Users\\LENOVO\\Documents\\file1.txt");

        FileOutputStream output = new FileOutputStream("output.txt");
        FileWriter output2 = new FileWriter("output.txt");

        int a = file1.read();
        while (a != -1) {
            System.out.print((char) a);
            output.write(a);
            a = file1.read();
        }
        System.out.println();
        a = file2.read();
        while (a != -1) {
            System.out.print((char) a);
            output.write(a);
            a = file2.read();
        }
        file1.close();
        file2.close();
        output.close();
        output2.close();
    }
   
}
