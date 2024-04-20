/**
 * 230. Prepara un programa que divida dos números que introduzca el usuario. Los 2
 *  números deben ser positivos mayores que cero y el primer número mayor que el
 *  segundo; si no cumple con esta condición debe volver a leer los números hasta que
 *  ingrese los números correctos, momento en que se calculará y mostrará el resultado
 *  de la división.
 */

import java.util.Scanner;

public class Ejercicio230
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num2;
        float num1;

        do {
            System.out.println("Ingresa dos numeros para realizar la division");
            System.out.print("Numero 1: ");
            num1 = sc.nextFloat();
            System.out.print("Numero 2: ");
            num2 = sc.nextFloat();

            if (num1 < num2 || (num1 < 0 || num2 < 0)){
                System.out.println("Numeros invalidos ingresa de nuevo!!");
            }
        } while (num1 < 0 || num2 < 0 || (num1 < num2));

        sc.close();

        float div = num1 / num2;

        System.out.println("\nDivision: "+div);
    }
}
