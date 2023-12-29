package day1_ngoding;
import java.util.*;
class Buah{
        private String buah;
        private int a;
        public Buah(String buah, int a){
            this.buah = buah;
            this.a = a;
        }
        public static String getBuah(String buah) {
            return buah;
        }

        public static int getA(int a) {
            return a;
        }        
    }
public class Day82_ArrayList {
    public static void main(String[] args) {
        ArrayList <Buah> namaBuah = new ArrayList<>();
        namaBuah.add(new Buah("Mangga", 9));
        namaBuah.add(new Buah("Jeruk", 7));
        namaBuah.add(new Buah("Apel", 1));
        namaBuah.add(new Buah("Anggur", 2));
        
        for (int i = 0; i < namaBuah.size(); i++) {
            System.out.println(namaBuah.get(i));
        }
    }

}
