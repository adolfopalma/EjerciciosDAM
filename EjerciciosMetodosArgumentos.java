import java.util.Scanner;

// Crea un metodo que te pida tu nombre y lo introduzcas por teclado y lanza un saludo personalizado para ese nombre.
// Crea un metodo para pedir la edad y visualizarla;
// Crea un metodo que visualize el siguiente mensaje: Pues "nombre1" con tus "edad" no se como "nombre2" no te mando a tomar por saco hace "años" años
// Crea un metodo para rellenar un array de string con tus personas favoritas, al menos 5, y luego crea otro metodo al que por argumentos le pases esas personas
//      y elige de forma aleatoria la mas favorita de todas y a la que peor te cae.

public class EjerciciosMetodosArgumentos{

    public static void main(String[] args){
        String guardaNombre;
        int guardaEdad;
        String nombre2 = "ines";
        int anos = 16;
        String[] personasFavoritas = new String[5];
        guardaNombre = pideNombre();
        guardaEdad = pideEdad();
        visualizaSaludo(guardaNombre,guardaEdad);
        mensaje(guardaNombre,guardaEdad,nombre2,anos);
        personasFavoritas = personasFavoritas();
        mejorPeor(personasFavoritas);
    }

    public static String pideNombre(){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = entrada.nextLine(); 
        
        return nombre;
    }

    public static void visualizaSaludo(String n, int x){
        System.out.println("hola buenas tardes ceporro " + n + " " + x);
    }

    public static int pideEdad(){
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu Edad");
        edad = entrada.nextInt();
        
        return edad;
    }

    public static void mensaje(String a, int b, String c, int d){
        System.out.println("Pues " + a + " con tus " + b + " años no se como " + c + " no te mando a tomar por saco hace " + d + " años");
    }

    public static String[] personasFavoritas(){
        Scanner in = new Scanner(System.in);
        String[] personasFavoritas = new String[5];

        for(int i=0; i<personasFavoritas.length; i++){
            personasFavoritas[i] = in.nextLine();
        }

        return personasFavoritas;
    }

    public static void mejorPeor(String[] personas){
        String PersonaFavorita;
        String PersonaMenosFavorita;

        PersonaFavorita = personas[(int)(Math.random()*personas.length - 1)];
        PersonaMenosFavorita = personas[(int)(Math.random()*personas.length - 1)];

        if(PersonaFavorita == PersonaMenosFavorita){
            PersonaMenosFavorita = personas[(int)(Math.random()*personas.length - 1)];
        }

        System.out.println("Tu persona favorita es " + PersonaFavorita + " pero a " + PersonaMenosFavorita + " no puedes ni verl@"); 
    }
}