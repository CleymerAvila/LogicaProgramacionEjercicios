import java.util.Scanner;

/**
 * 181. Programa que me permita calcular si un número dado por el usuario es un
    número perfecto (un número es perfecto, cuando la suma de sus divisores, sin
    incluirlo al número es exactamente el mismo número). El 6 es un número perfecto
    porque sus divisores son 1,2 y 3.

 */

public class Ejercicio181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumDivisores=0;
        String divisores="";

        System.out.println("Ingrese un numero para verificar si es un numero perfecto: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num*num ; i++) {
            if (num % i == 0) {
                if (i==num) {
                    continue;
                }
                sumDivisores+=i;
                divisores+=" + "+ i;
            }

        } scanner.close();

        if (sumDivisores == num) {
            System.out.println("\nEl numero ingresado es perfecto:");
            System.out.println("\n"+divisores +" = "+ sumDivisores);
        } else {
            System.out.println("\nEl numero ingresado no es perfecto ya que la suma\nde los divisores sin incluir el mismo\nnumero no es igual al numero ingresado:");
            System.out.println("\n"+divisores+ " = "+sumDivisores);
        }

        
    }
}
