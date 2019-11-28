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

    //loop
//    for (int i = 0; i < array1.length; ++i) {
//        arraycopy[i] = array1[i];
//    }

    //arraycopy
//    System.arraycopy(array1, 0, arraycopy, 0, array1.length);
    // srcPos = posisi awal dari array1, destPos = posisi awal arraycopy

    //clone
//    String[] array1 = {"Apel", "Anggur", "Jeruk", "Semangka"};
//    String[] arraycopy = array1.clone();
}
