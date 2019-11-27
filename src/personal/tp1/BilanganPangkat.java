package personal.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilanganPangkat {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            System.out.println("MENGHITUNG HASIL PANGKAT");
            System.out.print("Angka 1 : ");
            int angka1 = Integer.parseInt(reader.readLine());
            System.out.print("Angka 2 : ");
            int angka2 = Integer.parseInt(reader.readLine());

            int hasil = (int) Math.pow(angka1, angka2);
            System.out.print("Hasil dari " + angka1 + " pangkat " + angka2 + " : " + hasil);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
