import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String saludo = "Hola que tal ";
        String nombre;

        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.next(); entrada.close();

        System.out.println("\n"+saludo+nombre);
        
    }
}
