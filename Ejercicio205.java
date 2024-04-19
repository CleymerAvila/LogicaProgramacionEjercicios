import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CONVERSION_BOLIVIANO_A_DOLAR = 0.14;

        System.out.println("Ingrese los bolivianos a convertir a dolares");
        double bolivianos = sc.nextDouble();

        double dolares = bolivianos * CONVERSION_BOLIVIANO_A_DOLAR;

        System.out.printf("\n%s %.2f", "Los bolivianos ingresados son equivalentes en dolares a ",dolares);
    }
}
