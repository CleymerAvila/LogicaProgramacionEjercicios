import java.util.Scanner;
public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumoIngresado;

        do {
            System.out.println("Ingrese el consumo en Kw de la termoelectrica manta " +
            "para calcular la eficiencia energetica de esta:");
            System.out.print("- ");
            consumoIngresado = sc.nextDouble();
        } while (consumoIngresado <= 0);

        if (consumoIngresado >= 8000 && consumoIngresado <= 10000){
            System.out.println("\nCONSUMO MEDIO");
        } else if (consumoIngresado > 10000){
            System.out.println("\nALTO CONSUMO DE ENERGIA");
        } else {
            System.out.println("\nCONSUMO BAJO");
        }
    }
}
