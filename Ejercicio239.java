/**
 * 239. Suma de una serie de números que finaliza al introducir el 999. El 999 no debe
 *  ser tenido en cuenta para la suma. (estructura repetir).
 */

import java.util.Scanner;

public class Ejercicio239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum=0;
        do {
            System.out.println("Ingresa numeros: ");
            num = sc.nextInt();
            sum+=num;
        } while (num != 999);

        System.out.println("\nLa suma de los numeros ingresados antes de 999 es: "+sum);
    }
}
