import java.util.Scanner;

public class Ejercicio159 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero para comprobar si es primo");
        System.out.print("Numero: "); int numero = entrada.nextInt(); entrada.close();

        if (verificarPrimo(numero)) {
            System.out.println("El numero ingresado "+numero+ " es primo");
        } else {
            System.out.println("El numero ingresado "+numero+" no es primo");
        }
    }

    public static boolean verificarPrimo(int numero){
        if (numero<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {

            if (numero % i ==0) {
                return false;
            } 
        }

        return true;
    }
}
