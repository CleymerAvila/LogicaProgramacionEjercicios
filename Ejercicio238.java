/**
 * 238. Leer un número cualquiera y sumar sus elementos, ejemplo: 5423 respuesta=
 *  14;
 */

import java.util.Scanner;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero para sumar sus digitos");
        String numero = String.valueOf(sc.nextInt());

        int suma=0;
        for (int i = 0; i < numero.length(); i++) {
            suma+= Character.getNumericValue(numero.charAt(i));
        }

        System.out.println("La suma de los digitos del numero ingresado es "+suma);
    }
}
