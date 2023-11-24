package Day46;

public class Day46_ {

    public static void main(String[] args) {
        String kata = "Dazai";
        System.out.println(kata);
        printAddress("kata 1", kata);
        System.out.println("huruf ketiga: " + kata.charAt(2));
        
        kata = "De" + kata.substring(2, 5);
        System.out.println("di ganti secara tidak lansung: "+kata);
        printAddress("kata", kata);
       

    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama+" = "+ data +" || addres= "+ Integer.toHexString(address) );
    }

    

}
