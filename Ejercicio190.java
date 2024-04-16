import java.util.Scanner;

/**
 *   190. Programa que simule una caja de supermercado, que acuerdo a una cantidad a
    pagar por determinados artículos en una tienda y un pago indicados por el usuario,
    determine la diferencia a devolver (cambio) al cliente y las denominaciones
    monetarias usadas para dicha transacción, tomando en cuenta que se tienen las
    siguientes denominaciones:
 */

public class Ejercicio190 {
    public static void main(String[] args) {
        int[] denominaciones = {100, 1, 200, 300, 5, 10, 500, 1000, 50, 100};
        int totalTransacciones = 5;
        
        Scanner sc = new Scanner(System.in);
        
        for (int transaccion = 1; transaccion <= totalTransacciones; transaccion++) {
            System.out.println("Transacción " + transaccion);
            
            System.out.print("Ingrese el total a pagar: ");
            int totalPagar = sc.nextInt();
            
            System.out.print("Ingrese el monto pagado por el cliente: ");
            int montoPagado = sc.nextInt();
            
            int cambio = montoPagado - totalPagar;
            
            if (cambio < 0) {
                System.out.println("El monto pagado es insuficiente.");
                continue;
            }
            
            System.out.println("Cambio a devolver: " + cambio);
            System.out.println("Denominaciones a entregar:");
            
            for (int i = 0; i < denominaciones.length; i++) {
                if (cambio >= denominaciones[i]) {
                    int cantidad = cambio / denominaciones[i];
                    cambio %= denominaciones[i];
                    System.out.println("$" + denominaciones[i] + ": " + cantidad);
                }
            }
            
            System.out.println("-----------------------------");
        }
        
        sc.close();
    }
}
