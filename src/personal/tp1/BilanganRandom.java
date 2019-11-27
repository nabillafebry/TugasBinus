package personal.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilanganRandom {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            System.out.println("BILANGAN RANDOM");
            System.out.print("Angka 1 : ");
            int angka1 = Integer.parseInt(reader.readLine());
            System.out.print("Angka 2 : ");
            int angka2 = Integer.parseInt(reader.readLine());

            int hasil = getRandom(angka2, angka1);
            int hasilganjil = hasil + 1;

            if (hasil % 2 == 0) {
                System.out.print("Hasil Random Bilangan genap : " + hasil);
            } else {
                System.out.print("Hasil Random Bilangan ganjil : " + hasilganjil);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getRandom(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }
}
