import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double CONVERSION_DOLAR_A_BOLIVIANO = 6.96;

        System.out.println("Ingrese los dolares a convertir a boliviano");
        double dolares = sc.nextDouble();

        double bolivianos = dolares * CONVERSION_DOLAR_A_BOLIVIANO;

        System.out.println("\nLos "+dolares+" dolares son equivalentes a "+bolivianos+ " bolivianos");
    }
}
