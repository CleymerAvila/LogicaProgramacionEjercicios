import java.util.Scanner;

/**
 * 147. En una clase de 5 alumnos se han realizado tres exámenes y se requiere
 determinar el número de:
 a) Alumnos que aprobaron todos los exámenes
 b) Alumnos que aprobaron al menos un examen
 c) Alumnos que aprobaron únicamente el último examen.
 */

public class Ejercicio147 {
    private static final int NUM_ESTUDIANTES=5;
    private static final int NUM_EXAMENES=3;
    private static final int NOTA_APROBACION=6;

    private static Estudiante[] estudiantes = new Estudiante[5];
    public static void main(String[] args) {
        //Creamos el Objeto Scanner donde se ingresara las notas
        Scanner sc = new Scanner(System.in);

        //Ingresar notas de los estudiantes 
        for(int i=0; i< NUM_ESTUDIANTES; i++){
            Estudiante estudiante = new Estudiante(); //crear por cada iteracio un estudiante
            estudiantes[i]=estudiante; // Agregarlo al arreglo

            System.out.println("Ingrese las 3 notas (1-10) del alumno "+(i+1)); //Ingreso de nota
            for (int j = 0; j < NUM_EXAMENES; j++) {
                System.out.print("Nota "+(j+1)+": ");
                estudiante.notas[j] = sc.nextDouble();
                while (estudiante.notas[j]< 0 || estudiante.notas[j]>10) { // Verificar que se correcta
                    System.out.println("Nota incorrecta, la nota debe ser entre 1 y 10");
                    System.out.print("\nNota "+(j+1)+": ");
                    estudiante.notas[j] = sc.nextDouble();
                }
            }
        } sc.close();

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].notas.length; j++) {
                System.out.println(estudiantes[i].notas[j]);
            }
        }

        //Calculamos los resultado
        int aprobaronTodo=0;
        int alMenosUno=0;
        int ultimoExamen=0;

        for (Estudiante estudiante : estudiantes) {
            boolean aproboTodo=true;
            boolean aproboAlguno=false;
            boolean aproboUltimo= false;
            for (double nota : estudiante.notas) {
                if (nota<NOTA_APROBACION) {
                    aproboTodo=false;
                }

                if (nota>=NOTA_APROBACION) {
                    aproboAlguno=true;
                }

                if (nota>=NOTA_APROBACION && estudiante.notas[estudiante.notas.length-1]==nota) {
                    aproboUltimo=true;
                }
                
            }

            if (aproboTodo) {
                aprobaronTodo++;
            }

            if (aproboAlguno) {
                alMenosUno++;
            }

            if (aproboUltimo) {
                ultimoExamen++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("a) Alumnos que aprobaron todos los exámenes: " + aprobaronTodo);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + alMenosUno);
        System.out.println("c) Alumnos que aprobaron únicamente el último examen: " + ultimoExamen);
    }

    private static class Estudiante{
        double[] notas = new double[NUM_EXAMENES];
    }
}
