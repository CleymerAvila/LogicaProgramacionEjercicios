import java.util.Scanner;

public class Ejercicio187 {
    private static char[][] tablero = new char[8][8];
    
    public static void main(String[] args) {
        inicializarTablero();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            mostrarTablero();
            
            System.out.print("Introduce la posición para la reina (ejemplo: a1): ");
            String posicion = sc.nextLine();
            
            if (!validarPosicion(posicion)) {
                System.out.println("Posición inválida. Introduce una posición válida.");
                continue;
            }
            
            int columna = "abcdefgh".indexOf(posicion.charAt(0));
            int fila = Integer.parseInt(posicion.substring(1)) - 1;
            
            moverReina(fila, columna);
            
            System.out.print("¿Deseas mover la reina nuevamente? (s/n): ");
            String continuar = sc.nextLine();
            
            if (!continuar.toLowerCase().equals("s")) {
                break;
            }
        }
        
        sc.close();
    }
    
    private static void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    
    private static void mostrarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private static boolean validarPosicion(String posicion) {
        String letras = "abcdefgh";
        String numeros = "12345678";
        
        if (posicion.length() != 2) {
            return false;
        }
        
        char columna = posicion.charAt(0);
        char fila = posicion.charAt(1);
        
        return letras.contains(String.valueOf(columna)) && numeros.contains(String.valueOf(fila));
    }
    
    private static void moverReina(int fila, int columna) {
        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
            System.out.println("Movimiento inválido. Posición fuera del tablero.");
            return;
        }
        
        tablero[fila][columna] = 'Q';
        mostrarTablero();
    }
}
