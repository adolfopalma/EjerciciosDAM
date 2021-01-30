import java.util.Scanner;

public class HoursTranslateToYears {
    static int horas = 0;
    static int horasTrabajadas;
    static int dias = 0;
    static int semanas = 0;
    static int meses = 0;
    static int años = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero de horas para pasarlo a años: ");
        horasTrabajadas = in.nextInt();

        translate();

        System.out.println("años: " + años + ", Meses: " + meses + ", semanas: " + semanas + ", dias: " + dias
                + ", horas: " + horas);
    }

    public static void translate() {
        while (horasTrabajadas > 0) {
            horasTrabajadas--;
            horas++;
            if (horas % 24 == 0) {
                horas = 0;
                dias++;
                if (dias % 7 == 0) {
                    semanas++;
                    dias = 0;
                    if (semanas % 4 == 0) {
                        semanas = 0;
                        meses++;
                        if (meses % 12 == 0) {
                            meses = 0;
                            años++;
                        }
                    }
                }
            }
        }
    }
}