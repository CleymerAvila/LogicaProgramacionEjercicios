import java.util.Scanner;

public class Ejercicio218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de numeros que se leeran por teclado");
        int cantNumeros = sc.nextInt();

        //System.out.println();
        int sumNumeros=0;
        int num;
        for (int i = 1; i <= cantNumeros ; i++) {
            do {
                System.out.println("Ingrese el numero "+i);
                num = sc.nextInt();
            } while (num<0 || num % 2 != 0);
            sumNumeros+=num;
        }

        System.out.println("La suma de los numeros es: "+sumNumeros);
    }
}
