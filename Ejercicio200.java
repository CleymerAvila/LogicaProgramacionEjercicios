import java.util.Scanner;

/**
 *  Una persona desea invertir su capital en un banco y desea saber cuanto de
 *  dinero ganara después de 2 meses si el banco paga a razón de 1.5% mensual y no
 *  se hace ningún retiro.
 */

public class Ejercicio200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el capital invertido en el banco");
        double capitalInvertido = sc.nextDouble();

        // Podemos usar la formula del interes compuestos A = P(1+r)^n
        // A es el monto acomulado de la inversion
        // P es el capital invertido durante un tiempo (En este caso dos meses)
        // r es la tasa de interes la cual es 1.5 mensual
        // Y n es el periodo del prestamo

        double TASA_INTERES_MENSUAL = 0.015;
        int meses=2;
        double montoAcumulado = capitalInvertido * Math.pow(1+ TASA_INTERES_MENSUAL, meses);

        System.out.printf("\n%s %.2f %s ","El monto ganado de la inversion durante dos meses en el banco \nes ",montoAcumulado," con una tasa de interes del 1.5% mensual.");
    }
}
