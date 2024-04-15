/**
 * 184. Programa que de acuerdo a los datos capturados por el usuario genere el RFC
    (Registro Federal Contribuyente).
    El RFC se compone de 13 caracteres alfanuméricos formados por la iniciales del
    nombre de la empresa o natural, seguido de la fecha de creación o de
    nacimiento y 3 caracteres más llamados “homoclave” que el SAT otorga y revisa
    para que el RFC sea una clave única e irrepetible entre todos los contribuyentes
    del país.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numAleatorio = new Random();
        String rfc="";

        System.out.println("Ingrese su nombre completo: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el dia mes y año de nacimiento");
        System.out.print("Dia: "); String dia = leer.next();
        System.out.print("Mes: "); String mes = leer.next();
        System.out.print("Año: "); String anio = leer.next();
        leer.close();

        int numeroalAzar = numAleatorio.nextInt(100);

        String nombres[] = nombre.toUpperCase().split("\\s+");

        rfc+=nombres[1].substring(0, 2);
        rfc+=nombres[2].charAt(0);
        rfc+=nombres[0].charAt(0);
        rfc+=anio.substring(2, 4);
        rfc+=mes;
        rfc+=dia;
        rfc+="H";
        rfc+=numeroalAzar;

        System.out.println("\nSu nuevo registro federal contribuyente es el siguiente: "+rfc);

    }
}
