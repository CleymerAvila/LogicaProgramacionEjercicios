import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1, numero2, numero3, promedio, suma;

        System.out.print("Ingresa el numero 1: ");
        numero1 = leer.nextInt();
        System.out.print("Ingresa el numero 2: ");
        numero2 = leer.nextInt();
        System.out.print("Ingrese el numero 3: ");
        numero3 = leer.nextInt();
        leer.close();

        promedio = (numero1 + numero2 + numero3)/3;

        suma = numero1 + numero2 + numero3;


        System.out.println("\nEl promedio de los 3 numeros es de "+ promedio);
        System.out.println("La suma de los tres numeros es de " +  suma);
        System.out.println("El doble del primer numero es "+ numero1 *2);
        System.out.println("El triple del segundo numero es "+ numero2 *3);
        System.out.println("El cuadrado del tercer numero es "+ Math.pow(numero3, 2));
    }
}
