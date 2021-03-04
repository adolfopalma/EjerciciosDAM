import java.util.Scanner;

public class SumaDeMatrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int guardaFila = introduceFila(entrada);
        int guardaColumna = introduceColumna(entrada);
        int[][] matriz1 = new int[guardaFila][guardaColumna];
        int[][] matriz2 = new int[guardaFila][guardaColumna];
        int[][] suma = new int[guardaFila][guardaColumna];

        matriz1 = rellenaMatriz(guardaFila, guardaColumna);
        matriz2 = rellenaMatriz(guardaFila, guardaColumna);
        suma = sumaMatrices(matriz1, matriz2);

        visualiza(matriz1);
        visualiza(matriz2);
        visualiza(suma);
    }

    public static int[][] rellenaMatriz(int f, int c) {
        int[][] matriz = new int[f][c];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        return matriz;
    }

    public static int introduceFila(Scanner entrada) {
        int fila;
        System.out.println("introduce el tamaño de las filas ");
        fila = entrada.nextInt();

        return fila;
    }

    public static int introduceColumna(Scanner entrada) {
        int columna;
        System.out.println("introduce el tamaño de las columnas ");
        columna = entrada.nextInt();

        return columna;
    }

    public static void sumaMatrices(int[][] matriz1, int[][] matriz2) {

    }

    public static void visualiza(int[][] matriz) {

    }
}