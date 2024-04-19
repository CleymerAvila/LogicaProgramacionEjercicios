/**
 * Tres personas deciden invertir su dinero para fundar una empresa. Cada una de
 *  ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte con
 *  respecto a la cantidad total invertida.
 */

import java.util.Scanner;

public class Ejercicio214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingreso de cantidad de dinero invertido por tres personas para fundar una empresa. ");
        System.out.print("Cantidad invertida persona 1: "); double cantInvertidaPersona1 = sc.nextDouble();
        System.out.print("Cantidad invertida persona 2: "); double cantInvertidaPersona2 = sc.nextDouble();
        System.out.print("Cantidad invertida persona 3: "); double cantInvertidaPersona3 = sc.nextDouble();

        double totalInversion = cantInvertidaPersona1 + cantInvertidaPersona2 + cantInvertidaPersona3;

        double porcentajePersona1 = (cantInvertidaPersona1 / totalInversion)*100;
        double porcentajePersona2 = (cantInvertidaPersona2 / totalInversion)*100;
        double porcentajePersona3 = (cantInvertidaPersona3 /totalInversion)*100;

        System.out.println("\nEl porcentaje con respecto a la cantidad total invertida\nde "+totalInversion+" por cada persona es :");
        System.out.printf("\n%s %.2f %s","Persona 1: ", porcentajePersona1, "%");
        System.out.printf("\n%s %.2f %s","Persona 2: ", porcentajePersona2, "%");
        System.out.printf("\n%s %.2f %s","Persona 3: ", porcentajePersona3, "%");

    }
}
