package personal.tp2;


import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        String[] array1 = {"Apel", "Anggur", "Jeruk", "Semangka"};
        String[] arraycopy = array1.clone();

        // converting array to string
        System.out.println("array 1 = " + Arrays.toString(array1));
        System.out.println("arraycopy = " + Arrays.toString(arraycopy));

    }
}
