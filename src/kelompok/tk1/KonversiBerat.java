package kelompok.tk1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KonversiBerat {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("KONVERSI BERAT");
        System.out.print("Masukkan jumlah kilogram yang akan dikonversi : ");
        double input = reader.nextDouble();

        double pon = input * 2;
        double ons = pon * 5;
        double gram = ons * 100;

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print(df.format(input) + " kg sama dengan = " + df.format(pon) + " pon atau " +
                df.format(ons) + " ons atau " + df.format(gram) + " gram");
    }
}
