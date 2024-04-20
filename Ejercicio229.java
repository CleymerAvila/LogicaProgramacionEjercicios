/**
 *  229. Haz un programa que permita calcular la suma de 2 números pares. Pedirá dos
 *  números al usuario y mostrará su suma, volviendo a repetir hasta que ambos
 *  números introducidos sean 0. Esta vez deberás usar Repetir.
 */

import java.util.Scanner;

public class Ejercicio229
{
    public static void main(String[] args)
    {
        int num1;
        int num2;


        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa numero 1: ");
            num1 = sc.nextInt();
            System.out.println("Ingresa numero 2: ");
            num2 = sc.nextInt();

            int sum = num1 + num2;

            if (num1!=0 && num2 != 0){
                System.out.println("\nSuma : "+sum);
            } else {
                System.out.println("\nPrograma finalizado");
            }
        } while (num1 != 0 && num2 != 0);
    }
}
