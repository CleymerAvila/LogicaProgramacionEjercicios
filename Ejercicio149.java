
import java.util.Random;
import java.util.Scanner;
public class Ejercicio149 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int intentos=0;
        int numIngresado;

        int numeroAleatorio = aleatorio.nextInt(100); 
        System.out.println("--------Adivine el numero------");
        do {
            System.out.println("Ingresa un numero entre 1 - 100");
            numIngresado = entrada.nextInt();
            intentos++;
            if (numIngresado > numeroAleatorio) {
                System.out.println("EL numero digitado es mayor");
            } else if (numIngresado < numeroAleatorio) {
                System.out.println("El numero digitado es menor");
            } else {
                System.out.println("\nEl numero ha sido adivinado te ha tomado "+ intentos + " intentos");
            }
        } while (numIngresado!=numeroAleatorio); entrada.close();

        
    }
}
