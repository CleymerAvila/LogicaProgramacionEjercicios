import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para verificar si es par o impar");
        System.out.print("\nNumero: ");
        numero = sc.nextInt();
        sc.close();

        if (numero % 2 ==  0) {
            System.out.println("\nEL numero ingresado "+ numero+ " es un numero PAR");
        } else {
            System.out.println("\nEL numero ingresado "+ numero+ " es un numero IMPAR");
        }
    }
}
