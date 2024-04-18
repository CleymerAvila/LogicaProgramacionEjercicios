import java.util.Random;
import java.util.Scanner;

public class Ejercicio198 {

    private static final int TAMANIO = 9;
    private static final int subcuadro = 3;
    private static final int[][] tablero = new int[TAMANIO][TAMANIO];

    public static void main(String[] args) {
        crearTablero();
        mostrarTablero();

        Scanner scanner = new Scanner(System.in);
        while (!estaResuelto()) {
            System.out.print("Ingrese fila (1-9) o 0 para salir: ");
            int row = scanner.nextInt();
            if (row == 0) {
                System.out.println("Saliendo del juego...");
                break;
            }

            System.out.print("Ingrese columna (1-9): ");
            int col = scanner.nextInt();

            System.out.print("Ingrese número (1-9): ");
            int num = scanner.nextInt();

            if (movimientoValido(row - 1, col - 1, num)) {
                tablero[row - 1][col - 1] = num;
                mostrarTablero();
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    public static void crearTablero() {
        Random rand = new Random();
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                tablero[i][j] = rand.nextInt(9) + 1;  // Números del 1 al 9
            }
        }
    }

    public static boolean movimientoValido(int row, int col, int num) {
        // Verificar fila y columna
        for (int i = 0; i < TAMANIO; i++) {
            if (tablero[row][i] == num || tablero[i][col] == num) {
                return false;
            }
        }

        // Verificar subCuadro
        int filaInicioSubcuadro = (row / subcuadro) * subcuadro;
        int columnaInicioSubcuadro = (col / subcuadro) * subcuadro;
        for (int i = filaInicioSubcuadro; i < filaInicioSubcuadro + subcuadro; i++) {
            for (int j = columnaInicioSubcuadro; j < columnaInicioSubcuadro + subcuadro; j++) {
                if (tablero[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean estaResuelto() {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (tablero[i][j] == 0) {
                    return false;  // El tablero no está completo
                }
                if (!movimientoValido(i, j, tablero[i][j])) {
                    return false;  // Movimiento inválido encontrado
                }
            }
        }
        return true;  // El tablero está completo y válido
    }

    public static void mostrarTablero() {
        System.out.println("-------------------------");
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print("| ");
            for (int j = 0; j < TAMANIO; j++) {
                System.out.print(tablero[i][j] + " ");
                if ((j + 1) % subcuadro == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % subcuadro == 0) {
                System.out.println("-------------------------");
            }
        }
    }
}

