

import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CALCULO DE LA MATERIA MATEMATICA
        System.out.println("Ingresa la calificacion del examen de Matemáticas: ");
        float califExamen = sc.nextFloat();
        System.out.println("Ingresa las calificaciones de las tres tareas:");
        float sumNotasTareas=0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Tarea "+(i+1)+": ");
            sumNotasTareas+=sc.nextFloat();
        }

        float promedioTareas = sumNotasTareas/3;

        final float PORCENTAJE_EXAMEN = 0.9F;
        final float PORCENTAJE_TAREAS = 0.1F;

        float notaFinalExamen = califExamen * PORCENTAJE_EXAMEN;
        float notaFinalTareas = promedioTareas * PORCENTAJE_TAREAS;

        float notaFinalMat = notaFinalExamen + notaFinalTareas;

        // CALCULO DE FISICA
        System.out.println("Ingresa la calificacion del examen de Fisica: ");
        float califExamenFisica = sc.nextFloat();
        System.out.println("Ingresa las calificaciones de las dos tareas:");
        float sumNotasTareasFisica=0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Tarea "+(i+1)+": ");
            sumNotasTareasFisica+=sc.nextFloat();
        }

        float promedioTareasFisica = sumNotasTareasFisica/2;

        final float PORCENTAJE_EXAMEN_FISICA = 0.8F;
        final float PORCENTAJE_TAREAS_FISICA = 0.2F;

        float notaFinalExamenFisica = califExamenFisica * PORCENTAJE_EXAMEN_FISICA;
        float notaFinalTareasFisica = promedioTareasFisica * PORCENTAJE_TAREAS_FISICA;

        float notaFinalFisica = notaFinalExamenFisica + notaFinalTareasFisica;


        // CALCULO DE QUIMICA
        System.out.println("Ingresa la calificacion del examen de Química: ");
        float califExamenQuimica = sc.nextFloat();
        System.out.println("Ingresa las calificaciones de las tres tareas:");
        float sumNotasTareasQuimica=0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Tarea "+(i+1)+": ");
            sumNotasTareas+=sc.nextFloat();
        }

        float promedioTareasQuimica = sumNotasTareasQuimica/3;

        final float PORCENTAJE_EXAMEN_QUIMICA = 0.85F;
        final float PORCENTAJE_TAREAS_QUIMICA = 0.15F;

        float notaFinalExamenQuimica = califExamenQuimica * PORCENTAJE_EXAMEN_QUIMICA;
        float notaFinalTareasQuimica = promedioTareasQuimica * PORCENTAJE_TAREAS_QUIMICA;

        float notaFinalQuimica = notaFinalExamenQuimica + notaFinalTareasQuimica;

        float promedioFinalMaterias = (notaFinalMat+notaFinalFisica+notaFinalQuimica)/3;

        System.out.printf("\n%s %.2f","El promedio final de la materia de matematicas es ",notaFinalMat);
        System.out.printf("\n%s %.2f","El promedio final de la materia de fisica es ",notaFinalFisica);
        System.out.printf("\n%s %.2f","El promedio final de la materia de quimica es ",notaFinalQuimica);
        System.out.printf("\n%s %.2f","El promedio final de las tres materia es ",promedioFinalMaterias);


    }
}
