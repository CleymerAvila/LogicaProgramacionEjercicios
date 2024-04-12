/**
 * 179. Pedir 3 calificaciones de un alumno (matemáticas, inglés y español).
 ● Mostrar el promedio.
 ● El total de materias aprobadas, el total de materias reprobadas.
 ● Mostrar el nombre de la materia con menor calificación.
 */

import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaMat, notaIng, notaEsp;

        do {
            System.out.print("Ingresa la nota de Matematica: "); notaMat = sc.nextDouble();
            System.out.print("Ingrese la nota de Ingles: "); notaIng = sc.nextDouble();
            System.out.print("Ingrese la nota de Español: "); notaEsp = sc.nextDouble();
        } while (notaEsp < 0 || notaIng < 0 || notaMat < 0); sc.close();

        double promedio = (notaEsp + notaIng + notaMat)/ 3;

        int aprobadas=0;
        int reprobadas=0;

        if (notaEsp>5.9) {
            aprobadas++;
        } else {
            reprobadas++;
        }

        if (notaIng > 5.9) {
            aprobadas++;
        } else {
            reprobadas++;
        }

        if (notaMat > 5.9) {
            aprobadas++;
        } else {
            reprobadas++;
        }

        String peorMateria="";

        if (notaEsp < notaIng && notaEsp < notaMat) {
            peorMateria = "Español";
        } else if (notaIng < notaEsp && notaIng < notaMat) {
            peorMateria = "Ingles";
        } else if (notaMat < notaEsp && notaMat < notaIng) {
            peorMateria = "Matematicas";
        }

        System.out.printf("\nEl promedio de las notas es: $%.2f", promedio);
        System.out.println("\nEl numero de materias aprobadas es "+ aprobadas);
        System.out.println("El numero de materias reprobadas es "+ reprobadas);
        System.out.println("La materia con peor calificacion es "+peorMateria);
    }
}
