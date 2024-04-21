/**
 * 240. Realizar la multiplicación de dos números mediante sumas sucesivas.
 */

import java.util.Scanner;

public class Ejercicio240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos numeros para multiplicar");
        System.out.print("Numero 1: "); int num1 = sc.nextInt();
        System.out.print("Numero 2: "); int num2 = sc.nextInt();

        int mult = 0 ;

        for (int i=0; i < num2; i++){
            mult+=num1;
        }

        System.out.println(mult);
    }
}
