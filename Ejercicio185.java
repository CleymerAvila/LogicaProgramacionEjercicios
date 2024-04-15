import java.util.Random;
import java.util.Scanner;


public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numAleatorio = new Random();
        String curp="";

        System.out.println("Ingrese su nombre completo: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el dia mes y año de nacimiento");
        System.out.print("Dia: "); String dia = leer.next();
        System.out.print("Mes: "); String mes = leer.next();
        System.out.print("Año: "); String anio = leer.next();

        System.out.println("Sexo Masculino (M) Femenino (F)");
        String sexo = leer.next();

        leer.close();

        int numeroalAzar = numAleatorio.nextInt(100);

        String nombres[] = nombre.toUpperCase().split("\\s+");

        curp+=nombres[1].substring(0, 2);
        curp+=nombres[2].charAt(0);
        curp+=nombres[0].charAt(0);
        curp+=anio.substring(2, 4);
        curp+=mes;
        curp+=dia;
        curp+=sexo;
        curp+="H";
        curp+=numeroalAzar;

        System.out.println("\nSu Clave Única de Registro de Población: "+curp); 
    }
}
