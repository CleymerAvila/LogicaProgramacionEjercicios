import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montoCompra, descuento, totalaPagar;

        System.out.println("Ingresa el monto de la compra realizada para realizar el descuento");
        montoCompra = sc.nextDouble();
        sc.close();

        if (montoCompra>1000) {
            descuento = montoCompra * 0.10;
            totalaPagar = montoCompra - descuento;
            System.out.println("El total a pagar con descuento del 10% es $"+ totalaPagar);

        } else if (montoCompra > 500 && montoCompra <=1000) {
            descuento = montoCompra * 0.20;
            totalaPagar = montoCompra - descuento;
            System.out.println("El total a pagar con descuento del 20% es $"+ totalaPagar);
        } else if (montoCompra <= 500) {
            totalaPagar = montoCompra;
            System.out.println("Su compra no tiene aplicada un descuento, el total a pagar es $"+ totalaPagar);
        }
    }
}
