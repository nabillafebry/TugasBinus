package kelompok.tk2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class KlasifikasiFilm {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.print("Masukkan Nama Anda : ");
        String nama = reader.readLine();
        boolean valid = false;
        int tahunlahir;
        do {
            System.out.print("Masukkan Tahun Lahir Anda : ");
            tahunlahir = Integer.parseInt(reader.readLine());

            //validasi format tahun
            if (String.valueOf(tahunlahir).length() != 4) {
                System.out.println("Format Tahun Salah");
            } else {
                valid = true;
            }
        } while (!valid);

        //get current year
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);

        int year = cal.get(Calendar.YEAR);
        int umur = year - tahunlahir;

        if (umur < 13) {
            System.out.println("Adik " + nama + ", berusia " + umur +
                    " tahun, hanya dapat menonton film dengan Klasifikasi SU");
        }
        if (umur >= 13 && umur < 17) {
            System.out.println(nama + ", Anda berusia " + umur +
                    " tahun, dapat menonton film dengan Klasifikasi SU dan 13+");
        }
        if (umur >= 17 && umur < 21) {
            System.out.println(nama + ", Anda berusia " + umur +
                    " tahun, dapat menonton film dengan Klasifikasi SU, 13+ dan 17+");
        }
        if (umur >= 21) {
            System.out.println(nama + ", Anda berusia " + umur +
                    " tahun, dapat menonton film dengan Klasifikasi SU, 13+, 17+, dan 21+");
        }
    }

}
