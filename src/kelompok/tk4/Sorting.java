package kelompok.tk4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {

    private static int tampilanAwal() {
        Scanner reader = new Scanner(System.in);
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");

        System.out.print("Masukkan pilihan Anda : ");
        int menu = reader.nextInt();

        return menu;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println("Selamat Datang di program simulasi");
        System.out.println("Menu");

        int menu = tampilanAwal();
        List listRandom = new ArrayList();
        boolean done = false;
        do {
            if (menu == 1) {
                if (listRandom.size() > 0) {
                    listRandom = new ArrayList();
                }
                System.out.print("Batas bawah : ");
                int angka1 = Integer.parseInt(reader.readLine());
                System.out.print("Batas atas : ");
                int angka2 = Integer.parseInt(reader.readLine());

                for (int i = 0; i < 5; i++) {
                    int random = (int) (Math.random() * (angka2 - angka1) + angka1);
                    listRandom.add(random);
                }
                for (int i = 0; i < listRandom.size(); i++) {
                    System.out.print(listRandom.get(i) + " ");
                }
                System.out.println();
                System.out.println("-----------------------------");
                menu = tampilanAwal();
            } else if (menu == 2) {
                //bubble asc
                bubbleAsc(listRandom);
                System.out.println();
                System.out.println("-----------------------------");
                menu = tampilanAwal();
            } else if (menu == 3) {
                //selection asc
                selectionAsc(listRandom);
                System.out.println();
                System.out.println("-----------------------------");
                menu = tampilanAwal();
            } else if (menu == 4) {
                //bubble desc
                bubbleDesc(listRandom);
                System.out.println();
                System.out.println("-----------------------------");
                menu = tampilanAwal();
            } else if (menu == 5) {
                //selection desc
                selectionDesc(listRandom);
                System.out.println();
                System.out.println("-----------------------------");
                menu = tampilanAwal();
            } else if (menu == 6) {
                System.exit(0);
            }
        } while (!done);
    }

    private static void bubbleAsc(List listRandom) {
        //bubble asc
        System.out.println("BUBBLE SORT ASCENDING :");
        System.out.print(listRandom);

        List listforsort = new ArrayList();
        for (int i = 0; i < listRandom.size(); i++) {
            listforsort.add(listRandom.get(i));
        }

        for (int i = (listforsort.size() - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int x = (int) listforsort.get(j);
                int y = (int) listforsort.get((j + 1));
                if (x > y) {
                    int temp = (int) listforsort.get((j + 1));

                    listforsort.set((j + 1), listforsort.get(j));
                    listforsort.set(j, temp);
                    System.out.println();
                    System.out.print(listforsort);
                }
            }
        }
    }

    private static void selectionAsc(List listRandom) {
        System.out.println("SELECTION SORT ASCENDING :");
        System.out.print(listRandom);

        List listforsort = new ArrayList();
        for (int i = 0; i < listRandom.size(); i++) {
            listforsort.add(listRandom.get(i));
        }

        for (int i = 0; i < listforsort.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < listforsort.size(); j++) {
                int x = (int) listforsort.get(j);
                int y = (int) listforsort.get(index);
                if (x < y) {
                    index = j;
                }
            }
            int smallerNumber = (int) listforsort.get(index);
            listforsort.set(index, listforsort.get(i));
            listforsort.set(i, smallerNumber);

            System.out.println();
            System.out.print(listforsort);
        }
    }

    private static void bubbleDesc(List listRandom) {
        System.out.println("BUBBLE SORT ASCENDING :");
        System.out.print(listRandom);

        List listforsort = new ArrayList();
        for (int i = 0; i < listRandom.size(); i++) {
            listforsort.add(listRandom.get(i));
        }

        for (int i = (listforsort.size() - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int x = (int) listforsort.get(j);
                int y = (int) listforsort.get((j + 1));
                if (x < y) {
                    int temp = (int) listforsort.get((j + 1));
                    listforsort.set((j + 1), listforsort.get(j));
                    listforsort.set(j, temp);
                    System.out.println();
                    System.out.print(listforsort);
                }
            }
        }
    }

    private static void selectionDesc(List listRandom) {
        System.out.println("SELECTION SORT ASCENDING :");
        System.out.print(listRandom);

        List listforsort = new ArrayList();
        for (int i = 0; i < listRandom.size(); i++) {
            listforsort.add(listRandom.get(i));
        }

        for (int i = 0; i < listforsort.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < listforsort.size(); j++) {
                int x = (int) listforsort.get(j);
                int y = (int) listforsort.get(index);
                if (x > y) {
                    index = j;
                }
            }
            int smallerNumber = (int) listforsort.get(index);
            listforsort.set(index, listforsort.get(i));
            listforsort.set(i, smallerNumber);

            System.out.println();
            System.out.print(listforsort);
        }

    }

}
