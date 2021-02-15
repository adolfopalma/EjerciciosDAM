import java.util.Scanner;

//Crear un Array de alimentos vegetales,otra Array de Carnes y otra Array de Pescados
//Haz un metodo al que tu le digas un dia de la semana desde teclado y te proponga un alimento vegetal,una carne y un pescado.
//Crear un array de comidas libres aleatorias
//haz un metodo para que si es sabado  ademas de un primero te diga la comida libre 
//haz un metodo para que si es domingo  ademas de mi dieta me ponga un postre
//mete un peso inicial(x)si es mayor de 90 solo tienes un dia libre, y si es menor tienes viernes y sabado.
//
public class DietaAleatoria{
    public static void main(String []args){
        String[] vegetales = {"Cogollicos con Ajos","Tomate con Melva","Canonigos","Brocoli","Coliflor","Mazorca"};
        String[] carnes = {"Pechuga de pollo","entrecotte","lomico","hamburguesa","salchichicas","solomillico"};
        String[] pescados = {"Salmon","lubinica","Boquerones","Calamares","Quisquillas","Langostino Tigre"};
        String[] comidaLibre = {"McDonald´s","PadThai","KFC","FosterHollywood","BurguerKing","Telepizza"};
        String[] postres = {"Flan con Nata","Helaico","Tarta de whisky","Brownie","Pankake con Nutella"};
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

       // dietaAleatoria(vegetales, carnes, pescados, comidaLibre, postres);
        dietaSemana(semana, vegetales, carnes, pescados);
    }

<<<<<<< HEAD
    public static void dietaAleatoria(String[]vegetales,String[]carnes,String[]pescados){
=======

    public static void dietaAleatoria(String[]vegetales, String[]carnes, String[]pescados, String[]comidaLibre, String[]postres){
>>>>>>> c83e4ab15b5dab66f15fe634c7e7696e8d5a61fb
        String dia;
        String vegetal = vegetales[(int)(Math.random()* vegetales.length -1)];
        String carne = carnes[(int)(Math.random()* carnes.length -1)];
        String pescado = pescados[(int)(Math.random()* pescados.length -1)];
        String libre = comidaLibre[(int)(Math.random()* comidaLibre.length -1)];
        String postre = postres[(int)(Math.random()* comidaLibre.length -1)];
        Scanner entrada = new Scanner(System.in);
        int peso;

        System.out.println("dime que dia quieres de la dieta");
        dia = entrada.nextLine();
        System.out.println("dime tu peso");
        peso = entrada.nextInt();

        if(peso <=90 && dia.equals("viernes")){
            System.out.println("tu dieta para el " + dia + " es " + vegetal + " y " + libre);
        }
        else if(dia.equals("sabado")){
            System.out.println("tu dieta para el sabado es " + vegetal + " y " + libre);
        }
        else if(dia.equals("domingo")){
            System.out.println("tu dieta para el " + dia + " es de primero " + vegetal + " de segundo " + carne + " de tercero " + pescado + " y de postrecico " + postre );
            
        }else{
            System.out.println("tu dieta para el " + dia + " es de primero " + vegetal + " de segundo " + carne + " y de tercero " + pescado);
        }      
    }
<<<<<<< HEAD
=======

    public static void dietaSemana(String[]semana, String[]vegetales, String[]carnes, String[]pescados){

        for(int i=0;i<semana.length;i++){
            String vegetal = vegetales[(int)(Math.random()* vegetales.length -1)];
            String carne = carnes[(int)(Math.random()* carnes.length -1)];
            String pescado = pescados[(int)(Math.random()* pescados.length -1)];
            System.out.println("tu dieta para el " + semana[i] + " es de primero " + vegetal + " de segundo " + carne + " y de tercero " + pescado);
        }
    }    


>>>>>>> c83e4ab15b5dab66f15fe634c7e7696e8d5a61fb
}