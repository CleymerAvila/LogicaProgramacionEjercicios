import java.util.Scanner;

public class Ejercicio207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos valores reales");
        System.out.print("Valor 1: "); double valorReal1 = sc.nextDouble();
        System.out.print("Valor 2: "); double valorReal2 = sc.nextDouble();

        double suma = valorReal1+valorReal2;
        double resta = valorReal1 - valorReal2;
        double multiplicacion = valorReal1 * valorReal2;
        double division = valorReal1 / valorReal2;

        System.out.println("\nsuma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + String.format("%.3f",division ));
    }
}
