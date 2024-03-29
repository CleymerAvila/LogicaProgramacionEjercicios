import java.util.Scanner;

public class Ejercicio139 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numIngr, factorial;
        int contador=0;
        do {
            if (contador>0) {
                System.out.println("El numero debe ser un entero positivo, ingrese de nuevo");
            }
            System.out.println("Ingresa un numero para verficar su factorial: ");
            System.out.print("Numero: ");
            numIngr = entrada.nextInt();
            contador++;
        } while (numIngr<=0); entrada.close();

        factorial=1;
        for (int i = 2; i <= numIngr; i++) {
            factorial*=i;
        }

        System.out.println("\nEl factorial de "+ numIngr + " es "+ factorial);
    }
}
