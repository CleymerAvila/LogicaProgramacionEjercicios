/**
 *  177. Programa que muestre los divisores de un número introducido por el usuario.
    (ej. 27-> 9,3,1).
 */

import java.util.Scanner;

public class Ejercicio177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String divisores="";

        System.out.println("Ingresa un numero para hallar sus divisores: ");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 10; i  > 0; i--) {
            if (numero % i ==0) {
                divisores += ", "+ i;
            }
        }

        System.out.println("\n"+numero+" -> "+divisores);
    }
}
