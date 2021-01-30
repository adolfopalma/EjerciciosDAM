import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        List<Integer> bingo;
        List<Integer> numerosSalidos;

        bingo = new ArrayList<>();
        numerosSalidos = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            bingo.add(i);
        }

        for (int i = 0; i < bingo.size(); i++) {
            System.out.println(bingo.get(i));
        }

        int numeroRandom = (int) (Math.random() * 100 + 1);

        System.out.println("El numero que ha salido del bombo es " + numeroRandom);

        for (int i = 1; i < bingo.size(); i++) {
            if (numeroRandom == bingo.get(i)) {
                bingo.remove(i);
                numerosSalidos.add(i);
            }
        }

        for (int i = 0; i < bingo.size(); i++) {
            System.out.println(bingo.get(i));
        }

    }
}