import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaMiniscula1, cadenaMiniscula2;

        System.out.println("Ingrese dos cadenas minusculas para comprobar si son iguales:");
        System.out.print("Cadena 1: "); cadenaMiniscula1 = entrada.nextLine();
        System.out.print("Cadena 2: ");  cadenaMiniscula2 = entrada.nextLine();
        entrada.close();

        if (cadenaMiniscula1.toUpperCase().equals(cadenaMiniscula2.toUpperCase())) {
            System.out.println("\nLas cadenas ingresadas son iguales");
        } else {
            System.out.println("\nLas cadenas ingresada no son iguales");
        }
    }
}
