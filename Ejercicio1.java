import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, resultado, opcion = 1;

        while (opcion != 5 && opcion < 5 && opcion > 0) {
            System.out.println("1 sumar");
            System.out.println("2 restar");
            System.out.println("3 multiplicar");
            System.out.println("4 dividir");
            System.out.println("5 salir");
            System.out.println("Eliga una opcion");
            opcion = entrada.nextInt();

            if (opcion != 5 && opcion < 5 && opcion > 0) {
                System.out.println("introduce el primer numero");
                num1 = entrada.nextInt();
                System.out.println("introduce el segundo numero");
                num2 = entrada.nextInt();

                if (opcion == 1) {
                    resultado = num1 + num2;
                    System.out.println("el resultado es " + resultado);
                }
                if (opcion == 2) {
                    resultado = num1 - num2;
                    System.out.println("el resultado es " + resultado);
                }
                if (opcion == 3) {
                    resultado = num1 * num2;
                    System.out.println("el resultado es " + resultado);
                }
                if (opcion == 4) {
                    resultado = num1 / num2;
                    System.out.println("el resultado es " + resultado);
                }
            }
        }
    }
}