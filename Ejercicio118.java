import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] articulo = new double[10];
        double montoTotalPago=0;

        for (int i = 0; i < articulo.length; i++) {
            System.out.println("\nIngrese el monto del articulo "+(i+1));
            articulo[i] = sc.nextDouble();
            montoTotalPago = montoTotalPago + articulo[i];
        } sc.close();

        System.out.println();
        for (int j = 0; j < articulo.length; j++) {
            System.out.println("Monto articulo "+(j+1)+" $: "+articulo[j]);
        }

        System.out.println("\nEL monto total a pagar: "+montoTotalPago);
    }
}
