import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerodado;
        System.out.print("Ingrese un numero: ");
        numerodado = leer.nextInt();
        leer.close();

        if (numerodado > 0) {
            System.out.println("El numero ingresado " + numerodado + " es un numero positivo");
        } else if (numerodado < 0) {
            System.out.println("El numero ingresado " + numerodado + " es un numero negativo");
        } else {
            System.out.println("El numero ingresado no es positivo ni negativo");
        }
    }
}
