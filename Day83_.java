package Day83;

import java.util.ArrayList;

class biodata {

    private String nama;
    private int umur;

    public biodata(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;

    }
}

public class Day83_ {

    public static void main(String[] args) {
        ArrayList<biodata> a = new ArrayList<>();

        a.add(new biodata("deananda ",18));
        a.add(new biodata("nanda ",17));

        for (int i = 0; i < a.size(); i++) {
            System.out.println("nama: " + a.get(i).getNama() +"\t||\t"+"Umur:"+ a.get(i).getUmur());
        }
    }
}
