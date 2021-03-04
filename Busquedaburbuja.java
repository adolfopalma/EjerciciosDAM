import java.util.Arrays;
import java.util.Scanner;
public class Busquedaburbuja {
    public static void main(String[] args) {
        int vector[];
        int tamanio;
        tamanio=tamanioArray();
        vector=new int[tamanio];
        vector = rellenarNumeros(tamanio);
        visualizarVector(vector);
        vector = ordenacionBurbuja(vector);
        visualizarVector(vector);
    }

    public static int tamanioArray(){
        Scanner entrada=new Scanner(System.in);
        int tamanio;
        
        System.out.println("Introduce tamaño de tu Array ");
        tamanio=entrada.nextInt();

        return tamanio;
    }

    public static void visualizarVector(int vector[]){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] rellenarNumeros(int tamanio) {
        int numerosAleatorios[] = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 100);
        }

        return numerosAleatorios;
    }

    public static int[] ordenacionBurbuja(int vector[]){
        int i, j, aux;

        for(i=0; i <vector.length-1; i++){
            for(j=0; j< vector.length-1; j++){
                if(vector[j + 1] < vector[j]){
                    aux = vector[j +1];
                    vector[j + 1]=vector[j];
                    vector[j]=aux;
                }
            }
        }

        return vector;
    }
}
