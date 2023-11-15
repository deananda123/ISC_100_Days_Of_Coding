package Day37;
import java.util.Arrays;
public class Day37_ {
    public static void main(String[] args) {
        int []x={1,2,3,4,8};
        int []y = new int [5];
        System.out.println("====MONGKOPI ARRAY DENGAN LOOP====");
        for (int i = 0; i < x.length; i++) {
            y [i]=x[i];
        }
        printArray(x);
        printArray(y);
        
        System.out.println("====FILL ARRAY====");
        int [] z = new int[5];
        printArray(z);
        Arrays.fill(z, 5);
        printArray(z);
        
        
                
    }
    private static void printArray(int[]x){
        System.out.println("array: "+Arrays.toString(x));
}
    
}
