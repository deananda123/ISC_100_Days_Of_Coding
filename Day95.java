package Day95;

import java.util.*;
public class Day95 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        Queue<Integer> data = new LinkedList();
        System.out.println("batas: ");
        int a = De.nextInt();
        Random b = new Random();
        for (int i = 0; i < a; i++) {
            
            int c = b.nextInt(a);
            data.offer(c);
            
        }
        
        int f = data.poll();
        System.out.println("Baris pertama telah keluar, apa anda ingin mengeluarkan baris lain? y/n");
        String g = De.next();
        if(g.equals("y")){
            System.out.println("Mengeluarka Baris lainnya: "+ data.poll());
        }else{
            System.out.println("");
        }
        System.out.println("Apakah baris kosong? ");
        boolean d = data.isEmpty();
        if (d == true){
            System.out.println("Kosong");
        }else if (d == false){
            for (int i = 0; i < data.size(); i++) {
                int e = data.poll();
                f+=e;
            }
            System.out.println(f);
        }

    }

}
