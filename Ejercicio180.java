import java.util.Scanner;

/**
 *  180. ¿A una fiesta asistieron personas de diferentes edades y sexos. Construir un
    algoritmo dadas las edades y sexos de las personas? Calcular :
    ● Cuántas personas asistieron a la fiesta .
    ● Cuántos hombres y cuántas mujeres.
    ● Promedio de edades por sexo.
    ● Laedaddela persona más joven que asistió
    ● Nosepermiten menores de edad a la fiesta.
 */

public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas=0;
        double hombres=0;
        double mujeres=0;
        double sumEdadHombre=0;
        double sumEdadMujer=0;
        int edadMasJoven=100;
        int edad=0;
        int sexo=0;
        int c=0;

        System.out.println("Personas que asistieron a la fiesta");
        do {
            c++;
            System.out.println("Ingresa la edad de la persona "+c);
            edad = sc.nextInt();
            if (edad==0) {
                break;
            }

            while (edad <18 ) {
                System.out.println("No se permite menores de edad en la fiesta");
                System.out.println("Ingrese la edad de la persona "+c);
                edad = sc.nextInt();
            }
            personas++;

            System.out.println("Ingrese el sexo Hombre(1) Mujer (2)");
            sexo = sc.nextInt();

            while (sexo != 1 && sexo != 2) {
                System.out.println("Solo son permitido dos sexo");
                System.out.println("Ingrese el sexo Hombre(1) Mujer (2)");
                sexo = sc.nextInt();
            }

            if (sexo==1) {
                sumEdadHombre+=edad;
                hombres++;
            } else {
                sumEdadMujer+=edad;
                mujeres++;
            }

            if (edad<edadMasJoven) {
                edadMasJoven = edad;
            }



        } while (edad != 0); sc.close();

        System.out.println("\nPrograma finalizado!!");

        System.out.println("\nPersonas que asistieron a la fiesta: "+personas);
        System.out.println("Hombres: "+(int) hombres+ " Mujeres: "+ (int)mujeres);
        System.out.println("Promedio edad Hombre: "+ (sumEdadHombre/hombres));
        System.out.println("Promedio edad Mujer: "+ (sumEdadMujer/mujeres));
        System.out.println("Persona mas joven en asistir: "+edadMasJoven);



    }
}
