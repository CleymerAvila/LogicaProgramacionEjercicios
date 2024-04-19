/**
 * Un alumno desea saber cuál será su calificación final en la materia de
 *  Introducción a la programación. Dicha calificación se compone de los siguientes
 *  porcentajes:
 *  ■60% el promedio de sus tres calificaciones parciales
 *  ■30% de la calificación de prácticas.
 *  ■10% de la calificación de asistencia a clases.
 */

import java.util.Scanner;

public class Ejercicio208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double porcentajeTresCalfParciales = 0.6;
        double porcentajeCalifPracticas = 0.3;
        double porcentajeCalfAsistencia = 0.1;


        System.out.println("Ingresa las notas de calificacion parciales");
        System.out.print("Parcial 1: "); double notaParcial1  = sc.nextDouble();
        System.out.print("Parcial 2: "); double notaParcial2 = sc.nextDouble();
        System.out.print("Parcial 3: "); double notaParcial3 = sc.nextDouble();

        System.out.println("\nIngresa la calificacion de las practicas");
        double notaExamenfinal = sc.nextDouble();

        System.out.println("\nIngresa la calificacion de la asistencia en clase");
        double notaTrabajoFinal = sc.nextDouble();


        double promedioNotasParciales = (notaParcial1+notaParcial2+notaParcial3)/3;

        double porcentaje1 = promedioNotasParciales * porcentajeTresCalfParciales;

        double porcentaje2 = notaExamenfinal * porcentajeCalifPracticas;

        double porcentaje3 = notaTrabajoFinal * porcentajeCalfAsistencia;

        double notaFinal = porcentaje1 + porcentaje2 + porcentaje3;

        System.out.printf("\n%s %.2f","La calificacion final de la materia Introducccion a la programacion es ", notaFinal);


    }
}
