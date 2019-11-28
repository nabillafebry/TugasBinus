package personal.tp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PendataanIPS {

    public static void main(String[] args) throws IOException {

        System.out.println("Pendataan dan Perhitungan IPS(Indeks Prestasi Semester)");
        int pilihan = pilihanMenu();

        double jumlahsks = 0;
        double jumlahsksgrade = 0;
        List<DataMatkul> listData = new ArrayList<>();
        boolean valid = true;
        do {
            if (pilihan == 1) {
                int grade = 0;
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader reader = new BufferedReader(isr);
                System.out.println("--- Pendataan Matakuliah ---");
                System.out.print("Masukkan Jumlah Matakuliah : ");
                int jumlahmatkul = Integer.parseInt(reader.readLine());

                DataMatkul dataMatkul = new DataMatkul();
                dataMatkul.setJumlahmatkul(jumlahmatkul);
                for (int i = 0; i < dataMatkul.getJumlahmatkul(); i++) {
                    DataMatkul datamenu = new DataMatkul();

                    System.out.print("Masukkan Kode Matakuliah : ");
                    String kodematkul = reader.readLine();
                    System.out.print("Masukkan Nama Matakuliah : ");
                    String namamatkul = reader.readLine();

                    //validasi grade
                    boolean done = false;
                    do {
                        System.out.print("Masukkan Grade Matakuliah : ");
                        String gradematkul = reader.readLine();
                        //panggil method validasi
                        if (validateGrade(gradematkul) == true) {
                            datamenu.setGradematkul(gradematkul);
                            done = true;
                            //konversi grade
                            if (gradematkul.equals("A")) {
                                grade = 4;
                            } else if (gradematkul.equals("B")) {
                                grade = 3;
                            } else if (gradematkul.equals("C")) {
                                grade = 2;
                            } else if (gradematkul.equals("D")) {
                                grade = 1;
                            } else if (gradematkul.equals("E")) {
                                grade = 0;
                            }
                        } else {
                            System.out.println("Grade yang dimasukkan harus berupa A, B, C , D atau E ");
                        }
                    } while (!done);

                    System.out.print("Masukkan Jumlah SKS : ");
                    int jumlahSKS = Integer.parseInt(reader.readLine());

                    //simpan data
                    datamenu.setKodematkul(kodematkul);
                    datamenu.setNamamatkul(namamatkul);
                    datamenu.setJumlahSKS(jumlahSKS);
                    listData.add(datamenu);

                    //simpan jumlah (sks x grade) per matkul
                    int sksgrade = datamenu.getJumlahSKS() * grade;

                    //simpan jumlah sks
                    jumlahsks += datamenu.getJumlahSKS();

                    //simpan jumlah (sks x grade) semua matkul
                    jumlahsksgrade += sksgrade;

                    System.out.println();
                }
                System.out.println("Data Matakuliah berhasil disimpan");
                System.out.println("---------------------------------");
                pilihan = pilihanMenu();
                valid = false;
            } else if (pilihan == 2) {
                if (listData.size() == 0) {
                    System.out.println("Silahkan isi data matakuliah terlebih dahulu");
                    pilihan = pilihanMenu();
                    valid = false;
                } else {
                    //panggil method untuk penghitungan IPS
                    hitungIPS(listData, jumlahsksgrade, jumlahsks);
                    System.out.println();
                    System.out.println("---------------------------------");
                    pilihan = pilihanMenu();
                }
            } else if (pilihan == 3) {
                if (listData.size() == 0) {
                    System.out.println("Silahkan isi data matakuliah terlebih dahulu");
                    pilihan = pilihanMenu();
                    valid = false;
                } else {
                    //panggil method untuk upgrade matkul
                    updateGrade(listData);
                    System.out.println();
                    System.out.println("---------------------------------");
                    pilihan = pilihanMenu();
                }
            } else if (pilihan == 4) {
                System.exit(0);
            } else {
                System.out.println("Pilihan yang anda inputkan tidak tersedia");
                pilihan = pilihanMenu();
                valid = false;
            }
        } while (!valid);

    }

    private static int pilihanMenu() throws IOException {
        int pilihan;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.println("1. Pendataan Matakuliah");
        System.out.println("2. Perhitungan IPS");
        System.out.println("3. Update Grade");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = Integer.parseInt(reader.readLine());
        return pilihan;
    }

    private static boolean validateGrade(String gradematkul) {
        return gradematkul.equals("A") || gradematkul.equals("B") || gradematkul.equals("C") ||
                gradematkul.equals("D") || gradematkul.equals("E");
    }

    private static void hitungIPS(List<DataMatkul> listData, double jumlahsksgrade, double jumlahsks) {
        System.out.println("--- Pehitungan IPS ---");
        System.out.println("Matakuliah yang anda ambil adalah :");

        for (DataMatkul datamenu : listData) {
            System.out.println(datamenu.getKodematkul() + " " +
                    datamenu.getNamamatkul() + "            " +
                    datamenu.getGradematkul() + "           " +
                    datamenu.getJumlahSKS());
        }

        //hitung ips
        double ips = jumlahsksgrade / jumlahsks;
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("Nilai IPS Anda adalah " + format.format(ips));
    }

    private static void updateGrade(List<DataMatkul> listData) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.println("--- Update Grade ---");
        System.out.print("Masukkan Kode Matakuliah : ");
        String kodematkul = reader.readLine();

        boolean done = false;
        do {
            System.out.print("Masukkan Grade Baru : ");
            String newgrade = reader.readLine();
            if (validateGrade(newgrade) == true) {
                for (DataMatkul matkul : listData) {
                    if (matkul.getKodematkul().equals(kodematkul)) {
                        matkul.setGradematkul(newgrade);
                    }
                }
                done = true;
            } else {
                System.out.println("Grade yang dimasukkan harus berupa A, B, C , D atau E ");
            }
        } while (!done);

        for (DataMatkul datamenu : listData) {
            System.out.println(datamenu.getKodematkul() + " " +
                    datamenu.getNamamatkul() + "            " +
                    datamenu.getGradematkul() + "           " +
                    datamenu.getJumlahSKS());
        }
    }
}
