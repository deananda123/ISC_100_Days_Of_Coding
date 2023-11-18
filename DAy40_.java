package Day40;

public class DAy40_ {

    public static void main(String[] args) {
        int x = 0;
        int y = 100;
        double avg;

        for (int i = 0; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                x += i;
            } else if (i < (y - 1)) {
                System.out.print(" + ");
            } 
        }
        
        System.out.println("\nSUM: "+x);
        avg = x/y;
        System.out.println("AVG: "+avg);
    }

}
