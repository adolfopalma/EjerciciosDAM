import java.util.Scanner;

public class TresEnRaya {
    //Intenta introducir el metodo valida posicion y haz que funcione con todo lo demas.
    // TODOposValida = validarPosicion(fila, columna);
    public static void main(String[] args) {
        char vacio = '-';
        boolean turno = true;
        char tablero[][] = new char[3][3];
        int fila, columna;
        boolean posValida, correcto;

        tablero = inicializarTablero(tablero, vacio);
        posValida = true;
        correcto = false;

        while (!finPartida(vacio, tablero)) {
            // mostramos el jugador al que le toca
            mostrarTurnoActual(turno);

            // muestro el tablero
            mostrarTablero(tablero);

            
            fila = pedirInteger("Dame la fila");
            columna = pedirInteger("Dame la columna");

            // Validamos la posicion
            




            // Si es valido, comprobamos que no haya ninguna marca
            if (posValida) {

                // Si no hay marca, significa que es correcto
                if (!hayValorPosicion(fila, columna, tablero, vacio)) {
                    correcto = true;
                } else {
                    System.out.println("Ya hay una marca en esa posicion");
                }
            } else {
                System.out.println("La posicion no es valida");
            }

            insertarEn(fila, columna, turno, tablero);

            turno = cambiaTurno(turno);
        }

        // Muestra el tablero
        mostrarTablero(tablero);

        // Mostramos el ganador
        mostrarGanador(vacio, tablero);

    }

    public static char[][] inicializarTablero(char tablero[][], char vacio) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = vacio;
            }
        }

        return tablero;
    }

    public static void mostrarTablero(char tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void mostrarTurnoActual(boolean turno) {
        if (turno) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }

    public static void insertarEn(int fila, int columna, boolean turno, char[][] tablero) {
        if (turno) {
            tablero[fila][columna] = 'X';
        } else {
            tablero[fila][columna] = 'O';
        }
    }

    public static boolean hayValorPosicion(int fila, int columna, char[][] tablero, char vacio) {
        if (tablero[fila][columna] != vacio) {
            return true;
        }

        return false;
    }

    public static boolean tableroLleno(char[][] tablero, char vacio) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == vacio) {
                    return false;
                }
            }
        }

        return true;
    }

    public static char coincidenciaLinea(char[][] tablero, char vacio) {
        char simbolo;
        boolean coincidencia;

        for (int i = 0; i < tablero.length; i++) {
            // Reiniciamos la coincidencia
            coincidencia = true;
            // Cogemos el simbolo de la fila
            simbolo = tablero[i][0];
            if (simbolo != vacio) {
                for (int j = 1; j < tablero[0].length; j++) {
                    // sino coincide ya no habra ganadro en esta fila
                    if (simbolo != tablero[i][j]) {
                        coincidencia = false;
                    }
                }

                // Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidencia) {
                    return simbolo;
                }

            }

        }
        // Si no hay ganador, devuelvo el simbolo por defecto
        return vacio;
    }

    public static char coincidenciaColumna(char[][] tablero, char vacio) {

        char simbolo;
        boolean coincidencia;

        for (int j = 0; j < tablero.length; j++) {
            // Reiniciamos la coincidencia
            coincidencia = true;
            // Cogemos el simbolo de la columna
            simbolo = tablero[0][j];
            if (simbolo != vacio) {
                for (int i = 1; i < tablero[0].length; i++) {
                    // sino coincide ya no habra ganadro en esta fila
                    if (simbolo != tablero[i][j]) {
                        coincidencia = false;
                    }
                }

                // Si no se mete en el if, devuelvo el simbolo ganador
                if (coincidencia) {
                    return simbolo;
                }

            }
        }
        // Si no hay ganador, devuelvo el simbolo por defecto
        return vacio;
    }

    public static char coincidenciaDiagonal(char[][] tablero, char vacio) {
        char simbolo;
        boolean coincidencia = true;

        // Diagonal principal
        simbolo = tablero[0][0];
        if (simbolo != vacio) {
            for (int i = 1; i < tablero.length; i++) {
                // sino coincide ya no habra ganadro en esta fila
                if (simbolo != tablero[i][i]) {
                    coincidencia = false;
                }
            }

            // Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidencia) {
                return simbolo;
            }
        }

        coincidencia = true;

        // Diagonal inversa
        simbolo = tablero[0][2];
        if (simbolo != vacio) {
            for (int i = 1, j = 1; i < tablero.length; i++, j--) {
                // sino coincide ya no habra ganadro en esta fila
                if (simbolo != tablero[i][j]) {
                    coincidencia = false;
                }
            }

            // Si no se mete en el if, devuelvo el simbolo ganador
            if (coincidencia) {
                return simbolo;
            }
        }
        // Si no hay ganador, devuelvo el simbolo por defecto
        return vacio;
    }

    public static boolean finPartida(char vacio, char[][] tablero) {
        if (tableroLleno(tablero, vacio) || coincidenciaLinea(tablero, vacio) != vacio
                || coincidenciaColumna(tablero, vacio) != vacio || coincidenciaDiagonal(tablero, vacio) != vacio) {
            return true;
        }

        return false;
    }

    public static void mostrarGanador(char vacio, char[][] tablero) {
        char simbolo = coincidenciaLinea(tablero, vacio);

        if (simbolo != vacio) {
            ganador(simbolo, 1);

            return;
        }

        simbolo = coincidenciaColumna(tablero, vacio);

        if (simbolo != vacio) {
            ganador(simbolo, 2);

            return;
        }

        simbolo = coincidenciaDiagonal(tablero, vacio);

        if (simbolo != vacio) {
            ganador(simbolo, 3);

            return;
        }

        System.out.println("Hay empate");
    }

    private static void ganador(char simbolo, int tipo) {
        switch (tipo) {
            case 1:
                if (simbolo == 'X') {
                    System.out.println("Ha ganado el Jugador 1 por linea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por linea");
                }

                break;
            case 2:
                if (simbolo == 'X') {
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
            case 3:
                if (simbolo == 'X') {
                    System.out.println("Ha ganado el Jugador 1 por diagonal");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por diagonal");
                }
                break;
        }
    }

    public static int pedirInteger(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        int numero = teclado.nextInt();

        return numero;
    }

    public static boolean cambiaTurno(boolean turno) {
        if (turno) {
            turno = false;
        } else {
            turno = true;
        }

        return turno;
    }
}