import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primeraCadena, segundaCadena;

        System.out.println("Ingresa dos cadenas para comprobar cual es mayor alfabeticamente");
        System.out.print("Primera cadena de caracteres: "); primeraCadena = entrada.nextLine();
        System.out.print("Segunda cadena de caracteres: "); segundaCadena = entrada.nextLine();
        entrada.close();

        if (primeraCadena.compareTo(segundaCadena)>0) {
            System.out.println("La primera cadena: "+primeraCadena+ " es mayor alfabéticamemte");
        } else if (primeraCadena.compareTo(segundaCadena)<0) {
            System.out.println("La segunda cadena: "+segundaCadena+ " es mayor alfabéticamemte");
        } else {
            System.out.println("Ambas cadenas son iguales alfabéticamente");
        }
        
    }
}
