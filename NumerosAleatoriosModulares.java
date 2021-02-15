import java.util.Scanner;

public class NumerosAleatoriosModulares {
    public static void main(String[] arg) {
        int[] numerosAleatorios = new int[10];
        int posicion;

        numerosAleatorios = rellenarNumeros(numerosAleatorios);
        posicion = pidePosicion();
        devuelvePosición(numerosAleatorios, posicion);
        sumaValores(numerosAleatorios);
    }

    public static int[] rellenarNumeros(int[] numerosAleatorios) {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 10);
        }

        return numerosAleatorios;
    }

    public static int pidePosicion() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce el numero de la posicion que quieres saber: ");
        n = sc.nextInt();

        return n;
    }

    public static void devuelvePosición(int[] numerosAleatorios, int n) {
        int nPosicion = numerosAleatorios[n];

        System.out.println("En la posición  " + n + " esta el valor: " + nPosicion);
    }

    public static void sumaValores(int[] numerosAleatorios) {
        int suma = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            suma = suma + numerosAleatorios[i];
            System.out.println("Posición: " + i + ": " + numerosAleatorios[i]);
        }

        System.out.println("La suma de los valores de todas las posiciones es: " + suma);
    }
}