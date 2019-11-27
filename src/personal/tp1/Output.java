package personal.tp1;

public class Output {

    public static void main(String[] args) {
        int A = 10, B = 2, C = 4;
        int D = A & B + A++ * C;
        System.out.println("Nilai D = " + D);
        D = ++A % B | C;
        System.out.println("Nilai D = " + D);
        D = A++ % B-- * ++C;
        System.out.println("Nilai D = " + D);
        D = C & B / A;
        System.out.println("Nilai D = " + D);

    }
}
