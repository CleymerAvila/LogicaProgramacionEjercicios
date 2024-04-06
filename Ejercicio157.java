import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre en MAYUSCULA");
        String nombreMayuscula = entrada.next();
        entrada.close();

        if (nombreMayuscula.charAt(0)=='A') {
            System.out.println("Nombre en Miniscula: "+nombreMayuscula.toLowerCase());
        } else {
            System.out.println("La primera letra de su nombre no es 'A'");
            System.out.println("Nombre ingresado: "+nombreMayuscula);
        }
    }
}
