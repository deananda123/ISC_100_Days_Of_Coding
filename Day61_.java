package Day61;
public class Day61_ {
    public static void main(String[] args) {
        StringBuilder kalimat = new StringBuilder("affa iya?");
        p(kalimat);
        
        kalimat.append(" iya lah");
        p(kalimat);
        
        kalimat.insert(8, " bang");
       p(kalimat);
       
       kalimat.delete(1, 4);
       p(kalimat);
        
    }
    static void p (StringBuilder data){
        System.out.println("data: "+ data);
        System.out.println("panjang: "+ data.length());
        System.out.println("kapasitas: "+data.capacity());
        
        int address = System.identityHashCode(data);
        System.out.println("Address: "+ Integer.toHexString(address));
    }
}
