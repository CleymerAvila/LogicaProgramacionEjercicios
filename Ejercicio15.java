import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Ingresa la edad de la persona: ");
            edad = leer.nextInt();
        } while (edad <= 0);
        leer.close();
        

        if (edad >= 18 ) {
            System.out.println("La Persona es mayor de edad");

        } else {
            System.out.println("La Persona es menor de edad");
        }
    }
}
