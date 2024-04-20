/**
 *  227. El siguiente es el menú de un restaurante de bocadillos. Diseñar un algoritmo
 *  capaz de leer el número de unidades consumidas de cada alimento ordenado y
 *  calcular la cuenta total. Vamos a suponer que estos precios son fijos, es decir, que
 *  son constantes (recuerda que en PSeInt no se usa comas para separar la parte
 *  decimal de la parte entera).
 *  Producto                      Precio
 *  Bocadillo de jamón             1,5
 *  Refresco                       1,05
 *  Cerveza                        0,75
 */

import java.util.Scanner;

public class Ejercicio227
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Precios de los productos, Contantes
        final float PRECIO_BOCADILLO_JAMON = 1.5F;
        final float PRECIO_REFRESCOS = 1.5F;
        final float PRECIO_CERVEZA = 0.75F;

        System.out.println("Ingresas el numero cantidades de Bocadillos consumidas");
        System.out.print("Bocadillo de jamon: "); float cantBocadilloJamon = sc.nextFloat();
        System.out.print("Refrescos: "); float cantRefrescos = sc.nextFloat();
        System.out.print("Cervezas: "); float cantCervezas = sc.nextFloat();
        sc.close();

        float totalBocadilloJamon = cantBocadilloJamon * PRECIO_BOCADILLO_JAMON;
        float totalRefrescos = cantRefrescos * PRECIO_REFRESCOS;
        float totalCervezas = cantCervezas * PRECIO_CERVEZA;

        float cuentaTotal = totalBocadilloJamon + totalRefrescos + totalCervezas;

        System.out.println("El total de Bocadillo de jamon es: "+ totalBocadilloJamon);
        System.out.println("El total de refrescos es: "+ totalRefrescos);
        System.out.println("El total de Cervezas es: "+ totalCervezas);
        System.out.println("\nEl total de la cuenta es: "+ cuentaTotal);

    }
}
