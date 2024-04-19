import java.util.Scanner;

public class Ejercicio199 {


    private static final char[][] board = new char[8][8];
    private static int puntosJugador1 = 0;
    private static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Turno del Jugador 1 (X)");
            if (moverPieza('X', scanner)) {
                puntosJugador1++;
            }

            mostrarTablero();
            System.out.println("Puntos Jugador 1: " + puntosJugador1);
            System.out.println("Puntos Jugador 2: " + puntosJugador2);

            System.out.println("Turno del Jugador 2 (O)");
            if (moverPieza('O', scanner)) {
                puntosJugador2++;
            }

            mostrarTablero();
            System.out.println("Puntos Jugador 1: " + puntosJugador1);
            System.out.println("Puntos Jugador 2: " + puntosJugador2);
        }
    }

    public static void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }
        // Colocar peones en sus posiciones iniciales
        for (int j = 0; j < 8; j++) {
            board[1][j] = 'X';
            board[6][j] = 'O';
        }
    }

    public static void mostrarTablero() {
        System.out.println("  a b c d e f g h");
        System.out.println("------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("------------------");
        }
    }

    public static boolean moverPieza(char jugador, Scanner scanner) {
        System.out.print("Ingrese la coordenada de origen (ejemplo: a2): ");
        String origenStr = scanner.nextLine();
        int origenFila = Integer.parseInt(origenStr.substring(1)) - 1;
        int origenCol = origenStr.charAt(0) - 'a';

        System.out.print("Ingrese la coordenada de destino (ejemplo: a3): ");
        String destinoStr = scanner.nextLine();
        int destinoFila = Integer.parseInt(destinoStr.substring(1)) - 1;
        int destinoCol = destinoStr.charAt(0) - 'a';

        if (validarMovimiento(origenFila, origenCol, destinoFila, destinoCol, jugador)) {
            if (board[destinoFila][destinoCol] != '-') {
                System.out.println("¡Pieza capturada!");
                return true;
            }
            board[destinoFila][destinoCol] = board[origenFila][origenCol];
            board[origenFila][origenCol] = '-';
        } else {
            System.out.println("Movimiento inválido.");
        }
        return false;
    }

    public static boolean validarMovimiento(int filaOrigen, int colOrigen, int filaDestino, int colDestino, char jugador) {
        if (filaDestino < 0 || filaDestino > 7 || colDestino < 0 || colDestino > 7) {
            return false; // Coordenadas fuera del tablero
        }

        if (board[filaOrigen][colOrigen] == jugador) {
            if (jugador == 'X') {
                // Movimiento de peón para el jugador 1 (X)
                if (filaDestino == filaOrigen - 1 && colDestino == colOrigen) {
                    return true; // Mover hacia adelante
                }
                if (filaDestino == filaOrigen - 1 && Math.abs(colDestino - colOrigen) == 1 && board[filaDestino][colDestino] == 'O') {
                    return true; // Capturar diagonalmente
                }
            } else if (jugador == 'O') {
                // Movimiento de peón para el jugador 2 (O)
                if (filaDestino == filaOrigen + 1 && colDestino == colOrigen) {
                    return true; // Mover hacia adelante
                }
                if (filaDestino == filaOrigen + 1 && Math.abs(colDestino - colOrigen) == 1 && board[filaDestino][colDestino] == 'X') {
                    return true; // Capturar diagonalmente
                }
            }
        }
        return false;
    }
}

