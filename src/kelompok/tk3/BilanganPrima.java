package kelompok.tk3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BilanganPrima {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println("Menu hari ini : ");
        System.out.println("1. Penjumlahan bilangan prima");
        System.out.println("2. Jumlah bilangan prima");
        System.out.println("3. Exit");

        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(reader.readLine());
        String menu;


        if (pilihan == 1) {
            menu = "menu1";
            input(menu);

        } else if (pilihan == 2) {
            menu = "menu2";
            input(menu);

        } else if (pilihan == 3) {
            System.exit(0);
        }

    }

    private static List cariBilanganPrima(int bil1, int bil2) {
        int i = 0;
        int num = 0;
        String bilprima = "";
        int penjumlahanprima = 0;
        int jumlahbilprima = 0;

        List listPrima = new ArrayList();

        for (i = bil1; i <= bil2; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                bilprima = bilprima + i + " ";
                penjumlahanprima += i;
                jumlahbilprima += 1;
            }
        }

        listPrima.add(bilprima);
        listPrima.add(penjumlahanprima);
        listPrima.add(jumlahbilprima);

        return listPrima;
    }

    private static void input(String menu) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        int bil1, bil2;
        boolean valid = false;
        do {
            System.out.print("Masukkan Bilangan 1 : ");
            bil1 = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Bilangan 2 : ");
            bil2 = Integer.parseInt(reader.readLine());

            //validasi bilangan
            if (bil1 < 0 || bil2 < 0) {
                System.out.println("Bilangan harus berupa bilangan positif");
            } else {
                valid = true;
            }
        } while (!valid);

        String bilprima = (String) cariBilanganPrima(bil1, bil2).get(0);

        if (menu.equals("menu1")) {
            int penjumlahanprima = (int) cariBilanganPrima(bil1, bil2).get(1);
            System.out.println("Bilangan prima antara " + bil1 + " dan " + bil2 + " adalah : ");
            System.out.println(bilprima);
            System.out.println("Penjumlahan bilangan prima adalah = " + penjumlahanprima);
        } else {
            int jumlahbilprima = (int) cariBilanganPrima(bil1, bil2).get(2);
            System.out.println("Bilangan prima antara " + bil1 + " dan " + bil2 + " adalah : ");
            System.out.println(bilprima);
            System.out.println("Banyaknya bilangan prima adalah = " + jumlahbilprima);
        }

    }


}
