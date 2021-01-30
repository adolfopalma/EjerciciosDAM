import java.util.Scanner;

public class Notas {
    public static void main(String[] arg) {
        double[] notas = new double[10];

        notas = rellenar();

        notaMedia(notas);
        notaAlta(notas);
        notaBaja(notas);
    }

    public static double[] rellenar() {
        double[] n = new double[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Introduce nota en la posición: " + i);
            n[i] = in.nextDouble();
        }

        return n;
    }

    public static void notaMedia(double[] n) {
        double cont = 0;
        for (int i = 0; i < n.length; i++) {
            cont = cont + n[i];
        }

        System.out.println("La nota media es: " + cont / n.length);
    }

    public static void notaAlta(double[] n) {
        double cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > cont) {
                cont = n[i];
            }
        }

        System.out.println("La nota mas alta es: " + cont);
    }

    public static void notaBaja(double[] n) {
        double cont = 10;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < cont) {
                cont = n[i];
            }
        }

        System.out.println("La nota mas baja es: " + cont);
    }
}