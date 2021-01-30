import java.text.DecimalFormat;

public class Alturas {
    public static void main(String[] arg) {
        double[] alturas = new double[10];

        alturas = rellenar();

        alturaMedia(alturas);
        mayorAltura(alturas);
        menorAltura(alturas);
    }

    public static double[] rellenar() {
        double[] n = new double[10];

        for (int i = 0; i <= 9; i++) {
            n[i] = Math.random() * 2.5 + 1;
        }

        return n;
    }

    public static void alturaMedia(double[] n) {
        DecimalFormat df = new DecimalFormat("#.00");
        double cont = 0;
        int menorDeLaMedia = 0;
        int mayorDeLaMedia = 0;

        for (int i = 0; i < n.length; i++) {
            cont = cont + n[i];
        }

        double media = cont / n.length;

        System.out.println("La altura media es: " + df.format(media));

        for (int i = 0; i < n.length; i++) {
            if (n[i] > media) {
                mayorDeLaMedia++;
            } else {
                menorDeLaMedia++;
            }
        }

        System.out.println("Alturas por encima de la media: " + mayorDeLaMedia + "\nAlturas por debajo de la media: "
                + menorDeLaMedia);

    }

    public static void mayorAltura(double[] n) {
        DecimalFormat df = new DecimalFormat("#.00");
        double cont = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > cont) {
                cont = n[i];
            }
        }

        System.out.println("La altura mas alta es: " + df.format(cont));
    }

    public static void menorAltura(double[] n) {
        DecimalFormat df = new DecimalFormat("#.00");
        double cont = 10;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < cont) {
                cont = n[i];
            }
        }

        System.out.println("La altura mas baja es: " + df.format(cont));
    }
}