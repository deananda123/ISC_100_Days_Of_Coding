
package day10_;


public class Day10_ {

    
    public static void main(String[] args) {
        byte x =2;
        byte y;
        byte z;
        String x_bits;
        System.out.println("Operator Bitwise");
        
        System.out.println("hasil; "+ String.format("%8s",Integer.toBinaryString(x)).replace(' ', '0'));
        
        System.out.println("Sift Left");
        y = (byte)(x << 2);
        System.out.println("hasil 2; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        
        System.out.println("Sift Right");
        y = (byte)(x >> 2);
        System.out.println("hasil 3; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        
        System.out.println("Bitwise or (|) ");
        x =4;
        System.out.println("hasil x; "+ String.format("%8s",Integer.toBinaryString(x)).replace(' ', '0'));
        y=2;
        System.out.println("hasil y; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        z = (byte)(x|y);
        System.out.println("hasil 4; "+ String.format("%8s",Integer.toBinaryString(z)).replace(' ', '0'));
        
        System.out.println("Bitwise AND (&) ");
        x =4;
        System.out.println("hasil x; "+ String.format("%8s",Integer.toBinaryString(x)).replace(' ', '0'));
        y=2;
        System.out.println("hasil y; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        z = (byte)(x&y);
        System.out.println("hasil 5; "+ String.format("%8s",Integer.toBinaryString(z)).replace(' ', '0'));
        
        System.out.println("Bitwise Xor ");
        x =4;
        System.out.println("hasil x; "+ String.format("%8s",Integer.toBinaryString(x)).replace(' ', '0'));
        y=2;
        System.out.println("hasil y; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        z = (byte)(x^y);
        System.out.println("hasil 6; "+ String.format("%8s",Integer.toBinaryString(z)).replace(' ', '0'));
        
        System.out.println("Bitwise NOt (~)");
        x =4;
        y=(byte)(~x);
        System.out.println("hasil 7; "+ String.format("%8s",Integer.toBinaryString(y)).replace(' ', '0'));
        
    }
    
}
