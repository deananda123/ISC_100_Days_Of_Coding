package Day48;

public class Day48_ {

    public static void main(String[] args) {
        int x,y;
        x = 3;
        y= f(x);
        System.out.println("x = "+x+" &  y ="+y);
        
        
        x = 2;
        y= f(x);
        System.out.println("x = "+x+" &  y ="+y);
        
        
        x = 5;
        y= f(x);
        System.out.println("x = "+x+" &  y ="+y);

    }

    static int f(int input) {
        int hasil;

        hasil = (input % 2) * input;
        return hasil;

    }

}
