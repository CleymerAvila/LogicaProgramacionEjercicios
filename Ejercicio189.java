import java.util.Scanner;

public class Ejercicio189 {

    private static char[][] tablero = new char[8][8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inicializarTablero();

        mostrarTablero();

        System.out.print("Ingrese la coordenada de arranque (x,y) separada por coma (ejemplo: 1,2): ");
        String inicioStr = sc.nextLine();

        String[] inicioCoords = inicioStr.split(",");

        int x1 = Integer.parseInt(inicioCoords[0]);
        int y1 = Integer.parseInt(inicioCoords[1]);

        moverCaballo(x1, y1);
        mostrarTablero();
        
        

        System.out.print("Ingrese la coordenada destino (x,y) separada por coma (ejemplo: 3,4): ");
        String destinoStr = sc.nextLine();
        
        
        String[] destinoCoords = destinoStr.split(",");
        
        
        int x2 = Integer.parseInt(destinoCoords[0]);
        int y2 = Integer.parseInt(destinoCoords[1]);
         
        moverCaballo(x2, y2);
        mostrarTablero();
        
        boolean esValido = validarMovimientoCaballo(x1, y1, x2, y2);
        
        if (esValido) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo NO es válido.");
        }
        
        sc.close();
    }

    public static void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    
    public static void mostrarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static boolean validarPosicion(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
    
    private static boolean validarMovimientoCaballo(int x1, int y1, int x2, int y2) {
        int deltaX = Math.abs(x1 - x2);
        int deltaY = Math.abs(y1 - y2);
        
        return (deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1);
    }

    public static void moverCaballo(int x, int y) {
        if (validarPosicion(x, y)) {
            tablero[x][y] = 'H'; // 'H' representa la posición del caballo
        }
    }
}
