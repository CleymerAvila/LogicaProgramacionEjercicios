import java.math.BigInteger;
public class Ejercicio116 {
    public static void main(String[] args) {
        int sumEnterosPares=0; 
        BigInteger multEnterosNones=BigInteger.ONE;

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sumEnterosPares += i;
            }
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                multEnterosNones = multEnterosNones.multiply(BigInteger.valueOf(i));
            }
        }

        System.out.println("\nLa suma de los enteros pares desde 1 hasta 1000 es: "+sumEnterosPares);
        System.out.println("La multiplicacion de enteros nones del 1 hasta 50: "+multEnterosNones);
    }
}
