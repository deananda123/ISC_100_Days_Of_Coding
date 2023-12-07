package Day59;

public class Day59_ {

    public static void main(String[] args) {
        String kalimat = "dan hanya kepada tuhanmu lah kamu berharap";
        
        System.out.println("\nfuruf ke 4: " + kalimat.charAt(3));
        System.out.println();
        printAddress("kalimat ", kalimat);
        System.out.println("\nmengambil kata dari index 34-42: ");
        String kata = kalimat.substring(34, 42);
        String k = "\nkarena " + kata + " pada manusia adalah seni sederhana untuk pata hati";
        System.out.println();
        printAddress("kalimat", k);

    }

    private static void printAddress(String nama, String data) {
        int addres = System.identityHashCode(data);
        System.out.println(nama + ":" + data + "\t" + "||" + "\t" + "address = " + Integer.toHexString(addres));
    }

}
