import java.util.Scanner;

public class Ejercicio225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el lado: ");
        int lado = Math.abs(sc.nextInt());

        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }

        for (int j = 0; j < (lado/2); j++) {
            System.out.print("\n*");
            for (int i = 0; i < lado-2; i++) {
                System.out.print(" ");

            }
            System.out.print("*");
        }

        System.out.println();
        for (int i = 0; i < lado; i++) {
            System.out.print("*");

        }
    }
}
