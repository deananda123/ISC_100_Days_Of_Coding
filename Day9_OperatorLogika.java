package day9_operatorlogika;

public class Day9_OperatorLogika {

    public static void main(String[] args) {
        //operator logika
        boolean dea = true;
        boolean dezz = false;
        
        boolean nanda = dea && dezz;
        System.out.println("hasil 1: " +nanda);
        nanda = dea || dezz;
        System.out.println("hasil 2: "+nanda);
        nanda = !dea;
        System.out.println("hasil 3: "+nanda);
        nanda = !dezz;
        System.out.println("hasil 4: "+nanda);
        nanda= dezz || dea && dea || !dezz;
        System.out.println("hasil 5: "+nanda);
        nanda= dezz || !dea;
        System.out.println("hasil 6: "+nanda);
        nanda = !dezz || !dea;
        System.out.println("hasil 7: "+nanda);

    }

}
