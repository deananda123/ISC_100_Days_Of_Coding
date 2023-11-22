package Day44;

public class Day44_ {

    public static void main(String[] args) {
        double[] data = {4, 3.1, 3, 9, 0.1, 4.2, 2, 1, 7, 9};
        int jml = data.length;
        double x=0;
        for (int i = 0; i < jml; i++) {
            x+=data[i];
            
            
            
            
        }
        double y = x/jml;
        System.out.println("Sum: "+x);
        System.out.println("AVG: "+y);
    }

}
