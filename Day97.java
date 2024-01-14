package Day97;

import java.util.*;

public class Day97 {

    public static void main(String[] args) {
        Scanner De = new Scanner(System.in);
        HashSet<Integer> Nilai = new HashSet<>();

        boolean c = true;
        while (c) {
            System.out.print("Batas: ");
            int a = De.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.print("Nilai: ");
                int b = De.nextInt();

                Nilai.add(b);
            }
            System.out.println(Nilai);
            System.out.println("Ingin membersihkan HashSet? y/n");
            String e = De.next();
            if (e.equalsIgnoreCase("y")) {
                Nilai.clear();
                System.out.println(Nilai);
                System.out.println("Ingin Mengisi Lagi? y/n");
                String d = De.next();

                if (d.equalsIgnoreCase("y")) {
                    continue;
                } else {

                    c = false;
                }

            } else {
                System.out.println("\tMenu\t");
                System.out.println("1.Apakah HashSet kosong? ");
                System.out.println("2.Berapa size HashSet? ");
                System.out.println("3.Rata-Rata HashSet");
                int f = De.nextInt();

                switch (f) {
                    case 1:
                        System.out.println("Apakah HashSet Kosong? " + Nilai.isEmpty());
                        break;
                    case 2:
                        System.out.println("Berapa Size HashSet? " + Nilai.size());
                        break;
                    case 3:

                        int h = Nilai.hashCode();
                        h /= Nilai.size();
                        System.out.println(h);

                        break;
                }
                System.out.println("Apakah ingin meengulang? y/n");
                String g = De.next();
                if (g.equalsIgnoreCase("y")) {
                    Nilai.clear();

                } else {
                    c = false;
                }
            }

        }
    }

}
