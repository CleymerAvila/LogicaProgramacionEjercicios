import java.util.Scanner;
public class Ejercicio96 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String frase;
        String [] palabras;

        System.out.println("Ingrese una frase para obtener las palabras y cuentas letras tienen");
        frase = sc.nextLine();

        palabras = calcularPalabras(frase);
        System.out.println("\n-----------------------------------");
        System.out.printf("%-15s %10s\n","Palabras","Numero de letras");
        System.out.println("-----------------------------------");
        for (String palabra : palabras) {
            System.out.printf("%-15s %10s\n", palabra, palabra.length());
        }
        System.out.println("---------------------------------");
    }

    public static String [] calcularPalabras(String frase){
        return frase.split("[\\s,.:;!?]+");
    }
}
