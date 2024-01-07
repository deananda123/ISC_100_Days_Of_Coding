package Day90;

import java.util.Stack;

public class Day90 {
    public static void main(String[] args) {
        Stack<String> nama = new Stack<>();
        nama.push("dea");
        nama.push("dela");
        nama.push("nanda");
        
        System.out.println(nama);
        
        nama.pop();//mengambil yang paling atas
        System.out.println(nama);
        
        System.out.println("elemen teratas adalah "+ nama.peek());
        
    }
    
}
