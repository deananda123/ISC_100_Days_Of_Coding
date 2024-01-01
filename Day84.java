package Day84;

import java.io.*;
import java.util.ArrayList;

public class Day84 {

    public static void main(String[] args) {
       
        ArrayList<String> data = new ArrayList<>();
        data.add("Selamat Tinggal 2023");
        data.add("dan Selamat Datang 2024");
       

        
        MenyimpanData("C:\\Users\\LENOVO\\Documents\\data.txt", data);

  
        ArrayList<String> loadedData =  membacaDataDariFile("C:\\Users\\LENOVO\\Documents\\data.txt");
        System.out.println("Data yang dibaca dari file:");
        for (String line : loadedData) {
            System.out.println(line);
        }
    }

    static void MenyimpanData(String fileName, ArrayList<String> data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String line : data) {
                writer.println(line);
            }
            System.out.println("Data berhasil disimpan ke dalam file " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<String> membacaDataDariFile(String fileName) {
        ArrayList<String> loadedData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                loadedData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedData;
    }

}
