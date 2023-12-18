package Day70;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day70_ {

    public static void main(String[] args) throws IOException {
        FileReader r;
        BufferedReader br;
        try {
            r = new FileReader("C:\\Users\\LENOVO\\Documents\\teks.txt");
            br = new BufferedReader(r);
            
            String line;
            while((line = br.readLine())!= null){
            System.out.println(line);
        }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
