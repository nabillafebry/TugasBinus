package kelompok.tk1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KonversiBerat {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        try {
            System.out.println("KONVERSI BERAT");
            System.out.print("Masukkan jumlah kilogram yang akan dikonversi : ");
            int input = Integer.parseInt(reader.readLine());

            int pon = input * 2;
            int ons = pon * 5;
            int gram = ons * 100;

            System.out.print(input + " kg sama dengan = " + pon + " pon atau " + ons + " ons atau " + gram + " gram");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
