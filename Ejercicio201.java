/**
 *  201. Un alumno desea saber cuál será su calificación final en la materia de
 *  Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
 *  ● 55%delpromedio de sus tres calificaciones parciales.
 *  ● 30%delacalificación del examen final.
 *  ● 15%delacalificación de un trabajo final.
 */

import java.util.Scanner;

public class Ejercicio201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double porcentajeTresNotasParciales = 0.55;
        double porcentajeExamenFinal = 0.30;
        double porcentajeTrabajoFinal = 0.15;


        System.out.println("Ingresa las notas de calificacion parciales");
        System.out.print("Parcial 1: "); double notaParcial1  = sc.nextDouble();
        System.out.print("Parcial 2: "); double notaParcial2 = sc.nextDouble();
        System.out.print("Parcial 3: "); double notaParcial3 = sc.nextDouble();

        System.out.println("\nIngresa la nota del examen final");
        double notaExamenfinal = sc.nextDouble();

        System.out.println("\nIngresa la nota del trabajo final");
        double notaTrabajoFinal = sc.nextDouble();


        double promedioNotasParciales = (notaParcial1+notaParcial2+notaParcial3)/3;

        double porcentaje1 = promedioNotasParciales * porcentajeTresNotasParciales;

        double porcentaje2 = notaExamenfinal * porcentajeExamenFinal;

        double porcentaje3 = notaTrabajoFinal * porcentajeTrabajoFinal;

        double notaFinal = porcentaje1 + porcentaje2 + porcentaje3;

        System.out.printf("\n%s %.2f","La calificacion de la nota final de algoritmos es ", notaFinal);
    }
}
