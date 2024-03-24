import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantNumerosLeidos=-1;
        int numIngr;

        do {
            System.out.println("Ingreso de numeros");
            numIngr = sc.nextInt();
            cantNumerosLeidos++;
        } while (numIngr != 0);sc.close();

        System.out.println("\nLa cantidad de numero leidos antes de 0 fue: "+cantNumerosLeidos);
    }
}
