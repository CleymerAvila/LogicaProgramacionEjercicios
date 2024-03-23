import java.util.Scanner;
public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp;

        do {
            System.out.print("\nEscriba la temperatura C°: ");
            temp = sc.nextFloat();
        } while (temp < 0 || temp > 40);sc.close();

        if (temp >= 0 && temp <= 10 ) {
            System.out.println("\nMucho Frio");
        } else if (temp >= 11 && temp <= 18) {
            System.out.println("\nFrío");
        } else if (temp >= 19&& temp <= 25) {
            System.out.println("\nTemplado");
        } else if (temp >= 26 && temp <= 40) {
            System.out.println("\nCalor");
        }
    }
}
