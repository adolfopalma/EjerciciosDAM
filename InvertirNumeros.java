jimport java.util.Scanner;

public class InvertirNumeros {

    public static void main(String[] args) {
        int size = sizeArray();
        int[] numerosAleatorios = new int[size];
        int[] numerosAleatoriosInvertidos = new int[size];

        numerosAleatorios = rellenar(size);
        numerosAleatoriosInvertidos = rellenarNumerosInvertidos(numerosAleatorios);

        System.out.println("Numeros aleatorios ");
        visualiza(numerosAleatorios);
        System.out.println("numeros aleatorios invertidos");
        visualiza(numerosAleatoriosInvertidos);

    }

    public static int sizeArray() {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Introduce el tamaño del array de numeros aleatorios ");
        size = sc.nextInt();

        return size;
    }

    public static int[] rellenar(int size) {
        int[] n = new int[size];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100 + 1);
        }

        return n;
    }

    public static int[] rellenarNumerosInvertidos(int[] n) {
        int[] aux = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            aux[i] = n[n.length - 1 - i];
        }

        return aux;
    }

    public static void visualiza(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}