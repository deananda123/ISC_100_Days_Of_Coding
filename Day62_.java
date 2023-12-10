package Day62;
public class Day62_ {
    public static void main(String[] args) {
        StringBuilder kalimat =  new StringBuilder ("capek");
        p(kalimat);
    }
    static void p (StringBuilder data){
        System.out.println(data);
        System.out.println("panjang: "+ data.length());
        System.out.println("kapsitas: "+data.capacity());
        System.out.println("karakter ke 3: "+ data.charAt(2));
        
        int addres = System.identityHashCode(data);
        System.out.println("addres: "+ Integer.toHexString(addres));
    }
}
