/**
 * Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su
 *  salario anterior.
 */

import java.util.Scanner;

public class Ejercicio206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el salario anterior del obrero: ");
        double salarioAnterior = sc.nextDouble();

        double aumento25porciento = salarioAnterior * 0.25;

        double nuevoSalario = salarioAnterior + aumento25porciento;

        System.out.println("\nEl nuevo salario del obrero con aumento del 25% es "+ String.format("%.2f",nuevoSalario));
    }
}
