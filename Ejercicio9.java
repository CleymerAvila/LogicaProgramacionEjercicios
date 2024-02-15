import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double iva, cantidadingresada, cantidadSinIva;

        System.out.println("Ingrese una cantidad para obtener el iva");
        cantidadingresada = leer.nextDouble();
        leer.close();

        cantidadSinIva = cantidadingresada/1.19;
        iva = cantidadingresada - cantidadSinIva;

        System.out.println("\nCantidad Ingresada: " + cantidadingresada);

        System.out.println("Cantidad ingresada sin IVA: " + cantidadSinIva);

        System.out.println("IVA ( 19% ) " + iva);


    }
}
