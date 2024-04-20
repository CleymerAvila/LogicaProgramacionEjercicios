/**
 * 224. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno
 *  se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de
 *  problemas vale el 50% y la parte teórica el 40%. El algoritmo leerá el nombre del
 *  alumno, las tres notas, escribirá el resultado y volverá a pedir los datos del siguiente
 *  alumno hasta que el nombre sea una cadena vacía. Las notas deben estar entre 0 y
 *  10, si no lo están, no imprimirá las notas, mostrará un mensaje de error y volverá a
 *  pedir otro alumno.
 */

import java.util.Scanner;

public class Ejercicio224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PORCENTAJE_PRACTICA = 0.1F;
        final float PORCENTAJE_PROBLEMAS = 0.5F;
        final float PORCENTAJE_TEORICA = 0.4F;

        for (int i = 0; i < 10; i++) {

            System.out.println("\nNombre de alumno: ");
            String nombre = sc.nextLine();
            System.out.println("\nIngresa notas");
            System.out.print("nota practicas: ");
            float notaPracticas = sc.nextFloat();
            System.out.print("nota problemas: ");
            float notaProblemas = sc.nextFloat();
            System.out.print("nota Teorica: ");
            float notaTeorica = sc.nextFloat();

            if (!((notaProblemas<0 || notaProblemas >10)
                && (notaPracticas<0 || notaPracticas >10))
                && (notaTeorica<0 || notaTeorica >10)) {
                if (nombre.isEmpty()){
                    System.out.println("\nEl Programa ha finalizado!");
                    break;
                }

                float notaFinal = (notaPracticas * PORCENTAJE_PRACTICA) + (notaProblemas * PORCENTAJE_PROBLEMAS) + (notaTeorica * PORCENTAJE_TEORICA);

                System.out.printf("\n%s %s %s %.2f", "EL alumno ", nombre, " ha sacado en la nota final", notaFinal);
            } else {
                if (nombre.isEmpty()){
                    System.out.println("\nEl Programa ha finalizado!");
                    break;
                }
                System.out.println("No se puede imprimir la nota final ya que las notas no estan en el rango permitido (0-10)");
            }

            sc.nextLine();
        }

        sc.close();





    }
}
