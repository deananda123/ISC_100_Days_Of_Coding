package Day55;
public class Day55 {
    public static void main(String[] args) {
        int a []= {1, 3, 6, 2, 0,4, 20, -8};
        int min = a[0];
        int max = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]< min){
                min= a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
            
        }
        System.out.println("nilai minimal:"+ min);
        System.out.println("nilai maksimal:"+ max);
    }
    
}
