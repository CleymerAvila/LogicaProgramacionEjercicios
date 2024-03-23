import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montoVenta, montoNetoVenta=0, descuento;

        do {
            System.out.println("Ingrese el monto de la venta para verificar si aplica descuento de 10%");
            System.out.print("Monto venta: ");
            montoVenta = sc.nextDouble();
        } while (montoVenta <= 0); sc.close();

        if (montoVenta > 1000) {
            descuento = montoVenta * 0.10;
            montoNetoVenta = montoVenta - descuento;
            System.out.println("Su monto de venta neta con descuento de 10% es $"+ montoNetoVenta);;
        } else {
            System.out.println("a su venta no se le aplica descuento su monto venta es "+montoVenta);
        }

    }
}
