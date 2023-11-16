package Day38;

import java.util.Arrays;

public class Day38_ {
    public static void main(String[] args) {
        int [][] array_38 = {{1,2,3,4,5},{10, 11, 12, 13, 14, 15}};
        printArray38(array_38);
        
        int [][] arrayY = new int [5][10];
        printArray38(arrayY);
        
        for (int i = 0; i < arrayY.length; i++) {
            for (int j = 0; j < arrayY[i].length; j++) {
                System.out.print(arrayY[i][j]); 
            }
            System.out.print("\n");
            
        }
    }
    private static void printArray38(int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
        
}
    
}
