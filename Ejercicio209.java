/**
 * Queremos conocer los datos estadísticos de una asignatura, por lo tanto,
 *  necesitamos un algoritmo que lea el número de reprobados, aprobados y
 *  sobresalientes de una asignatura, y nos devuelva:
 *
 *  a. El tanto por ciento de alumnos que han superado la asignatura.
 *  b. El tanto por ciento de reprobados, aprobados, notables y sobresalientes de la
 *  asignatura.
 */

import java.util.Scanner;

public class Ejercicio209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa el numero de alumnos reprobados: ");
        float reproprobados = sc.nextInt();
        System.out.println("Ingresa el numero de alumnos aprobados: ");
        float aprobados = sc.nextInt();
        System.out.println("Ingresa el numero de alumnos sobresalientes: ");
        float sobresalientes = sc.nextInt();

        float totalAlumnos = reproprobados + aprobados;


        float porcentajeAprobados = (aprobados / totalAlumnos)*100;

        float porcentajeReprobados =  (reproprobados/totalAlumnos)*100;

        float porcentajeSobresalientes = (sobresalientes/totalAlumnos)*100;

        System.out.println("Porcentaje que han superado la materia es del "+ String.format("%.2f", porcentajeAprobados)+ "%");
        System.out.println("El porcentaje de alumnos que han sacado sobresaliente es del "+ String.format("%.2f",
        porcentajeSobresalientes)+ "%");
        System.out.println("Porcentaje de reprobados "+ String.format("%.2f", porcentajeReprobados)+ "%");
    }
}
