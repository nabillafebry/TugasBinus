package personal.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilanganKuadrat {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            System.out.println("MENGHITUNG HASIL KUADRAT");
            System.out.print("Angka 1 : ");
            int angka1 = Integer.parseInt(reader.readLine());
            System.out.print("Angka 2 : ");
            int angka2 = Integer.parseInt(reader.readLine());

            int hasil1 = (int) Math.pow(angka1, 2);
            int hasil2 = (int) Math.pow(angka2, 2);

            System.out.print("Hasil kuadrat dari " + angka1 + " dan " + angka2 + " adalah " + hasil1 + " dan " + hasil2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
