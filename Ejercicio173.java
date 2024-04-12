import java.util.Scanner;

/**
 *  173. Crear un programa que lea cantidades y precios y al final indique el total de la
    factura.
    ○ Primero se preguntará : Introduzca la cantidad vendida
    ○ Después se pregunta: Introduzca el precio
    ○ Lalectura termina cuando en la cantidad se introduzca un cero.
    ○ Mostrar el total a pagar y la cantidad total de productos.
 */
public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int precio;
        int totalFactura=0;
        int productos=0;
        int c=0;

        do {
            c++;
            System.out.println("Producto "+c);
            System.out.println("Ingrese la cantidad vendida");
            cantidad = sc.nextInt();

            if (cantidad==0) {
                continue;
            } else {
                System.out.println("Ingrese el precio");
                precio = sc.nextInt();
            }

            productos+=cantidad;
            totalFactura+= cantidad * precio;
        } while (cantidad!=0);

        System.out.println("\nFactura: ");
        System.out.println("Cantidad de productos: "+productos);
        System.out.println("Total a pagar: "+totalFactura);
    }
}
