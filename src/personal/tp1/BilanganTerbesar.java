package personal.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilanganTerbesar {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            System.out.println("MENCARI ANGKA TERBESAR");
            System.out.print("Angka 1 : ");
            int angka1 = Integer.parseInt(reader.readLine());
            System.out.print("Angka 2 : ");
            int angka2 = Integer.parseInt(reader.readLine());

            int hasil;
            if (angka1 > angka2) {
                hasil = angka1;
            } else {
                hasil = angka2;
            }
            System.out.print("Angka terbesar : " + hasil);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
