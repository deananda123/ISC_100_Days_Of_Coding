package Day93;

import java.util.*;

public class Day93 {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        
        a.offer(10);
        a.offer(1);
        a.offer(65);
        a.offer(12);
        System.out.println(a);
        int b = a.poll();
        System.out.println("poll: "+b);
        System.out.println("peek: "+a.peek());
        System.out.println(a);
        
        a.remove(1);
        System.out.println(a);
        System.out.println("Apakah Queue kosong? "+a.isEmpty());
        
    }
    
}
