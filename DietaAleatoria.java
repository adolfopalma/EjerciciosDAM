import java.util.Scanner;

//Crear un Array de alimentos vegetales,otra Array de Carnes y otra Array de Pescados
//Haz un metodo al que tu le digas un dia de la semana desde teclado y te proponga un alimento vegetal,una carne y un pescado.
//Crear un array de comidas libres aleatorias
//haz un metodo para que si es sabado  ademas de un primero te diga la comida libre 
//haz un metodo para que si es domingo  ademas de mi dieta me ponga un postre
//mete un peso inicial(x)si es mayor de 90 solo tienes un dia libre, y si es menor tienes viernes y sabado.

public class DietaAleatoria{


    public static void main(String []args){
        String[] vegetales = {"lechuga","tomate","canonigos","brocoli","coliflor","mazorca"};
        String[] carnes = {"Pechuga de pollo","entrecotte","lomico","hamburguesa","salchichicas","solomillico"};
        String[] pescados = {"Salmon","lubinica","Boquerones","Calamares","Quisquillas","Langostino Tigre"};
        
        dietaAleatoria(vegetales, carnes, pescados);
    }


    public static void dietaAleatoria(String[]vegetales,String[]carnes,String[]pescados){
        String dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("dime que dia quieres de la dieta");
        dia = entrada.nextLine();
        String vegetal = vegetales[(int)(Math.random()* vegetales.length -1)];
        String carne = carnes[(int)(Math.random()* carnes.length -1)];
        String pescado = pescados[(int)(Math.random()* pescados.length -1)];

        System.out.println("tu dieta para el " + dia + " es de primero " + vegetal + " de segundo " + carne + " y de tercero " + pescado);
    }

}