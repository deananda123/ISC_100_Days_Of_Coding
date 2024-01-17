package Day100;

import java.util.*;

public class Day100 {
     private static Map<String, String> crud = new HashMap<>();

    public static void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kunci data: ");
        String key = scanner.nextLine();
        System.out.print("Masukkan nilai data: ");
        String value = scanner.nextLine();
        crud.put(key, value);
        System.out.println("Data berhasil ditambahkan.");
    }

    public static void updateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kunci data yang ingin diperbarui: ");
        String key = scanner.nextLine();
        if (crud.containsKey(key)) {
            System.out.print("Masukkan nilai data baru: ");
            String ValueBaru = scanner.nextLine();
            crud.put(key, ValueBaru);
            System.out.println("Data berhasil diperbarui.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public static void deleteData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kunci data yang ingin dihapus: ");
        String key = scanner.nextLine();
        if (crud.containsKey(key)) {
            crud.remove(key);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public static void displayData() {
        if(crud.isEmpty()){
            System.out.println("Kosong");
        }else{
            System.out.println("Data saat ini:");
        for (Map.Entry<String, String> entry : crud.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        }
    }
    public static void main(String[] args) {
        Scanner De = new Scanner (System.in);
        boolean c = true;
        while (c){
            System.out.println("\nMenu");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            
            
            System.out.println("\nPilih menu berdasarkan angka");
            int a = De.nextInt();
            
            switch(a){
                case 1:
                    System.out.println("Insert Data");
                    insertData();
                    break;
                case 2:
                    System.out.println("Update Data");
                    updateData();
                    break;
                case 3:
                    System.out.println("Delete Data");
                    deleteData();
                    break;
                case 4:
                    System.out.println("Display Data");
                    displayData();
                    break;
                
                default:
                    System.out.println("Pilihan tidak falid\nSilahkan pilih sesuai menu");
            }
            System.out.println("Ingin memilih lagi? y/n");
            String b = De.next();
            c = b.equalsIgnoreCase("y")? true:false;
        }
        
    }
    
}
